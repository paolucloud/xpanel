// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/observatory/config.proto

package cloud.paolu.xray.app.observatory;

/**
 * Protobuf type {@code xray.core.app.observatory.Intensity}
 */
public final class Intensity extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.core.app.observatory.Intensity)
    IntensityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Intensity.newBuilder() to construct.
  private Intensity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Intensity() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Intensity();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cloud.paolu.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_Intensity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cloud.paolu.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_Intensity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cloud.paolu.xray.app.observatory.Intensity.class, cloud.paolu.xray.app.observatory.Intensity.Builder.class);
  }

  public static final int PROBE_INTERVAL_FIELD_NUMBER = 1;
  private int probeInterval_ = 0;
  /**
   * <pre>
   * &#64;Document The time interval for a probe request in ms.
   *&#64;Type time.ms
   * </pre>
   *
   * <code>uint32 probe_interval = 1;</code>
   * @return The probeInterval.
   */
  @java.lang.Override
  public int getProbeInterval() {
    return probeInterval_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (probeInterval_ != 0) {
      output.writeUInt32(1, probeInterval_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (probeInterval_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, probeInterval_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cloud.paolu.xray.app.observatory.Intensity)) {
      return super.equals(obj);
    }
    cloud.paolu.xray.app.observatory.Intensity other = (cloud.paolu.xray.app.observatory.Intensity) obj;

    if (getProbeInterval()
        != other.getProbeInterval()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROBE_INTERVAL_FIELD_NUMBER;
    hash = (53 * hash) + getProbeInterval();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cloud.paolu.xray.app.observatory.Intensity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.observatory.Intensity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.observatory.Intensity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.observatory.Intensity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.observatory.Intensity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.observatory.Intensity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.observatory.Intensity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.app.observatory.Intensity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cloud.paolu.xray.app.observatory.Intensity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cloud.paolu.xray.app.observatory.Intensity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cloud.paolu.xray.app.observatory.Intensity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.app.observatory.Intensity parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cloud.paolu.xray.app.observatory.Intensity prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code xray.core.app.observatory.Intensity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.core.app.observatory.Intensity)
      cloud.paolu.xray.app.observatory.IntensityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cloud.paolu.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_Intensity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cloud.paolu.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_Intensity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cloud.paolu.xray.app.observatory.Intensity.class, cloud.paolu.xray.app.observatory.Intensity.Builder.class);
    }

    // Construct using cloud.paolu.xray.app.observatory.Intensity.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      probeInterval_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cloud.paolu.xray.app.observatory.ConfigOuterClass.internal_static_xray_core_app_observatory_Intensity_descriptor;
    }

    @java.lang.Override
    public cloud.paolu.xray.app.observatory.Intensity getDefaultInstanceForType() {
      return cloud.paolu.xray.app.observatory.Intensity.getDefaultInstance();
    }

    @java.lang.Override
    public cloud.paolu.xray.app.observatory.Intensity build() {
      cloud.paolu.xray.app.observatory.Intensity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cloud.paolu.xray.app.observatory.Intensity buildPartial() {
      cloud.paolu.xray.app.observatory.Intensity result = new cloud.paolu.xray.app.observatory.Intensity(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cloud.paolu.xray.app.observatory.Intensity result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.probeInterval_ = probeInterval_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cloud.paolu.xray.app.observatory.Intensity) {
        return mergeFrom((cloud.paolu.xray.app.observatory.Intensity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cloud.paolu.xray.app.observatory.Intensity other) {
      if (other == cloud.paolu.xray.app.observatory.Intensity.getDefaultInstance()) return this;
      if (other.getProbeInterval() != 0) {
        setProbeInterval(other.getProbeInterval());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              probeInterval_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int probeInterval_ ;
    /**
     * <pre>
     * &#64;Document The time interval for a probe request in ms.
     *&#64;Type time.ms
     * </pre>
     *
     * <code>uint32 probe_interval = 1;</code>
     * @return The probeInterval.
     */
    @java.lang.Override
    public int getProbeInterval() {
      return probeInterval_;
    }
    /**
     * <pre>
     * &#64;Document The time interval for a probe request in ms.
     *&#64;Type time.ms
     * </pre>
     *
     * <code>uint32 probe_interval = 1;</code>
     * @param value The probeInterval to set.
     * @return This builder for chaining.
     */
    public Builder setProbeInterval(int value) {

      probeInterval_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;Document The time interval for a probe request in ms.
     *&#64;Type time.ms
     * </pre>
     *
     * <code>uint32 probe_interval = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProbeInterval() {
      bitField0_ = (bitField0_ & ~0x00000001);
      probeInterval_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:xray.core.app.observatory.Intensity)
  }

  // @@protoc_insertion_point(class_scope:xray.core.app.observatory.Intensity)
  private static final cloud.paolu.xray.app.observatory.Intensity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cloud.paolu.xray.app.observatory.Intensity();
  }

  public static cloud.paolu.xray.app.observatory.Intensity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Intensity>
      PARSER = new com.google.protobuf.AbstractParser<Intensity>() {
    @java.lang.Override
    public Intensity parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Intensity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Intensity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cloud.paolu.xray.app.observatory.Intensity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

