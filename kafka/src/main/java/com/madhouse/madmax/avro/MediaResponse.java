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
public class MediaResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6721972624809171167L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MediaResponse\",\"namespace\":\"com.madhouse.madmax.avro\",\"fields\":[{\"name\":\"projectid\",\"type\":\"long\",\"default\":0},{\"name\":\"cid\",\"type\":\"long\",\"default\":0},{\"name\":\"crid\",\"type\":\"long\",\"default\":0},{\"name\":\"brand\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"layout\",\"type\":\"int\",\"default\":0},{\"name\":\"price\",\"type\":\"int\",\"default\":0},{\"name\":\"icon\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"cover\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"title\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"desc\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"content\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"duration\",\"type\":\"int\",\"default\":0},{\"name\":\"adm\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"dealid\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"lpgurl\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"monitor\",\"type\":{\"type\":\"record\",\"name\":\"Monitor\",\"fields\":[{\"name\":\"impurl\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Track\",\"fields\":[{\"name\":\"startdelay\",\"type\":\"int\",\"default\":0},{\"name\":\"url\",\"type\":\"string\"}]}}],\"default\":null},{\"name\":\"clkurl\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"securl\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"exptime\",\"type\":\"int\",\"default\":86400},{\"name\":\"exts\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null}]},\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MediaResponse> ENCODER =
      new BinaryMessageEncoder<MediaResponse>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MediaResponse> DECODER =
      new BinaryMessageDecoder<MediaResponse>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<MediaResponse> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<MediaResponse> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MediaResponse>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this MediaResponse to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a MediaResponse from a ByteBuffer. */
  public static MediaResponse fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long projectid;
  @Deprecated public long cid;
  @Deprecated public long crid;
  @Deprecated public CharSequence brand;
  @Deprecated public int layout;
  @Deprecated public int price;
  @Deprecated public CharSequence icon;
  @Deprecated public CharSequence cover;
  @Deprecated public CharSequence title;
  @Deprecated public CharSequence desc;
  @Deprecated public CharSequence content;
  @Deprecated public int duration;
  @Deprecated public java.util.List<CharSequence> adm;
  @Deprecated public CharSequence dealid;
  @Deprecated public CharSequence lpgurl;
  @Deprecated public com.madhouse.madmax.avro.Monitor monitor;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MediaResponse() {}

  /**
   * All-args constructor.
   * @param projectid The new value for projectid
   * @param cid The new value for cid
   * @param crid The new value for crid
   * @param brand The new value for brand
   * @param layout The new value for layout
   * @param price The new value for price
   * @param icon The new value for icon
   * @param cover The new value for cover
   * @param title The new value for title
   * @param desc The new value for desc
   * @param content The new value for content
   * @param duration The new value for duration
   * @param adm The new value for adm
   * @param dealid The new value for dealid
   * @param lpgurl The new value for lpgurl
   * @param monitor The new value for monitor
   */
  public MediaResponse(Long projectid, Long cid, Long crid, CharSequence brand, Integer layout, Integer price, CharSequence icon, CharSequence cover, CharSequence title, CharSequence desc, CharSequence content, Integer duration, java.util.List<CharSequence> adm, CharSequence dealid, CharSequence lpgurl, com.madhouse.madmax.avro.Monitor monitor) {
    this.projectid = projectid;
    this.cid = cid;
    this.crid = crid;
    this.brand = brand;
    this.layout = layout;
    this.price = price;
    this.icon = icon;
    this.cover = cover;
    this.title = title;
    this.desc = desc;
    this.content = content;
    this.duration = duration;
    this.adm = adm;
    this.dealid = dealid;
    this.lpgurl = lpgurl;
    this.monitor = monitor;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return projectid;
    case 1: return cid;
    case 2: return crid;
    case 3: return brand;
    case 4: return layout;
    case 5: return price;
    case 6: return icon;
    case 7: return cover;
    case 8: return title;
    case 9: return desc;
    case 10: return content;
    case 11: return duration;
    case 12: return adm;
    case 13: return dealid;
    case 14: return lpgurl;
    case 15: return monitor;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: projectid = (Long)value$; break;
    case 1: cid = (Long)value$; break;
    case 2: crid = (Long)value$; break;
    case 3: brand = (CharSequence)value$; break;
    case 4: layout = (Integer)value$; break;
    case 5: price = (Integer)value$; break;
    case 6: icon = (CharSequence)value$; break;
    case 7: cover = (CharSequence)value$; break;
    case 8: title = (CharSequence)value$; break;
    case 9: desc = (CharSequence)value$; break;
    case 10: content = (CharSequence)value$; break;
    case 11: duration = (Integer)value$; break;
    case 12: adm = (java.util.List<CharSequence>)value$; break;
    case 13: dealid = (CharSequence)value$; break;
    case 14: lpgurl = (CharSequence)value$; break;
    case 15: monitor = (com.madhouse.madmax.avro.Monitor)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'brand' field.
   * @return The value of the 'brand' field.
   */
  public CharSequence getBrand() {
    return brand;
  }

  /**
   * Sets the value of the 'brand' field.
   * @param value the value to set.
   */
  public void setBrand(CharSequence value) {
    this.brand = value;
  }

  /**
   * Gets the value of the 'layout' field.
   * @return The value of the 'layout' field.
   */
  public Integer getLayout() {
    return layout;
  }

  /**
   * Sets the value of the 'layout' field.
   * @param value the value to set.
   */
  public void setLayout(Integer value) {
    this.layout = value;
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
   * Gets the value of the 'icon' field.
   * @return The value of the 'icon' field.
   */
  public CharSequence getIcon() {
    return icon;
  }

  /**
   * Sets the value of the 'icon' field.
   * @param value the value to set.
   */
  public void setIcon(CharSequence value) {
    this.icon = value;
  }

  /**
   * Gets the value of the 'cover' field.
   * @return The value of the 'cover' field.
   */
  public CharSequence getCover() {
    return cover;
  }

  /**
   * Sets the value of the 'cover' field.
   * @param value the value to set.
   */
  public void setCover(CharSequence value) {
    this.cover = value;
  }

  /**
   * Gets the value of the 'title' field.
   * @return The value of the 'title' field.
   */
  public CharSequence getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(CharSequence value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'desc' field.
   * @return The value of the 'desc' field.
   */
  public CharSequence getDesc() {
    return desc;
  }

  /**
   * Sets the value of the 'desc' field.
   * @param value the value to set.
   */
  public void setDesc(CharSequence value) {
    this.desc = value;
  }

  /**
   * Gets the value of the 'content' field.
   * @return The value of the 'content' field.
   */
  public CharSequence getContent() {
    return content;
  }

  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(CharSequence value) {
    this.content = value;
  }

  /**
   * Gets the value of the 'duration' field.
   * @return The value of the 'duration' field.
   */
  public Integer getDuration() {
    return duration;
  }

  /**
   * Sets the value of the 'duration' field.
   * @param value the value to set.
   */
  public void setDuration(Integer value) {
    this.duration = value;
  }

  /**
   * Gets the value of the 'adm' field.
   * @return The value of the 'adm' field.
   */
  public java.util.List<CharSequence> getAdm() {
    return adm;
  }

  /**
   * Sets the value of the 'adm' field.
   * @param value the value to set.
   */
  public void setAdm(java.util.List<CharSequence> value) {
    this.adm = value;
  }

  /**
   * Gets the value of the 'dealid' field.
   * @return The value of the 'dealid' field.
   */
  public CharSequence getDealid() {
    return dealid;
  }

  /**
   * Sets the value of the 'dealid' field.
   * @param value the value to set.
   */
  public void setDealid(CharSequence value) {
    this.dealid = value;
  }

  /**
   * Gets the value of the 'lpgurl' field.
   * @return The value of the 'lpgurl' field.
   */
  public CharSequence getLpgurl() {
    return lpgurl;
  }

  /**
   * Sets the value of the 'lpgurl' field.
   * @param value the value to set.
   */
  public void setLpgurl(CharSequence value) {
    this.lpgurl = value;
  }

  /**
   * Gets the value of the 'monitor' field.
   * @return The value of the 'monitor' field.
   */
  public com.madhouse.madmax.avro.Monitor getMonitor() {
    return monitor;
  }

  /**
   * Sets the value of the 'monitor' field.
   * @param value the value to set.
   */
  public void setMonitor(com.madhouse.madmax.avro.Monitor value) {
    this.monitor = value;
  }

  /**
   * Creates a new MediaResponse RecordBuilder.
   * @return A new MediaResponse RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new MediaResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MediaResponse RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /**
   * Creates a new MediaResponse RecordBuilder by copying an existing MediaResponse instance.
   * @param other The existing instance to copy.
   * @return A new MediaResponse RecordBuilder
   */
  public static Builder newBuilder(MediaResponse other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for MediaResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MediaResponse>
    implements org.apache.avro.data.RecordBuilder<MediaResponse> {

    private long projectid;
    private long cid;
    private long crid;
    private CharSequence brand;
    private int layout;
    private int price;
    private CharSequence icon;
    private CharSequence cover;
    private CharSequence title;
    private CharSequence desc;
    private CharSequence content;
    private int duration;
    private java.util.List<CharSequence> adm;
    private CharSequence dealid;
    private CharSequence lpgurl;
    private com.madhouse.madmax.avro.Monitor monitor;
    private com.madhouse.madmax.avro.Monitor.Builder monitorBuilder;

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
      if (isValidValue(fields()[0], other.projectid)) {
        this.projectid = data().deepCopy(fields()[0].schema(), other.projectid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.cid)) {
        this.cid = data().deepCopy(fields()[1].schema(), other.cid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.crid)) {
        this.crid = data().deepCopy(fields()[2].schema(), other.crid);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.brand)) {
        this.brand = data().deepCopy(fields()[3].schema(), other.brand);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.layout)) {
        this.layout = data().deepCopy(fields()[4].schema(), other.layout);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.icon)) {
        this.icon = data().deepCopy(fields()[6].schema(), other.icon);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.cover)) {
        this.cover = data().deepCopy(fields()[7].schema(), other.cover);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.title)) {
        this.title = data().deepCopy(fields()[8].schema(), other.title);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.desc)) {
        this.desc = data().deepCopy(fields()[9].schema(), other.desc);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.content)) {
        this.content = data().deepCopy(fields()[10].schema(), other.content);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.duration)) {
        this.duration = data().deepCopy(fields()[11].schema(), other.duration);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.adm)) {
        this.adm = data().deepCopy(fields()[12].schema(), other.adm);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.dealid)) {
        this.dealid = data().deepCopy(fields()[13].schema(), other.dealid);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.lpgurl)) {
        this.lpgurl = data().deepCopy(fields()[14].schema(), other.lpgurl);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.monitor)) {
        this.monitor = data().deepCopy(fields()[15].schema(), other.monitor);
        fieldSetFlags()[15] = true;
      }
      if (other.hasMonitorBuilder()) {
        this.monitorBuilder = com.madhouse.madmax.avro.Monitor.newBuilder(other.getMonitorBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing MediaResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(MediaResponse other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.projectid)) {
        this.projectid = data().deepCopy(fields()[0].schema(), other.projectid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.cid)) {
        this.cid = data().deepCopy(fields()[1].schema(), other.cid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.crid)) {
        this.crid = data().deepCopy(fields()[2].schema(), other.crid);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.brand)) {
        this.brand = data().deepCopy(fields()[3].schema(), other.brand);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.layout)) {
        this.layout = data().deepCopy(fields()[4].schema(), other.layout);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.icon)) {
        this.icon = data().deepCopy(fields()[6].schema(), other.icon);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.cover)) {
        this.cover = data().deepCopy(fields()[7].schema(), other.cover);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.title)) {
        this.title = data().deepCopy(fields()[8].schema(), other.title);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.desc)) {
        this.desc = data().deepCopy(fields()[9].schema(), other.desc);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.content)) {
        this.content = data().deepCopy(fields()[10].schema(), other.content);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.duration)) {
        this.duration = data().deepCopy(fields()[11].schema(), other.duration);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.adm)) {
        this.adm = data().deepCopy(fields()[12].schema(), other.adm);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.dealid)) {
        this.dealid = data().deepCopy(fields()[13].schema(), other.dealid);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.lpgurl)) {
        this.lpgurl = data().deepCopy(fields()[14].schema(), other.lpgurl);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.monitor)) {
        this.monitor = data().deepCopy(fields()[15].schema(), other.monitor);
        fieldSetFlags()[15] = true;
      }
      this.monitorBuilder = null;
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
      validate(fields()[0], value);
      this.projectid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'projectid' field has been set.
      * @return True if the 'projectid' field has been set, false otherwise.
      */
    public boolean hasProjectid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'projectid' field.
      * @return This builder.
      */
    public Builder clearProjectid() {
      fieldSetFlags()[0] = false;
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
      validate(fields()[1], value);
      this.cid = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'cid' field has been set.
      * @return True if the 'cid' field has been set, false otherwise.
      */
    public boolean hasCid() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'cid' field.
      * @return This builder.
      */
    public Builder clearCid() {
      fieldSetFlags()[1] = false;
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
      validate(fields()[2], value);
      this.crid = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'crid' field has been set.
      * @return True if the 'crid' field has been set, false otherwise.
      */
    public boolean hasCrid() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'crid' field.
      * @return This builder.
      */
    public Builder clearCrid() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'brand' field.
      * @return The value.
      */
    public CharSequence getBrand() {
      return brand;
    }

    /**
      * Sets the value of the 'brand' field.
      * @param value The value of 'brand'.
      * @return This builder.
      */
    public Builder setBrand(CharSequence value) {
      validate(fields()[3], value);
      this.brand = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'brand' field has been set.
      * @return True if the 'brand' field has been set, false otherwise.
      */
    public boolean hasBrand() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'brand' field.
      * @return This builder.
      */
    public Builder clearBrand() {
      brand = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'layout' field.
      * @return The value.
      */
    public Integer getLayout() {
      return layout;
    }

    /**
      * Sets the value of the 'layout' field.
      * @param value The value of 'layout'.
      * @return This builder.
      */
    public Builder setLayout(int value) {
      validate(fields()[4], value);
      this.layout = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'layout' field has been set.
      * @return True if the 'layout' field has been set, false otherwise.
      */
    public boolean hasLayout() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'layout' field.
      * @return This builder.
      */
    public Builder clearLayout() {
      fieldSetFlags()[4] = false;
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
      validate(fields()[5], value);
      this.price = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public Builder clearPrice() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'icon' field.
      * @return The value.
      */
    public CharSequence getIcon() {
      return icon;
    }

    /**
      * Sets the value of the 'icon' field.
      * @param value The value of 'icon'.
      * @return This builder.
      */
    public Builder setIcon(CharSequence value) {
      validate(fields()[6], value);
      this.icon = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'icon' field has been set.
      * @return True if the 'icon' field has been set, false otherwise.
      */
    public boolean hasIcon() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'icon' field.
      * @return This builder.
      */
    public Builder clearIcon() {
      icon = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'cover' field.
      * @return The value.
      */
    public CharSequence getCover() {
      return cover;
    }

    /**
      * Sets the value of the 'cover' field.
      * @param value The value of 'cover'.
      * @return This builder.
      */
    public Builder setCover(CharSequence value) {
      validate(fields()[7], value);
      this.cover = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'cover' field has been set.
      * @return True if the 'cover' field has been set, false otherwise.
      */
    public boolean hasCover() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'cover' field.
      * @return This builder.
      */
    public Builder clearCover() {
      cover = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'title' field.
      * @return The value.
      */
    public CharSequence getTitle() {
      return title;
    }

    /**
      * Sets the value of the 'title' field.
      * @param value The value of 'title'.
      * @return This builder.
      */
    public Builder setTitle(CharSequence value) {
      validate(fields()[8], value);
      this.title = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public Builder clearTitle() {
      title = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'desc' field.
      * @return The value.
      */
    public CharSequence getDesc() {
      return desc;
    }

    /**
      * Sets the value of the 'desc' field.
      * @param value The value of 'desc'.
      * @return This builder.
      */
    public Builder setDesc(CharSequence value) {
      validate(fields()[9], value);
      this.desc = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'desc' field has been set.
      * @return True if the 'desc' field has been set, false otherwise.
      */
    public boolean hasDesc() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'desc' field.
      * @return This builder.
      */
    public Builder clearDesc() {
      desc = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'content' field.
      * @return The value.
      */
    public CharSequence getContent() {
      return content;
    }

    /**
      * Sets the value of the 'content' field.
      * @param value The value of 'content'.
      * @return This builder.
      */
    public Builder setContent(CharSequence value) {
      validate(fields()[10], value);
      this.content = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'content' field has been set.
      * @return True if the 'content' field has been set, false otherwise.
      */
    public boolean hasContent() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'content' field.
      * @return This builder.
      */
    public Builder clearContent() {
      content = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'duration' field.
      * @return The value.
      */
    public Integer getDuration() {
      return duration;
    }

    /**
      * Sets the value of the 'duration' field.
      * @param value The value of 'duration'.
      * @return This builder.
      */
    public Builder setDuration(int value) {
      validate(fields()[11], value);
      this.duration = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'duration' field has been set.
      * @return True if the 'duration' field has been set, false otherwise.
      */
    public boolean hasDuration() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'duration' field.
      * @return This builder.
      */
    public Builder clearDuration() {
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'adm' field.
      * @return The value.
      */
    public java.util.List<CharSequence> getAdm() {
      return adm;
    }

    /**
      * Sets the value of the 'adm' field.
      * @param value The value of 'adm'.
      * @return This builder.
      */
    public Builder setAdm(java.util.List<CharSequence> value) {
      validate(fields()[12], value);
      this.adm = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'adm' field has been set.
      * @return True if the 'adm' field has been set, false otherwise.
      */
    public boolean hasAdm() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'adm' field.
      * @return This builder.
      */
    public Builder clearAdm() {
      adm = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'dealid' field.
      * @return The value.
      */
    public CharSequence getDealid() {
      return dealid;
    }

    /**
      * Sets the value of the 'dealid' field.
      * @param value The value of 'dealid'.
      * @return This builder.
      */
    public Builder setDealid(CharSequence value) {
      validate(fields()[13], value);
      this.dealid = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'dealid' field has been set.
      * @return True if the 'dealid' field has been set, false otherwise.
      */
    public boolean hasDealid() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'dealid' field.
      * @return This builder.
      */
    public Builder clearDealid() {
      dealid = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /**
      * Gets the value of the 'lpgurl' field.
      * @return The value.
      */
    public CharSequence getLpgurl() {
      return lpgurl;
    }

    /**
      * Sets the value of the 'lpgurl' field.
      * @param value The value of 'lpgurl'.
      * @return This builder.
      */
    public Builder setLpgurl(CharSequence value) {
      validate(fields()[14], value);
      this.lpgurl = value;
      fieldSetFlags()[14] = true;
      return this;
    }

    /**
      * Checks whether the 'lpgurl' field has been set.
      * @return True if the 'lpgurl' field has been set, false otherwise.
      */
    public boolean hasLpgurl() {
      return fieldSetFlags()[14];
    }


    /**
      * Clears the value of the 'lpgurl' field.
      * @return This builder.
      */
    public Builder clearLpgurl() {
      lpgurl = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    /**
      * Gets the value of the 'monitor' field.
      * @return The value.
      */
    public com.madhouse.madmax.avro.Monitor getMonitor() {
      return monitor;
    }

    /**
      * Sets the value of the 'monitor' field.
      * @param value The value of 'monitor'.
      * @return This builder.
      */
    public Builder setMonitor(com.madhouse.madmax.avro.Monitor value) {
      validate(fields()[15], value);
      this.monitorBuilder = null;
      this.monitor = value;
      fieldSetFlags()[15] = true;
      return this;
    }

    /**
      * Checks whether the 'monitor' field has been set.
      * @return True if the 'monitor' field has been set, false otherwise.
      */
    public boolean hasMonitor() {
      return fieldSetFlags()[15];
    }

    /**
     * Gets the Builder instance for the 'monitor' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.madhouse.madmax.avro.Monitor.Builder getMonitorBuilder() {
      if (monitorBuilder == null) {
        if (hasMonitor()) {
          setMonitorBuilder(com.madhouse.madmax.avro.Monitor.newBuilder(monitor));
        } else {
          setMonitorBuilder(com.madhouse.madmax.avro.Monitor.newBuilder());
        }
      }
      return monitorBuilder;
    }

    /**
     * Sets the Builder instance for the 'monitor' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public Builder setMonitorBuilder(com.madhouse.madmax.avro.Monitor.Builder value) {
      clearMonitor();
      monitorBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'monitor' field has an active Builder instance
     * @return True if the 'monitor' field has an active Builder instance
     */
    public boolean hasMonitorBuilder() {
      return monitorBuilder != null;
    }

    /**
      * Clears the value of the 'monitor' field.
      * @return This builder.
      */
    public Builder clearMonitor() {
      monitor = null;
      monitorBuilder = null;
      fieldSetFlags()[15] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MediaResponse build() {
      try {
        MediaResponse record = new MediaResponse();
        record.projectid = fieldSetFlags()[0] ? this.projectid : (Long) defaultValue(fields()[0]);
        record.cid = fieldSetFlags()[1] ? this.cid : (Long) defaultValue(fields()[1]);
        record.crid = fieldSetFlags()[2] ? this.crid : (Long) defaultValue(fields()[2]);
        record.brand = fieldSetFlags()[3] ? this.brand : (CharSequence) defaultValue(fields()[3]);
        record.layout = fieldSetFlags()[4] ? this.layout : (Integer) defaultValue(fields()[4]);
        record.price = fieldSetFlags()[5] ? this.price : (Integer) defaultValue(fields()[5]);
        record.icon = fieldSetFlags()[6] ? this.icon : (CharSequence) defaultValue(fields()[6]);
        record.cover = fieldSetFlags()[7] ? this.cover : (CharSequence) defaultValue(fields()[7]);
        record.title = fieldSetFlags()[8] ? this.title : (CharSequence) defaultValue(fields()[8]);
        record.desc = fieldSetFlags()[9] ? this.desc : (CharSequence) defaultValue(fields()[9]);
        record.content = fieldSetFlags()[10] ? this.content : (CharSequence) defaultValue(fields()[10]);
        record.duration = fieldSetFlags()[11] ? this.duration : (Integer) defaultValue(fields()[11]);
        record.adm = fieldSetFlags()[12] ? this.adm : (java.util.List<CharSequence>) defaultValue(fields()[12]);
        record.dealid = fieldSetFlags()[13] ? this.dealid : (CharSequence) defaultValue(fields()[13]);
        record.lpgurl = fieldSetFlags()[14] ? this.lpgurl : (CharSequence) defaultValue(fields()[14]);
        if (monitorBuilder != null) {
          record.monitor = this.monitorBuilder.build();
        } else {
          record.monitor = fieldSetFlags()[15] ? this.monitor : (com.madhouse.madmax.avro.Monitor) defaultValue(fields()[15]);
        }
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MediaResponse>
    WRITER$ = (org.apache.avro.io.DatumWriter<MediaResponse>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MediaResponse>
    READER$ = (org.apache.avro.io.DatumReader<MediaResponse>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
