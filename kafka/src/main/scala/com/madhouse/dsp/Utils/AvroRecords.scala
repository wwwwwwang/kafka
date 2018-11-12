package com.madhouse.dsp.Utils

import java.io.ByteArrayOutputStream

import com.madhouse.dsp.Utils.Constants._
import com.madhouse.dsp.avro._
import org.apache.avro.Schema
import org.apache.avro.generic.GenericData.Record
import org.apache.avro.generic.GenericRecord
import org.apache.avro.io.EncoderFactory
import org.apache.avro.reflect.ReflectDatumWriter

import scala.collection.mutable

/**
  * Created by Madhouse on 2017/12/29.
  */
object AvroRecords {

  def randomGet[T](a: Array[T]): T = {
    val n = (new util.Random).nextInt(a.length)
    a(n)
  }

  def serialize(r: Record, schema: Schema): ByteArrayOutputStream = {
    val writer = new ReflectDatumWriter[GenericRecord](schema)
    val out = new ByteArrayOutputStream()
    val encoder = EncoderFactory.get().binaryEncoder(out, null)
    writer.write(r, encoder)
    encoder.flush()
    out
  }

  def produce(logType: String, schema: Schema): Record = {
    val r = new Record(schema)
    if (logType.toLowerCase.contains("req")) {
      r.put("time", System.currentTimeMillis())
      r.put("ua", "")
      r.put("ip", "*.*.*.*")
      r.put("status", randomGet(status))
      val req = new Record(MediaRequest.getClassSchema)
      req.put("bid", "")
      req.put("mediaid", randomGet(mediaId))
      req.put("adspaceid", randomGet(adspaceId))
      req.put("category", 0)
      req.put("type", 0)
      req.put("bundle", "")
      req.put("name", "")
      req.put("adtype", 0)
      req.put("w", 120)
      req.put("h", 120)
      req.put("did", "")
      req.put("didmd5", "")
      req.put("dpid", "")
      req.put("dpidmd5", "")
      req.put("mac", "")
      req.put("macmd5", "")
      req.put("ifa", "")
      req.put("carrier", 0)
      req.put("connectiontype", 0)
      req.put("devicetype", 0)
      req.put("dealid", "")
      req.put("os", 0)
      req.put("osv", "")
      req.put("ip", "Unkown")
      req.put("ua", "")
      req.put("make", "")
      req.put("model", "")
      req.put("test", 0)
      req.put("bidtype", 1)
      req.put("bidfloor", 0)
      req.put("location", randomGet(location).toString)
      r.put("request", req)
      /*val res = new Record(MediaResponse.getClassSchema)
      res.put("bidid", "")
      res.put("projectid", randomGet(projectId))
      res.put("cid", randomGet(campaignId))
      res.put("crid", randomGet(meterialId))
      res.put("brand", "")
      res.put("layout", 0)
      res.put("price", 0)
      res.put("icon", "")
      res.put("cover", "")
      res.put("title", "")
      res.put("desc", "")
      res.put("content", "")
      res.put("duration", 0)
      res.put("dealid", "")
      res.put("lpgurl", "")
      res.put("acttype", 1)
      val mon = new Record(Monitor.getClassSchema)
      mon.put("exptime", 86400)
      res.put("monitor", mon)
      r.put("response", res)*/
    } else {
      r.put("time", System.currentTimeMillis())
      r.put("ua", "")
      r.put("ip", "*.*.*.*")
      r.put("args", "")
      r.put("status", 0)
      r.put("bid", "")
      r.put("bidid", "")
      r.put("mediaid", randomGet(mediaId))
      r.put("adspaceid", randomGet(adspaceId))
      r.put("projectid", randomGet(projectId))
      r.put("cid", randomGet(campaignId))
      r.put("crid", randomGet(meterialId))
      r.put("invalid", randomGet(invalid))
      r.put("income", randomGet(income))
      r.put("cost", randomGet(cost))
      r.put("location", "")
    }
    println(s"#####r.toString= ${r.toString.replaceAll(", \"response\": null","")}")
    r
  }

  def create(logType: String, count: Int): mutable.Buffer[Array[Byte]] = {
    val res = mutable.Buffer[Array[Byte]]()
    val schema = logType match {
      case "request" | "req" => MediaBid.getClassSchema
      case "imp" => ImpressionTrack.getClassSchema
      case "clk" => ClickTrack.getClassSchema
      case _ => ImpressionTrack.getClassSchema
    }
    for (i <- 0 until count) {
      val r = produce(logType, schema)
      val serializedBytes = serialize(r, schema).toByteArray
      res += serializedBytes
    }
    res
  }
}
