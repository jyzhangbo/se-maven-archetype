package cn.ennwifi.datahub.api.service;

import java.util.Arrays;
import java.util.Properties;
import java.util.UUID;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

/**
 * @author zhangbo
 *
 */
public class KafkaCustomService {

  public static void main(String[] args) {
    Properties props = new Properties();
    props.put("bootstrap.servers", "10.39.0.151:9092");
    props.put("group.id", UUID.randomUUID().toString());
    // 设置自动提交偏移量
    props.put("enable.auto.commit", "false");
    // 控制自动提交的频率
    props.put("auto.commit.interval.ms", "1000");
    props.put("session.timeout.ms", "30000");
    props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
    props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
    KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
    consumer.subscribe(Arrays.asList("enn.device.PM2125C_12_13"));

    while (true) {
      ConsumerRecords<String, String> records = consumer.poll(100);
      for (ConsumerRecord<String, String> record : records)
        System.out.printf("offset = %d,value = %s\n", record.offset(), record.value());
    }

  }

  public static void producer() {
    Properties props = new Properties();
    props.put("bootstrap.servers", "10.39.0.151:9092");
    props.put("acks", "all");
    props.put("retries", 0);
    props.put("batch.size", 16384);
    props.put("linger.ms", 1);
    props.put("buffer.memory", 33554432);
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

    Producer<String, String> producer = new KafkaProducer<>(props);
    for (int i = 0; i < 100; i++)
      producer.send(new ProducerRecord<String, String>("MOd", Integer.toString(i), Integer.toString(i)));

    producer.close();
  }

  public static void consumer() {

  }

}
