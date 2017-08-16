package cn.ennwifi.datahub.api.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 应用程序配置信息.
 * 
 * @author zhangbo
 *
 */
@ConfigurationProperties(prefix = "api")
public class ApplicationProperties {

  /**
   * 应用程序名称.
   */
  private String title = "智能能源-API";

  /**
   * opentsdb请求的url.
   */
  private String opentsdbUrl;

  /**
   * kafka地址.
   */
  private String kafkaUrl;

  /**
   * mqtt地址.
   */
  private String mqttUrl;

  /**
   * zookeeper地址.
   */
  private String zookeeperUrl;

  /**
   * 发送短信.
   */
  private String smsUrl;


  /**
   * @return the smsUrl
   */
  public String getSmsUrl() {
    return smsUrl;
  }

  /**
   * @param smsUrl the smsUrl to set
   */
  public void setSmsUrl(String smsUrl) {
    this.smsUrl = smsUrl;
  }

  /**
   * @return the zookeeperUrl
   */
  public String getZookeeperUrl() {
    return zookeeperUrl;
  }

  /**
   * @param zookeeperUrl the zookeeperUrl to set
   */
  public void setZookeeperUrl(String zookeeperUrl) {
    this.zookeeperUrl = zookeeperUrl;
  }

  /**
   * @return the mqttUrl
   */
  public String getMqttUrl() {
    return mqttUrl;
  }

  /**
   * @param mqttUrl the mqttUrl to set
   */
  public void setMqttUrl(String mqttUrl) {
    this.mqttUrl = mqttUrl;
  }

  /**
   * @return the kafkaUrl
   */
  public String getKafkaUrl() {
    return kafkaUrl;
  }

  /**
   * @param kafkaUrl the kafkaUrl to set
   */
  public void setKafkaUrl(String kafkaUrl) {
    this.kafkaUrl = kafkaUrl;
  }

  /**
   * @return the opentsdbUrl
   */
  public String getOpentsdbUrl() {
    return opentsdbUrl;
  }

  /**
   * @param opentsdbUrl the opentsdbUrl to set
   */
  public void setOpentsdbUrl(String opentsdbUrl) {
    this.opentsdbUrl = opentsdbUrl;
  }

  /**
   * 获取标题.
   * 
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * 设置标题.
   * 
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }


}
