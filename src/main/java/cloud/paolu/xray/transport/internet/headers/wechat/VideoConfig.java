// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/headers/wechat/config.proto

package cloud.paolu.xray.transport.internet.headers.wechat;

/**
 * Protobuf type {@code xray.transport.internet.headers.wechat.VideoConfig}
 */
public final class VideoConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.transport.internet.headers.wechat.VideoConfig)
    VideoConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoConfig.newBuilder() to construct.
  private VideoConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cloud.paolu.xray.transport.internet.headers.wechat.Config.internal_static_xray_transport_internet_headers_wechat_VideoConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cloud.paolu.xray.transport.internet.headers.wechat.Config.internal_static_xray_transport_internet_headers_wechat_VideoConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig.class, cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig)) {
      return super.equals(obj);
    }
    cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig other = (cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig parseFrom(
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
  public static Builder newBuilder(cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig prototype) {
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
   * Protobuf type {@code xray.transport.internet.headers.wechat.VideoConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.transport.internet.headers.wechat.VideoConfig)
      cloud.paolu.xray.transport.internet.headers.wechat.VideoConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cloud.paolu.xray.transport.internet.headers.wechat.Config.internal_static_xray_transport_internet_headers_wechat_VideoConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cloud.paolu.xray.transport.internet.headers.wechat.Config.internal_static_xray_transport_internet_headers_wechat_VideoConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig.class, cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig.Builder.class);
    }

    // Construct using cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cloud.paolu.xray.transport.internet.headers.wechat.Config.internal_static_xray_transport_internet_headers_wechat_VideoConfig_descriptor;
    }

    @java.lang.Override
    public cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig getDefaultInstanceForType() {
      return cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig.getDefaultInstance();
    }

    @java.lang.Override
    public cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig build() {
      cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig buildPartial() {
      cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig result = new cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig(this);
      onBuilt();
      return result;
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
      if (other instanceof cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig) {
        return mergeFrom((cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig other) {
      if (other == cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:xray.transport.internet.headers.wechat.VideoConfig)
  }

  // @@protoc_insertion_point(class_scope:xray.transport.internet.headers.wechat.VideoConfig)
  private static final cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig();
  }

  public static cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoConfig>
      PARSER = new com.google.protobuf.AbstractParser<VideoConfig>() {
    @java.lang.Override
    public VideoConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cloud.paolu.xray.transport.internet.headers.wechat.VideoConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

