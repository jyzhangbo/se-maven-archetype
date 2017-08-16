package cn.ennwifi.datahub.api.service.model;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Logger;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheEvent;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheListener;

/**
 * 监听zookeeper服务器信息 . 监视一个路径下1）孩子结点的创建、2）删除，3）以及结点数据的更新。 产生的事件会传递给注册的PathChildrenCacheListener.
 * 
 * @author zhangbo
 *
 */
public class ServerInfoChangeWatcher extends Observable implements PathChildrenCacheListener {

  private static final Logger LOG = Logger.getLogger("ZOOKEEPER-SERVICE");

  private CuratorFramework client;

  private PathChildrenCache cache;

  public ServerInfoChangeWatcher() {

  }

  public ServerInfoChangeWatcher(CuratorFramework curatorFramework) {
    client = curatorFramework;
    cache = new PathChildrenCache(client, "/servers", true);
    cache.getListenable().addListener(this);
    try {
      LOG.info("监听zookeeper节点信息发生变化 ");
      cache.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void childEvent(CuratorFramework curatorFramework, PathChildrenCacheEvent pathChildrenCacheEvent)
      throws Exception {
    switch (pathChildrenCacheEvent.getType()) {
      // 子节点的事件类型
      case CHILD_ADDED:
        break;
      case CHILD_REMOVED:
        break;
      case CHILD_UPDATED:
        break;
      case INITIALIZED:
        break;
      default:
        break;
    }

    // 通知监听着执行update方法
    setChanged();
    notifyObservers();

  }

  /**
   * Close.
   */
  public void close() {
    try {
      cache.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
