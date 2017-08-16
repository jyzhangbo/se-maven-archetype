package cn.ennwifi.datahub.api.service;

import java.util.Properties;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ennwifi.datahub.api.configure.ApplicationProperties;



/**
 * @author zhangbo
 *
 */
public class KafkaProducerService implements Callback {

  private static final Logger LOG = Logger.getLogger("KAFKA-SERVICE");

  private static final Properties props = new Properties();

  private static Producer<String, String> producer;

  @Autowired
  private ApplicationProperties applicationProperties;


  /**
   * 构造函数中配置kafka信息.
   */
  @PostConstruct
  public void init() {
    props.put("bootstrap.servers", getUrl());
    // leader收到的来自所有follower复制成功的确认数量,acks=0时只要消息被立即发送到socket buffer中，就认为发送成功,retries（失败重试） 配置也会失效
    props.put("acks", "0");
    props.put("retries", 0);
    props.put("batch.size", 16384);
    props.put("linger.ms", 1);
    props.put("buffer.memory", 33554432);
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    producer = new KafkaProducer<>(props);

    LOG.info("KAFKA建立连接@" + getUrl());
  }

  public void produceData(String topic, String reqData) {
    LOG.info("KAFKA保存数据:topic=" + topic + ";数据=" + reqData);
    producer.send(new ProducerRecord<>(topic, reqData), this);
  }

  /**
   * 获取kafka地址.
   * 
   * @return
   */
  private String getUrl() {
    return applicationProperties.getKafkaUrl();
  }

  @Override
  public void onCompletion(RecordMetadata metadata, Exception exception) {
    if (exception != null) {
      LOG.info("send kafka error " + exception.getMessage());
    } else {
      LOG.info("send to " + metadata.topic() + " successed ");
    }

  }
}
