package cn.ennwifi.datahub.api.service;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.CuratorFrameworkFactory.Builder;
import org.apache.curator.framework.recipes.leader.LeaderSelector;
import org.apache.curator.framework.recipes.leader.LeaderSelectorListener;
import org.apache.curator.framework.recipes.leader.LeaderSelectorListenerAdapter;
import org.apache.curator.framework.state.ConnectionState;
import org.apache.curator.framework.state.ConnectionStateListener;
import org.apache.curator.retry.RetryNTimes;
import org.apache.zookeeper.CreateMode;
import org.nutz.lang.random.R;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ennwifi.datahub.api.configure.ApplicationProperties;
import cn.ennwifi.datahub.api.content.dynamic.DynamicConfigure;
import cn.ennwifi.datahub.api.content.dynamic.Leader;
import cn.ennwifi.datahub.api.service.model.ServerInfoChangeWatcher;

/**
 * @author zhangbo
 *
 */
public class ZookeeperService implements ConnectionStateListener, Observer {

  private static final Logger LOG = Logger.getLogger("ZOOKEEPER-SERVICE");

  @Autowired
  private ApplicationProperties applicationProperties;

  @Autowired
  private MqttService mqttService;

  /** The Constant NAMESPACE. */
  private static final String NAMESPACE = "SE-API";

  /** The client. */
  private CuratorFramework client;

  /** 选举器. */
  private LeaderSelector leaderSelector;

  /**
   * zookeeper节点监听器.
   */
  private ServerInfoChangeWatcher serverWatcher;

  /**
   * 初始化.
   */
  @PostConstruct
  public void initialize() {
    connect();
  }

  /**
   * 建立ZOOKEEPER的连接.
   */
  private void connect() {

    // 重试300次 每次间隔5秒
    RetryPolicy retryPolicy = new RetryNTimes(3000, 5000);
    String conString = applicationProperties.getZookeeperUrl();
    Builder builder = CuratorFrameworkFactory.builder().connectString(conString).connectionTimeoutMs(10000)
        .sessionTimeoutMs(10000).retryPolicy(retryPolicy).namespace(NAMESPACE);

    client = builder.build();

    // 添加client重新连接监听器
    client.getConnectionStateListenable().addListener(this);

    client.start();
    try {
      client.blockUntilConnected();
      client.createContainers(NAMESPACE);
    } catch (Exception e) {
      LOG.info("不能连接 ZOOKEEPER 服务器");
    }

    // 注册临时路径
    register();

    // 选举主服务器
    selectMaster("/master-test", DynamicConfigure.get().getLeader());

    // 设置启动时间
    DynamicConfigure.get().setStartTime(System.currentTimeMillis());

  }

  /**
   * 注册临时路径.
   */
  public void register() {
    try {
      client.create().withMode(CreateMode.EPHEMERAL).forPath("/servers/api" + R.UU16(),
          String.valueOf(System.currentTimeMillis()).getBytes());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Select master.
   *
   * @param path the path
   * @param leader
   * @param onLeader the on leader
   */
  public void selectMaster(String path, final Leader leader) {
    LeaderSelectorListener listener = new LeaderSelectorListenerAdapter() {
      @Override
      public void takeLeadership(CuratorFramework client) throws Exception {
        LOG.info("成为主服务器");

        // 启动mqtt监听
        mqttService.subscribe();

        if (leader != null) {
          leader.onLeader();
        }
        LOG.info("退出主服务器");
      }
    };
    leaderSelector = new LeaderSelector(client, path, listener);
    leaderSelector.autoRequeue();
    leaderSelector.start();
  }

  /**
   * On dispose.
   */
  @PreDestroy
  void onDispose() {
    client.close();
    leaderSelector.close();
  }

  @Override
  public void stateChanged(CuratorFramework client, ConnectionState newState) {
    switch (newState) {
      case CONNECTED:
        LOG.info("Zookeeper 连接成功");
        startWatch(client);
        break;
      case LOST:
        LOG.info("Zookeeper 断开成功");
        break;
      case READ_ONLY:
        LOG.info("Zookeeper 只读连接");
        break;
      case RECONNECTED:
        LOG.info("Zookeeper 重连成功");
        startWatch(client);
        break;

      default:
        break;
    }
  }

  public void startWatch(CuratorFramework client) {

    if (serverWatcher != null) {
      serverWatcher.deleteObserver(this);
      serverWatcher.close();

    }
    serverWatcher = new ServerInfoChangeWatcher(client);
    serverWatcher.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {

    if (DynamicConfigure.get().getLeader().getIsLeader()) {
      LOG.info("让主服务器退出，重新选举");
      DynamicConfigure.get().getLeader().onQuit();
      mqttService.unsubscribe();
    }

  }


}
