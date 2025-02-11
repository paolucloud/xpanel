// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/blackhole/config.proto

package cloud.paolu.xray.proxy.blackhole;

/**
 * Protobuf type {@code xray.proxy.blackhole.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.proxy.blackhole.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Config();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cloud.paolu.xray.proxy.blackhole.ConfigOuterClass.internal_static_xray_proxy_blackhole_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cloud.paolu.xray.proxy.blackhole.ConfigOuterClass.internal_static_xray_proxy_blackhole_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cloud.paolu.xray.proxy.blackhole.Config.class, cloud.paolu.xray.proxy.blackhole.Config.Builder.class);
  }

  public static final int RESPONSE_FIELD_NUMBER = 1;
  private cloud.paolu.xray.common.serial.TypedMessage response_;
  /**
   * <code>.xray.common.serial.TypedMessage response = 1;</code>
   * @return Whether the response field is set.
   */
  @java.lang.Override
  public boolean hasResponse() {
    return response_ != null;
  }
  /**
   * <code>.xray.common.serial.TypedMessage response = 1;</code>
   * @return The response.
   */
  @java.lang.Override
  public cloud.paolu.xray.common.serial.TypedMessage getResponse() {
    return response_ == null ? cloud.paolu.xray.common.serial.TypedMessage.getDefaultInstance() : response_;
  }
  /**
   * <code>.xray.common.serial.TypedMessage response = 1;</code>
   */
  @java.lang.Override
  public cloud.paolu.xray.common.serial.TypedMessageOrBuilder getResponseOrBuilder() {
    return response_ == null ? cloud.paolu.xray.common.serial.TypedMessage.getDefaultInstance() : response_;
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
    if (response_ != null) {
      output.writeMessage(1, getResponse());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (response_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResponse());
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
    if (!(obj instanceof cloud.paolu.xray.proxy.blackhole.Config)) {
      return super.equals(obj);
    }
    cloud.paolu.xray.proxy.blackhole.Config other = (cloud.paolu.xray.proxy.blackhole.Config) obj;

    if (hasResponse() != other.hasResponse()) return false;
    if (hasResponse()) {
      if (!getResponse()
          .equals(other.getResponse())) return false;
    }
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
    if (hasResponse()) {
      hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getResponse().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cloud.paolu.xray.proxy.blackhole.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.proxy.blackhole.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.blackhole.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.proxy.blackhole.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.blackhole.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.proxy.blackhole.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.blackhole.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.proxy.blackhole.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cloud.paolu.xray.proxy.blackhole.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cloud.paolu.xray.proxy.blackhole.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.blackhole.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.proxy.blackhole.Config parseFrom(
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
  public static Builder newBuilder(cloud.paolu.xray.proxy.blackhole.Config prototype) {
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
   * Protobuf type {@code xray.proxy.blackhole.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.proxy.blackhole.Config)
      cloud.paolu.xray.proxy.blackhole.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cloud.paolu.xray.proxy.blackhole.ConfigOuterClass.internal_static_xray_proxy_blackhole_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cloud.paolu.xray.proxy.blackhole.ConfigOuterClass.internal_static_xray_proxy_blackhole_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cloud.paolu.xray.proxy.blackhole.Config.class, cloud.paolu.xray.proxy.blackhole.Config.Builder.class);
    }

    // Construct using cloud.paolu.xray.proxy.blackhole.Config.newBuilder()
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
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cloud.paolu.xray.proxy.blackhole.ConfigOuterClass.internal_static_xray_proxy_blackhole_Config_descriptor;
    }

    @java.lang.Override
    public cloud.paolu.xray.proxy.blackhole.Config getDefaultInstanceForType() {
      return cloud.paolu.xray.proxy.blackhole.Config.getDefaultInstance();
    }

    @java.lang.Override
    public cloud.paolu.xray.proxy.blackhole.Config build() {
      cloud.paolu.xray.proxy.blackhole.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cloud.paolu.xray.proxy.blackhole.Config buildPartial() {
      cloud.paolu.xray.proxy.blackhole.Config result = new cloud.paolu.xray.proxy.blackhole.Config(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cloud.paolu.xray.proxy.blackhole.Config result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.response_ = responseBuilder_ == null
            ? response_
            : responseBuilder_.build();
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
      if (other instanceof cloud.paolu.xray.proxy.blackhole.Config) {
        return mergeFrom((cloud.paolu.xray.proxy.blackhole.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cloud.paolu.xray.proxy.blackhole.Config other) {
      if (other == cloud.paolu.xray.proxy.blackhole.Config.getDefaultInstance()) return this;
      if (other.hasResponse()) {
        mergeResponse(other.getResponse());
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
            case 10: {
              input.readMessage(
                  getResponseFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private cloud.paolu.xray.common.serial.TypedMessage response_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cloud.paolu.xray.common.serial.TypedMessage, cloud.paolu.xray.common.serial.TypedMessage.Builder, cloud.paolu.xray.common.serial.TypedMessageOrBuilder> responseBuilder_;
    /**
     * <code>.xray.common.serial.TypedMessage response = 1;</code>
     * @return Whether the response field is set.
     */
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.xray.common.serial.TypedMessage response = 1;</code>
     * @return The response.
     */
    public cloud.paolu.xray.common.serial.TypedMessage getResponse() {
      if (responseBuilder_ == null) {
        return response_ == null ? cloud.paolu.xray.common.serial.TypedMessage.getDefaultInstance() : response_;
      } else {
        return responseBuilder_.getMessage();
      }
    }
    /**
     * <code>.xray.common.serial.TypedMessage response = 1;</code>
     */
    public Builder setResponse(cloud.paolu.xray.common.serial.TypedMessage value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
      } else {
        responseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage response = 1;</code>
     */
    public Builder setResponse(
        cloud.paolu.xray.common.serial.TypedMessage.Builder builderForValue) {
      if (responseBuilder_ == null) {
        response_ = builderForValue.build();
      } else {
        responseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage response = 1;</code>
     */
    public Builder mergeResponse(cloud.paolu.xray.common.serial.TypedMessage value) {
      if (responseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          response_ != null &&
          response_ != cloud.paolu.xray.common.serial.TypedMessage.getDefaultInstance()) {
          getResponseBuilder().mergeFrom(value);
        } else {
          response_ = value;
        }
      } else {
        responseBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage response = 1;</code>
     */
    public Builder clearResponse() {
      bitField0_ = (bitField0_ & ~0x00000001);
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.xray.common.serial.TypedMessage response = 1;</code>
     */
    public cloud.paolu.xray.common.serial.TypedMessage.Builder getResponseBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.xray.common.serial.TypedMessage response = 1;</code>
     */
    public cloud.paolu.xray.common.serial.TypedMessageOrBuilder getResponseOrBuilder() {
      if (responseBuilder_ != null) {
        return responseBuilder_.getMessageOrBuilder();
      } else {
        return response_ == null ?
            cloud.paolu.xray.common.serial.TypedMessage.getDefaultInstance() : response_;
      }
    }
    /**
     * <code>.xray.common.serial.TypedMessage response = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cloud.paolu.xray.common.serial.TypedMessage, cloud.paolu.xray.common.serial.TypedMessage.Builder, cloud.paolu.xray.common.serial.TypedMessageOrBuilder> 
        getResponseFieldBuilder() {
      if (responseBuilder_ == null) {
        responseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cloud.paolu.xray.common.serial.TypedMessage, cloud.paolu.xray.common.serial.TypedMessage.Builder, cloud.paolu.xray.common.serial.TypedMessageOrBuilder>(
                getResponse(),
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      return responseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xray.proxy.blackhole.Config)
  }

  // @@protoc_insertion_point(class_scope:xray.proxy.blackhole.Config)
  private static final cloud.paolu.xray.proxy.blackhole.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cloud.paolu.xray.proxy.blackhole.Config();
  }

  public static cloud.paolu.xray.proxy.blackhole.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    @java.lang.Override
    public Config parsePartialFrom(
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

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cloud.paolu.xray.proxy.blackhole.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

