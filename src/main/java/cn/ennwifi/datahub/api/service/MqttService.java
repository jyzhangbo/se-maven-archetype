package cn.ennwifi.datahub.api.service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.nutz.lang.random.R;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ennwifi.datahub.api.configure.ApplicationProperties;

/**
 * @author zhangbo
 *
 */
public class MqttService {

  private static final Logger LOG = Logger.getLogger("MQTT-SERVICE");

  @Autowired
  private ApplicationProperties applicationProperties;

  /** The client. */
  private MqttAsyncClient client;

  /** The options. */
  private MqttConnectOptions options;

  /** The message. */
  private MqttMessage message;


  /**
   * 构造后执行一次.
   * 
   * @throws MqttException exception
   */
  @PostConstruct
  public void createExecuteOnce() throws MqttException {
    // 创建MqttClient对象
    client = new MqttAsyncClient(applicationProperties.getMqttUrl(), "iot/api/" + R.UU16(), new MemoryPersistence());
    LOG.info("MQTT建立连接@" + applicationProperties.getMqttUrl());

    options = new MqttConnectOptions();

    options.setUserName("se-api");
    options.setPassword("se-api".toCharArray());
    options.setCleanSession(true);
    // 设置超时时间
    options.setConnectionTimeout(10);
    // 设置会话心跳时间
    options.setKeepAliveInterval(60);

    client.setCallback(new MqttCallback() {

      @Override
      public void connectionLost(Throwable arg0) {
        // 连接丢失后，一般在这里面进行重连
        LOG.info("连接断开" + arg0.getMessage());
        try {
          // MqttClient连接//等待连接
          client.connect(options).waitForCompletion();

        } catch (Exception e) {
          e.printStackTrace();
        }
      }

      @Override
      public void deliveryComplete(IMqttDeliveryToken arg0) {}

      @Override
      public void messageArrived(String topic, MqttMessage message) {
        // subscribe后得到的消息会执行到这里面
        LOG.info("接收消息主题:" + topic);
        LOG.info("接收消息Qos:" + message.getQos());
        String messageListen = new String(message.getPayload());
        LOG.info("接收消息内容:" + messageListen);

      }

    });
    // MqttClient连接//等待连接
    client.connect(options).waitForCompletion();

  }

  /**
   * Publish.
   *
   * @param topic the topic
   * @param msg the msg
   * @return true, if successful
   */
  public boolean publish(String topic, String msg) {
    return publish(topic, msg, 1, false);
  }

  /**
   * Publish.
   *
   * @param topic the topic
   * @param msg the msg
   * @param val the i
   * @param retain the retain
   * @return true, if successful
   */
  public boolean publish(String topic, String msg, Integer val, boolean retain) {

    LOG.info(topic + "@" + msg);
    try {
      if (!client.isConnected()) {
        client.connect(options).waitForCompletion();;
      }

      // 创建MQTT的消息体
      message = new MqttMessage();
      // 设置消息传输的类型
      message.setQos(val);
      // 设置是否在服务器中保存消息体
      message.setRetained(retain);
      // 设置消息的内容
      message.setPayload(msg.getBytes());

      // 创建MQTT相关的主题,发送消息并获取回执
      // 异步发送消息，本线程返回
      client.publish(topic, message);

    } catch (Exception e) {
      LOG.info(e.getMessage());
      return false;
    }
    return true;
  }

  /*----------------------------------订阅消息-----------------------------------------------*/

  /**
   * 启动订阅.
   */
  public void subscribe() {
    new Thread() {
      @Override
      public void run() {
        try {
          subscribeEnn();
        } catch (Exception e) {
          LOG.info("subscribe error: " + e.getMessage());
        }
      }
    }.start();
  }

  /**
   * 订阅上传数据.
   * 
   * @throws MqttException
   */
  private boolean subscribeEnn() throws MqttException {
    String topic = "iot/api/#";
    LOG.info("subscribe topic: " + topic);
    return subscribe(topic);
  }

  /**
   * subscribe.
   *
   * @param topic the topic
   * @return true, if successful
   */
  public boolean subscribe(String topic) throws MqttException {
    try {
      if (!client.isConnected()) {
        client.connect(options).waitForCompletion();;
      }

      client.subscribe(topic, 2);
    } catch (Exception e) {
      LOG.info(e.getMessage());
      return false;
    }
    return true;
  }

  /**
   * 取消订阅上传数据.
   * 
   * @throws MqttException
   */
  public void unsubscribe() {
    String topic = "iot/api/#";
    try {
      LOG.info("unsubscribe topic: " + topic);
      client.unsubscribe(topic);
    } catch (MqttException e) {
      e.printStackTrace();
    }
  }

}
