/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.madhouse.madmax.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class WinNotice extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1402244058366524438L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WinNotice\",\"namespace\":\"com.madhouse.madmax.avro\",\"fields\":[{\"name\":\"ts\",\"type\":\"long\"},{\"name\":\"ip\",\"type\":\"string\"},{\"name\":\"status\",\"type\":\"int\"},{\"name\":\"bid\",\"type\":\"string\"},{\"name\":\"impid\",\"type\":\"string\"},{\"name\":\"projectid\",\"type\":\"long\"},{\"name\":\"cid\",\"type\":\"long\"},{\"name\":\"crid\",\"type\":\"long\"},{\"name\":\"sspid\",\"type\":\"long\"},{\"name\":\"mediaid\",\"type\":\"long\"},{\"name\":\"adspaceid\",\"type\":\"long\"},{\"name\":\"price\",\"type\":\"int\"},{\"name\":\"bidtype\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<WinNotice> ENCODER =
      new BinaryMessageEncoder<WinNotice>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<WinNotice> DECODER =
      new BinaryMessageDecoder<WinNotice>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<WinNotice> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<WinNotice> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<WinNotice>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this WinNotice to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a WinNotice from a ByteBuffer. */
  public static WinNotice fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long ts;
  @Deprecated public CharSequence ip;
  @Deprecated public int status;
  @Deprecated public CharSequence bid;
  @Deprecated public CharSequence impid;
  @Deprecated public long projectid;
  @Deprecated public long cid;
  @Deprecated public long crid;
  @Deprecated public long sspid;
  @Deprecated public long mediaid;
  @Deprecated public long adspaceid;
  @Deprecated public int price;
  @Deprecated public int bidtype;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public WinNotice() {}

  /**
   * All-args constructor.
   * @param ts The new value for ts
   * @param ip The new value for ip
   * @param status The new value for status
   * @param bid The new value for bid
   * @param impid The new value for impid
   * @param projectid The new value for projectid
   * @param cid The new value for cid
   * @param crid The new value for crid
   * @param sspid The new value for sspid
   * @param mediaid The new value for mediaid
   * @param adspaceid The new value for adspaceid
   * @param price The new value for price
   * @param bidtype The new value for bidtype
   */
  public WinNotice(Long ts, CharSequence ip, Integer status, CharSequence bid, CharSequence impid, Long projectid, Long cid, Long crid, Long sspid, Long mediaid, Long adspaceid, Integer price, Integer bidtype) {
    this.ts = ts;
    this.ip = ip;
    this.status = status;
    this.bid = bid;
    this.impid = impid;
    this.projectid = projectid;
    this.cid = cid;
    this.crid = crid;
    this.sspid = sspid;
    this.mediaid = mediaid;
    this.adspaceid = adspaceid;
    this.price = price;
    this.bidtype = bidtype;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return ts;
    case 1: return ip;
    case 2: return status;
    case 3: return bid;
    case 4: return impid;
    case 5: return projectid;
    case 6: return cid;
    case 7: return crid;
    case 8: return sspid;
    case 9: return mediaid;
    case 10: return adspaceid;
    case 11: return price;
    case 12: return bidtype;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: ts = (Long)value$; break;
    case 1: ip = (CharSequence)value$; break;
    case 2: status = (Integer)value$; break;
    case 3: bid = (CharSequence)value$; break;
    case 4: impid = (CharSequence)value$; break;
    case 5: projectid = (Long)value$; break;
    case 6: cid = (Long)value$; break;
    case 7: crid = (Long)value$; break;
    case 8: sspid = (Long)value$; break;
    case 9: mediaid = (Long)value$; break;
    case 10: adspaceid = (Long)value$; break;
    case 11: price = (Integer)value$; break;
    case 12: bidtype = (Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ts' field.
   * @return The value of the 'ts' field.
   */
  public Long getTs() {
    return ts;
  }

  /**
   * Sets the value of the 'ts' field.
   * @param value the value to set.
   */
  public void setTs(Long value) {
    this.ts = value;
  }

  /**
   * Gets the value of the 'ip' field.
   * @return The value of the 'ip' field.
   */
  public CharSequence getIp() {
    return ip;
  }

  /**
   * Sets the value of the 'ip' field.
   * @param value the value to set.
   */
  public void setIp(CharSequence value) {
    this.ip = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(Integer value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'bid' field.
   * @return The value of the 'bid' field.
   */
  public CharSequence getBid() {
    return bid;
  }

  /**
   * Sets the value of the 'bid' field.
   * @param value the value to set.
   */
  public void setBid(CharSequence value) {
    this.bid = value;
  }

  /**
   * Gets the value of the 'impid' field.
   * @return The value of the 'impid' field.
   */
  public CharSequence getImpid() {
    return impid;
  }

  /**
   * Sets the value of the 'impid' field.
   * @param value the value to set.
   */
  public void setImpid(CharSequence value) {
    this.impid = value;
  }

  /**
   * Gets the value of the 'projectid' field.
   * @return The value of the 'projectid' field.
   */
  public Long getProjectid() {
    return projectid;
  }

  /**
   * Sets the value of the 'projectid' field.
   * @param value the value to set.
   */
  public void setProjectid(Long value) {
    this.projectid = value;
  }

  /**
   * Gets the value of the 'cid' field.
   * @return The value of the 'cid' field.
   */
  public Long getCid() {
    return cid;
  }

  /**
   * Sets the value of the 'cid' field.
   * @param value the value to set.
   */
  public void setCid(Long value) {
    this.cid = value;
  }

  /**
   * Gets the value of the 'crid' field.
   * @return The value of the 'crid' field.
   */
  public Long getCrid() {
    return crid;
  }

  /**
   * Sets the value of the 'crid' field.
   * @param value the value to set.
   */
  public void setCrid(Long value) {
    this.crid = value;
  }

  /**
   * Gets the value of the 'sspid' field.
   * @return The value of the 'sspid' field.
   */
  public Long getSspid() {
    return sspid;
  }

  /**
   * Sets the value of the 'sspid' field.
   * @param value the value to set.
   */
  public void setSspid(Long value) {
    this.sspid = value;
  }

  /**
   * Gets the value of the 'mediaid' field.
   * @return The value of the 'mediaid' field.
   */
  public Long getMediaid() {
    return mediaid;
  }

  /**
   * Sets the value of the 'mediaid' field.
   * @param value the value to set.
   */
  public void setMediaid(Long value) {
    this.mediaid = value;
  }

  /**
   * Gets the value of the 'adspaceid' field.
   * @return The value of the 'adspaceid' field.
   */
  public Long getAdspaceid() {
    return adspaceid;
  }

  /**
   * Sets the value of the 'adspaceid' field.
   * @param value the value to set.
   */
  public void setAdspaceid(Long value) {
    this.adspaceid = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public Integer getPrice() {
    return price;
  }

  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(Integer value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'bidtype' field.
   * @return The value of the 'bidtype' field.
   */
  public Integer getBidtype() {
    return bidtype;
  }

  /**
   * Sets the value of the 'bidtype' field.
   * @param value the value to set.
   */
  public void setBidtype(Integer value) {
    this.bidtype = value;
  }

  /**
   * Creates a new WinNotice RecordBuilder.
   * @return A new WinNotice RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new WinNotice RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new WinNotice RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /**
   * Creates a new WinNotice RecordBuilder by copying an existing WinNotice instance.
   * @param other The existing instance to copy.
   * @return A new WinNotice RecordBuilder
   */
  public static Builder newBuilder(WinNotice other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for WinNotice instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WinNotice>
    implements org.apache.avro.data.RecordBuilder<WinNotice> {

    private long ts;
    private CharSequence ip;
    private int status;
    private CharSequence bid;
    private CharSequence impid;
    private long projectid;
    private long cid;
    private long crid;
    private long sspid;
    private long mediaid;
    private long adspaceid;
    private int price;
    private int bidtype;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ts)) {
        this.ts = data().deepCopy(fields()[0].schema(), other.ts);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ip)) {
        this.ip = data().deepCopy(fields()[1].schema(), other.ip);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.bid)) {
        this.bid = data().deepCopy(fields()[3].schema(), other.bid);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.impid)) {
        this.impid = data().deepCopy(fields()[4].schema(), other.impid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.projectid)) {
        this.projectid = data().deepCopy(fields()[5].schema(), other.projectid);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.cid)) {
        this.cid = data().deepCopy(fields()[6].schema(), other.cid);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.crid)) {
        this.crid = data().deepCopy(fields()[7].schema(), other.crid);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.sspid)) {
        this.sspid = data().deepCopy(fields()[8].schema(), other.sspid);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.mediaid)) {
        this.mediaid = data().deepCopy(fields()[9].schema(), other.mediaid);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.adspaceid)) {
        this.adspaceid = data().deepCopy(fields()[10].schema(), other.adspaceid);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.price)) {
        this.price = data().deepCopy(fields()[11].schema(), other.price);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.bidtype)) {
        this.bidtype = data().deepCopy(fields()[12].schema(), other.bidtype);
        fieldSetFlags()[12] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing WinNotice instance
     * @param other The existing instance to copy.
     */
    private Builder(WinNotice other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.ts)) {
        this.ts = data().deepCopy(fields()[0].schema(), other.ts);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ip)) {
        this.ip = data().deepCopy(fields()[1].schema(), other.ip);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.bid)) {
        this.bid = data().deepCopy(fields()[3].schema(), other.bid);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.impid)) {
        this.impid = data().deepCopy(fields()[4].schema(), other.impid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.projectid)) {
        this.projectid = data().deepCopy(fields()[5].schema(), other.projectid);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.cid)) {
        this.cid = data().deepCopy(fields()[6].schema(), other.cid);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.crid)) {
        this.crid = data().deepCopy(fields()[7].schema(), other.crid);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.sspid)) {
        this.sspid = data().deepCopy(fields()[8].schema(), other.sspid);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.mediaid)) {
        this.mediaid = data().deepCopy(fields()[9].schema(), other.mediaid);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.adspaceid)) {
        this.adspaceid = data().deepCopy(fields()[10].schema(), other.adspaceid);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.price)) {
        this.price = data().deepCopy(fields()[11].schema(), other.price);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.bidtype)) {
        this.bidtype = data().deepCopy(fields()[12].schema(), other.bidtype);
        fieldSetFlags()[12] = true;
      }
    }

    /**
      * Gets the value of the 'ts' field.
      * @return The value.
      */
    public Long getTs() {
      return ts;
    }

    /**
      * Sets the value of the 'ts' field.
      * @param value The value of 'ts'.
      * @return This builder.
      */
    public Builder setTs(long value) {
      validate(fields()[0], value);
      this.ts = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ts' field has been set.
      * @return True if the 'ts' field has been set, false otherwise.
      */
    public boolean hasTs() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ts' field.
      * @return This builder.
      */
    public Builder clearTs() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ip' field.
      * @return The value.
      */
    public CharSequence getIp() {
      return ip;
    }

    /**
      * Sets the value of the 'ip' field.
      * @param value The value of 'ip'.
      * @return This builder.
      */
    public Builder setIp(CharSequence value) {
      validate(fields()[1], value);
      this.ip = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ip' field has been set.
      * @return True if the 'ip' field has been set, false otherwise.
      */
    public boolean hasIp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ip' field.
      * @return This builder.
      */
    public Builder clearIp() {
      ip = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public Integer getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public Builder setStatus(int value) {
      validate(fields()[2], value);
      this.status = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public Builder clearStatus() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'bid' field.
      * @return The value.
      */
    public CharSequence getBid() {
      return bid;
    }

    /**
      * Sets the value of the 'bid' field.
      * @param value The value of 'bid'.
      * @return This builder.
      */
    public Builder setBid(CharSequence value) {
      validate(fields()[3], value);
      this.bid = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'bid' field has been set.
      * @return True if the 'bid' field has been set, false otherwise.
      */
    public boolean hasBid() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'bid' field.
      * @return This builder.
      */
    public Builder clearBid() {
      bid = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'impid' field.
      * @return The value.
      */
    public CharSequence getImpid() {
      return impid;
    }

    /**
      * Sets the value of the 'impid' field.
      * @param value The value of 'impid'.
      * @return This builder.
      */
    public Builder setImpid(CharSequence value) {
      validate(fields()[4], value);
      this.impid = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'impid' field has been set.
      * @return True if the 'impid' field has been set, false otherwise.
      */
    public boolean hasImpid() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'impid' field.
      * @return This builder.
      */
    public Builder clearImpid() {
      impid = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'projectid' field.
      * @return The value.
      */
    public Long getProjectid() {
      return projectid;
    }

    /**
      * Sets the value of the 'projectid' field.
      * @param value The value of 'projectid'.
      * @return This builder.
      */
    public Builder setProjectid(long value) {
      validate(fields()[5], value);
      this.projectid = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'projectid' field has been set.
      * @return True if the 'projectid' field has been set, false otherwise.
      */
    public boolean hasProjectid() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'projectid' field.
      * @return This builder.
      */
    public Builder clearProjectid() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'cid' field.
      * @return The value.
      */
    public Long getCid() {
      return cid;
    }

    /**
      * Sets the value of the 'cid' field.
      * @param value The value of 'cid'.
      * @return This builder.
      */
    public Builder setCid(long value) {
      validate(fields()[6], value);
      this.cid = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'cid' field has been set.
      * @return True if the 'cid' field has been set, false otherwise.
      */
    public boolean hasCid() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'cid' field.
      * @return This builder.
      */
    public Builder clearCid() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'crid' field.
      * @return The value.
      */
    public Long getCrid() {
      return crid;
    }

    /**
      * Sets the value of the 'crid' field.
      * @param value The value of 'crid'.
      * @return This builder.
      */
    public Builder setCrid(long value) {
      validate(fields()[7], value);
      this.crid = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'crid' field has been set.
      * @return True if the 'crid' field has been set, false otherwise.
      */
    public boolean hasCrid() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'crid' field.
      * @return This builder.
      */
    public Builder clearCrid() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'sspid' field.
      * @return The value.
      */
    public Long getSspid() {
      return sspid;
    }

    /**
      * Sets the value of the 'sspid' field.
      * @param value The value of 'sspid'.
      * @return This builder.
      */
    public Builder setSspid(long value) {
      validate(fields()[8], value);
      this.sspid = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'sspid' field has been set.
      * @return True if the 'sspid' field has been set, false otherwise.
      */
    public boolean hasSspid() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'sspid' field.
      * @return This builder.
      */
    public Builder clearSspid() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'mediaid' field.
      * @return The value.
      */
    public Long getMediaid() {
      return mediaid;
    }

    /**
      * Sets the value of the 'mediaid' field.
      * @param value The value of 'mediaid'.
      * @return This builder.
      */
    public Builder setMediaid(long value) {
      validate(fields()[9], value);
      this.mediaid = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'mediaid' field has been set.
      * @return True if the 'mediaid' field has been set, false otherwise.
      */
    public boolean hasMediaid() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'mediaid' field.
      * @return This builder.
      */
    public Builder clearMediaid() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'adspaceid' field.
      * @return The value.
      */
    public Long getAdspaceid() {
      return adspaceid;
    }

    /**
      * Sets the value of the 'adspaceid' field.
      * @param value The value of 'adspaceid'.
      * @return This builder.
      */
    public Builder setAdspaceid(long value) {
      validate(fields()[10], value);
      this.adspaceid = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'adspaceid' field has been set.
      * @return True if the 'adspaceid' field has been set, false otherwise.
      */
    public boolean hasAdspaceid() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'adspaceid' field.
      * @return This builder.
      */
    public Builder clearAdspaceid() {
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public Integer getPrice() {
      return price;
    }

    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public Builder setPrice(int value) {
      validate(fields()[11], value);
      this.price = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public Builder clearPrice() {
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'bidtype' field.
      * @return The value.
      */
    public Integer getBidtype() {
      return bidtype;
    }

    /**
      * Sets the value of the 'bidtype' field.
      * @param value The value of 'bidtype'.
      * @return This builder.
      */
    public Builder setBidtype(int value) {
      validate(fields()[12], value);
      this.bidtype = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'bidtype' field has been set.
      * @return True if the 'bidtype' field has been set, false otherwise.
      */
    public boolean hasBidtype() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'bidtype' field.
      * @return This builder.
      */
    public Builder clearBidtype() {
      fieldSetFlags()[12] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public WinNotice build() {
      try {
        WinNotice record = new WinNotice();
        record.ts = fieldSetFlags()[0] ? this.ts : (Long) defaultValue(fields()[0]);
        record.ip = fieldSetFlags()[1] ? this.ip : (CharSequence) defaultValue(fields()[1]);
        record.status = fieldSetFlags()[2] ? this.status : (Integer) defaultValue(fields()[2]);
        record.bid = fieldSetFlags()[3] ? this.bid : (CharSequence) defaultValue(fields()[3]);
        record.impid = fieldSetFlags()[4] ? this.impid : (CharSequence) defaultValue(fields()[4]);
        record.projectid = fieldSetFlags()[5] ? this.projectid : (Long) defaultValue(fields()[5]);
        record.cid = fieldSetFlags()[6] ? this.cid : (Long) defaultValue(fields()[6]);
        record.crid = fieldSetFlags()[7] ? this.crid : (Long) defaultValue(fields()[7]);
        record.sspid = fieldSetFlags()[8] ? this.sspid : (Long) defaultValue(fields()[8]);
        record.mediaid = fieldSetFlags()[9] ? this.mediaid : (Long) defaultValue(fields()[9]);
        record.adspaceid = fieldSetFlags()[10] ? this.adspaceid : (Long) defaultValue(fields()[10]);
        record.price = fieldSetFlags()[11] ? this.price : (Integer) defaultValue(fields()[11]);
        record.bidtype = fieldSetFlags()[12] ? this.bidtype : (Integer) defaultValue(fields()[12]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<WinNotice>
    WRITER$ = (org.apache.avro.io.DatumWriter<WinNotice>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<WinNotice>
    READER$ = (org.apache.avro.io.DatumReader<WinNotice>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
