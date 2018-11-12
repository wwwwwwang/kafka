package com.datageek;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class SaveLogClient {
    private static Logger log = Logger.getLogger(SaveLogClient.class);
    private static Producer<String, String> producer;

    public SaveLogClient(String brokersList){
        init(brokersList);
    }

    private void init(String brokersList) {
        Properties props = new Properties();
        props.put("bootstrap.servers", brokersList);
        //"172.31.18.12:9092,172.31.18.13:9092,172.31.18.14:9092"
        //props.put("acks", "all");
        //props.put("retries", 0);
        //props.put("batch.size", 16384);
        //props.put("linger.ms", 1);
        //props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        producer = new KafkaProducer(props);
        log.info("producer has been initialized!");
    }

    private static String longToDate(long time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //MM/dd/yyyy HH:mm:ss
        Date dt = new Date(time);
        return sdf.format(dt);
    }

    private String makeString(String type, String id, String message) {
        String pid = "no having";
        if (!id.trim().equalsIgnoreCase("") && id != null) {
            pid = id;
        }
        long nowTime = System.currentTimeMillis();
        return "{\"id\":\"" + pid + "\",\"type\":\"" + type
                + "\",\"time_stamp\":\"" + nowTime
                + "\",\"date\":\"" + longToDate(nowTime)
                + "\",\"message\":\"" + message + "\"}";
    }

    public void write(String topic, String type, String raw) {
        write(topic, type, "", raw);
    }

    public void write(String topic, String type, String id, String raw) {
        String message = makeString(type, id, raw);
        log.info("The message is ready!\nmessage = " + message);
        producer.send(new ProducerRecord<String, String>(topic, message));
    }

    public void close() {
        producer.close();
    }

    public static void main(String[] args) {
        String brokersList = "172.31.18.12:9092,172.31.18.13:9092,172.31.18.14:9092";
        SaveLogClient savelog = new SaveLogClient(brokersList);
        String type = "test";
        String id = "";
        String message = "Just a test ......";
        savelog.write("whsh", type, id, message);
        savelog.close();
        System.out.println("The message has been send! ");
    }
}
