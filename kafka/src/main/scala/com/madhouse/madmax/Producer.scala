package com.madhouse.madmax

import java.util.Properties

import com.madhouse.madmax.Utils.AvroRecords
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import org.apache.kafka.common.serialization.{ByteArraySerializer, StringSerializer}

/**
  * Created by Madhouse on 2017/12/29.
  */
object Producer {
  def process(logType: String, count: Int): Unit = {
    val props = new Properties()
    props.put("bootstrap.servers", "172.16.25.27:9092,172.16.25.28:9092,172.16.25.29:9092")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer")
    /*props.put("bootstrap.servers", "localhost:9092")
    props.put("acks", "all")
    props.put("retries", 0)
    props.put("batch.size", 16384)
    props.put("linger.ms", 1)
    props.put("buffer.memory", 33554432)
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")*/

    val producer = new KafkaProducer(props, new StringSerializer(), new ByteArraySerializer())
    val topic = logType match {
      case "request" | "req" => "madmax_req"
      case "imp" => "madmax_imp"
      case "clk" => "madmax_clk"
      case "winnotice" | "win" => "madmax_win"
    }

    val records = AvroRecords.create(logType, count)

    println(s"there are ${records.size} $logType records are ready to be sent to kafka topic $topic....")
    for (i <- records.indices) {
      val message = new ProducerRecord[String, Array[Byte]](topic, records(i))
      producer.send(message)
    }

    producer.close()
    println(s"sending messages is finished...")
  }

  def main(args: Array[String]): Unit = {
    //val Array(t, c) = args
    val t = "clk"
    val c = 80000
    process(t, c.toInt)
  }
}
