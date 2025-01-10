# Producer/Consumer 실습
![image](https://github.com/user-attachments/assets/c2d883ea-5494-48d3-a556-8affffd4c2af)

## Topic 생성
```bash
$ bin/kafka-topics.sh --create --topic test-topic --bootstrap-server <broker ip>:9092 --partitions <num> --replication-factor <num>

# ex) bin/kafka-topics.sh --create --topic test-topic --bootstrap-server 0.0.0.0:9092 --partitions 3 --replication-factor 3
```


## 수정
### producerTest.java
```java
props.put("bootstrap.servers", "<서버 IP>:9092");
```
<서버 IP> 수정
### consumerTest.java
```java
props.put("bootstrap.servers", "<서버 IP>:9092");
```
<서버 IP> 수정


## 실행
```bash
./gradlew run
```
