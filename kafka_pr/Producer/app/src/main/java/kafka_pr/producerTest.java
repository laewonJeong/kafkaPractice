package kafka_pr;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;

public class producerTest {
    public static void main(String[] args) {
        // Kafka 설정
        Properties props = new Properties();
        props.put("bootstrap.servers", "<server-ip>:19092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        // Kafka Producer 생성
        Producer<String, String> producer = new KafkaProducer<>(props);

        // 메시지 전송
        for (int i = 0; i < 10; i++) {
            String key = "Key" + i;
            String value = "Value" + i;
            producer.send(new ProducerRecord<>("test-topic", key, value));
            System.out.println("Message sent: " + key + " : " + value);
        }

        // Producer 종료
        producer.close();
    }
}
