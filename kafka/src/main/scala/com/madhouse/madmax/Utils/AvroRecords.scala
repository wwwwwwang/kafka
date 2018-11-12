package com.madhouse.madmax.Utils

import java.io.ByteArrayOutputStream

import com.madhouse.madmax.Utils.Constants._
import com.madhouse.madmax.avro._
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

  def produce(logType: String, schema: Schema, i: Int): Record = {
    val r = new Record(schema)
    if (logType.toLowerCase.contains("req")) {
      r.put("status", randomGet(status))
      r.put("ip", "*.*.*.*")
      r.put("impid", s"imp_$i")
      r.put("ts", System.currentTimeMillis())
      //r.put("ua", "")
      val req = new Record(MediaRequest.getClassSchema)
      req.put("bid", "")
      req.put("sspid", randomGet(sspId))
      req.put("mediaid", randomGet(mediaId))
      req.put("adspaceid", randomGet(adspaceId))
      req.put("adtype", 0)
      req.put("pkgname", "")
      req.put("appname", "")
      req.put("connectiontype", 0)
      req.put("carrier", 0)
      req.put("os", 0)
      req.put("osv", "")
      req.put("did", "")
      req.put("didmd5", "")
      req.put("dpid", "")
      req.put("dpidmd5", "")
      req.put("mac", "")
      req.put("macmd5", "")
      req.put("ifa", "")
      req.put("device", "")
      req.put("devicetype", 0)
      req.put("ua", "")
      req.put("ip", "Unkown")
      req.put("location", randomGet(location).toString)
      req.put("w", 120)
      req.put("h", 120)
      req.put("pid", "")
      req.put("pcat", "")
      req.put("media", "")
      req.put("density", "")
      req.put("dealid", "")
      req.put("mcell", "")
      req.put("label", "")
      req.put("lat", "")
      req.put("lon", "")
      req.put("make", "")
      req.put("model", "")
      req.put("test", 0)
      req.put("bidtype", 1)
      req.put("bidfloor", 0)
      r.put("request", req)

      val res = new Record(MediaResponse.getClassSchema)
      //res.put("bidid", "")
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
      //res.put("adm", null)
      res.put("dealid", "")
      res.put("lpgurl", "")
      val mon = new Record(Monitor.getClassSchema)
      mon.put("exptime", 86400)
      res.put("monitor", mon)
      r.put("response", res)
    } else if (logType.toLowerCase.contains("imp")) {
      r.put("impid", s"imp_$i")
      r.put("bid", "")
      r.put("sspid", randomGet(sspId))
      r.put("mediaid", randomGet(mediaId))
      r.put("adspaceid", randomGet(adspaceId))
      r.put("projectid", randomGet(projectId))
      r.put("cid", randomGet(campaignId))
      r.put("crid", randomGet(meterialId))
      r.put("dealid", "")
      r.put("os", 0)
      r.put("osv", "")
      r.put("carrier", 0)
      r.put("connectiontype", 0)
      r.put("income", randomGet(income))
      r.put("cost", randomGet(cost))
      r.put("ip", "*.*.*.*")
      r.put("location", randomGet(location).toString)
      r.put("deviceid", "")
      r.put("cookieid", "")
      r.put("bidts", 0L)
      r.put("ts", System.currentTimeMillis())
      r.put("status", 0)
      r.put("invalidtype", randomGet(invalid))
    } else if (logType.toLowerCase.contains("clk")) {
      r.put("impid", s"imp_$i}")
      r.put("bid", "")
      r.put("sspid", randomGet(sspId))
      r.put("mediaid", randomGet(mediaId))
      r.put("adspaceid", randomGet(adspaceId))
      r.put("projectid", randomGet(projectId))
      r.put("cid", randomGet(campaignId))
      r.put("crid", randomGet(meterialId))
      r.put("dealid", "")
      r.put("os", 0)
      r.put("osv", "")
      r.put("carrier", 0)
      r.put("connectiontype", 0)
      r.put("income", randomGet(income))
      r.put("cost", randomGet(cost))
      r.put("ip", "*.*.*.*")
      r.put("location", randomGet(location).toString)
      r.put("deviceid", "")
      r.put("cookieid", "")
      r.put("lpgurl", "")
      r.put("bidts", 0L)
      r.put("ts", System.currentTimeMillis())
      r.put("status", 0)
      r.put("invalidtype", randomGet(invalid))
    } else { //winNotice
      r.put("ts", System.currentTimeMillis())
      r.put("ip", "*.*.*.*")
      r.put("status", 0)
      r.put("bid", "")
      r.put("impid", s"imp_$i")
      r.put("projectid", randomGet(projectId))
      r.put("cid", randomGet(campaignId))
      r.put("crid", randomGet(meterialId))
      r.put("sspid", randomGet(sspId))
      r.put("mediaid", randomGet(mediaId))
      r.put("adspaceid", randomGet(adspaceId))
      r.put("price", randomGet(income))
      r.put("bidtype", randomGet(bidType))
    }
    //println(s"#####r.toString= ${r.toString.replaceAll(", \"response\": null", "")}")
    println(s"#####r.toString= ${r.toString}")
    r
  }

  def create(logType: String, count: Int): mutable.Buffer[Array[Byte]] = {
    val res = mutable.Buffer[Array[Byte]]()
    val schema = logType match {
      case "request" | "req" => MediaBid.getClassSchema
      case "imp" => ImpressionTrack.getClassSchema
      case "clk" => ClickTrack.getClassSchema
      case "win" | "winnotice" => WinNotice.getClassSchema
      case _ => ImpressionTrack.getClassSchema
    }
    for (i <- 0 until count) {
      val r = produce(logType, schema, i)
      val serializedBytes = serialize(r, schema).toByteArray
      res += serializedBytes
    }
    res
  }
}
