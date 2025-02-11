// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/global/config.proto

package cloud.paolu.xray.transport.global;

/**
 * <pre>
 * Global transport settings. This affects all type of connections that go
 * through Xray. Deprecated. Use each settings in StreamConfig.
 * </pre>
 *
 * Protobuf type {@code xray.transport.Config}
 */
@java.lang.Deprecated public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.transport.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    transportSettings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Config();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cloud.paolu.xray.transport.global.ConfigOuterClass.internal_static_xray_transport_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cloud.paolu.xray.transport.global.ConfigOuterClass.internal_static_xray_transport_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cloud.paolu.xray.transport.global.Config.class, cloud.paolu.xray.transport.global.Config.Builder.class);
  }

  public static final int TRANSPORT_SETTINGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<cloud.paolu.xray.transport.internet.TransportConfig> transportSettings_;
  /**
   * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<cloud.paolu.xray.transport.internet.TransportConfig> getTransportSettingsList() {
    return transportSettings_;
  }
  /**
   * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends cloud.paolu.xray.transport.internet.TransportConfigOrBuilder> 
      getTransportSettingsOrBuilderList() {
    return transportSettings_;
  }
  /**
   * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  @java.lang.Override
  public int getTransportSettingsCount() {
    return transportSettings_.size();
  }
  /**
   * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  @java.lang.Override
  public cloud.paolu.xray.transport.internet.TransportConfig getTransportSettings(int index) {
    return transportSettings_.get(index);
  }
  /**
   * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
   */
  @java.lang.Override
  public cloud.paolu.xray.transport.internet.TransportConfigOrBuilder getTransportSettingsOrBuilder(
      int index) {
    return transportSettings_.get(index);
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
    for (int i = 0; i < transportSettings_.size(); i++) {
      output.writeMessage(1, transportSettings_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < transportSettings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, transportSettings_.get(i));
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
    if (!(obj instanceof cloud.paolu.xray.transport.global.Config)) {
      return super.equals(obj);
    }
    cloud.paolu.xray.transport.global.Config other = (cloud.paolu.xray.transport.global.Config) obj;

    if (!getTransportSettingsList()
        .equals(other.getTransportSettingsList())) return false;
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
    if (getTransportSettingsCount() > 0) {
      hash = (37 * hash) + TRANSPORT_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getTransportSettingsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cloud.paolu.xray.transport.global.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.transport.global.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.transport.global.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.transport.global.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.transport.global.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.transport.global.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.transport.global.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.transport.global.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cloud.paolu.xray.transport.global.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cloud.paolu.xray.transport.global.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cloud.paolu.xray.transport.global.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.transport.global.Config parseFrom(
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
  public static Builder newBuilder(cloud.paolu.xray.transport.global.Config prototype) {
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
   * <pre>
   * Global transport settings. This affects all type of connections that go
   * through Xray. Deprecated. Use each settings in StreamConfig.
   * </pre>
   *
   * Protobuf type {@code xray.transport.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.transport.Config)
      cloud.paolu.xray.transport.global.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cloud.paolu.xray.transport.global.ConfigOuterClass.internal_static_xray_transport_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cloud.paolu.xray.transport.global.ConfigOuterClass.internal_static_xray_transport_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cloud.paolu.xray.transport.global.Config.class, cloud.paolu.xray.transport.global.Config.Builder.class);
    }

    // Construct using cloud.paolu.xray.transport.global.Config.newBuilder()
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
      if (transportSettingsBuilder_ == null) {
        transportSettings_ = java.util.Collections.emptyList();
      } else {
        transportSettings_ = null;
        transportSettingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cloud.paolu.xray.transport.global.ConfigOuterClass.internal_static_xray_transport_Config_descriptor;
    }

    @java.lang.Override
    public cloud.paolu.xray.transport.global.Config getDefaultInstanceForType() {
      return cloud.paolu.xray.transport.global.Config.getDefaultInstance();
    }

    @java.lang.Override
    public cloud.paolu.xray.transport.global.Config build() {
      cloud.paolu.xray.transport.global.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cloud.paolu.xray.transport.global.Config buildPartial() {
      cloud.paolu.xray.transport.global.Config result = new cloud.paolu.xray.transport.global.Config(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(cloud.paolu.xray.transport.global.Config result) {
      if (transportSettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          transportSettings_ = java.util.Collections.unmodifiableList(transportSettings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.transportSettings_ = transportSettings_;
      } else {
        result.transportSettings_ = transportSettingsBuilder_.build();
      }
    }

    private void buildPartial0(cloud.paolu.xray.transport.global.Config result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof cloud.paolu.xray.transport.global.Config) {
        return mergeFrom((cloud.paolu.xray.transport.global.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cloud.paolu.xray.transport.global.Config other) {
      if (other == cloud.paolu.xray.transport.global.Config.getDefaultInstance()) return this;
      if (transportSettingsBuilder_ == null) {
        if (!other.transportSettings_.isEmpty()) {
          if (transportSettings_.isEmpty()) {
            transportSettings_ = other.transportSettings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTransportSettingsIsMutable();
            transportSettings_.addAll(other.transportSettings_);
          }
          onChanged();
        }
      } else {
        if (!other.transportSettings_.isEmpty()) {
          if (transportSettingsBuilder_.isEmpty()) {
            transportSettingsBuilder_.dispose();
            transportSettingsBuilder_ = null;
            transportSettings_ = other.transportSettings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            transportSettingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTransportSettingsFieldBuilder() : null;
          } else {
            transportSettingsBuilder_.addAllMessages(other.transportSettings_);
          }
        }
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
              cloud.paolu.xray.transport.internet.TransportConfig m =
                  input.readMessage(
                      cloud.paolu.xray.transport.internet.TransportConfig.parser(),
                      extensionRegistry);
              if (transportSettingsBuilder_ == null) {
                ensureTransportSettingsIsMutable();
                transportSettings_.add(m);
              } else {
                transportSettingsBuilder_.addMessage(m);
              }
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

    private java.util.List<cloud.paolu.xray.transport.internet.TransportConfig> transportSettings_ =
      java.util.Collections.emptyList();
    private void ensureTransportSettingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        transportSettings_ = new java.util.ArrayList<cloud.paolu.xray.transport.internet.TransportConfig>(transportSettings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cloud.paolu.xray.transport.internet.TransportConfig, cloud.paolu.xray.transport.internet.TransportConfig.Builder, cloud.paolu.xray.transport.internet.TransportConfigOrBuilder> transportSettingsBuilder_;

    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public java.util.List<cloud.paolu.xray.transport.internet.TransportConfig> getTransportSettingsList() {
      if (transportSettingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(transportSettings_);
      } else {
        return transportSettingsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public int getTransportSettingsCount() {
      if (transportSettingsBuilder_ == null) {
        return transportSettings_.size();
      } else {
        return transportSettingsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public cloud.paolu.xray.transport.internet.TransportConfig getTransportSettings(int index) {
      if (transportSettingsBuilder_ == null) {
        return transportSettings_.get(index);
      } else {
        return transportSettingsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder setTransportSettings(
        int index, cloud.paolu.xray.transport.internet.TransportConfig value) {
      if (transportSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransportSettingsIsMutable();
        transportSettings_.set(index, value);
        onChanged();
      } else {
        transportSettingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder setTransportSettings(
        int index, cloud.paolu.xray.transport.internet.TransportConfig.Builder builderForValue) {
      if (transportSettingsBuilder_ == null) {
        ensureTransportSettingsIsMutable();
        transportSettings_.set(index, builderForValue.build());
        onChanged();
      } else {
        transportSettingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder addTransportSettings(cloud.paolu.xray.transport.internet.TransportConfig value) {
      if (transportSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransportSettingsIsMutable();
        transportSettings_.add(value);
        onChanged();
      } else {
        transportSettingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder addTransportSettings(
        int index, cloud.paolu.xray.transport.internet.TransportConfig value) {
      if (transportSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransportSettingsIsMutable();
        transportSettings_.add(index, value);
        onChanged();
      } else {
        transportSettingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder addTransportSettings(
        cloud.paolu.xray.transport.internet.TransportConfig.Builder builderForValue) {
      if (transportSettingsBuilder_ == null) {
        ensureTransportSettingsIsMutable();
        transportSettings_.add(builderForValue.build());
        onChanged();
      } else {
        transportSettingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder addTransportSettings(
        int index, cloud.paolu.xray.transport.internet.TransportConfig.Builder builderForValue) {
      if (transportSettingsBuilder_ == null) {
        ensureTransportSettingsIsMutable();
        transportSettings_.add(index, builderForValue.build());
        onChanged();
      } else {
        transportSettingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder addAllTransportSettings(
        java.lang.Iterable<? extends cloud.paolu.xray.transport.internet.TransportConfig> values) {
      if (transportSettingsBuilder_ == null) {
        ensureTransportSettingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, transportSettings_);
        onChanged();
      } else {
        transportSettingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder clearTransportSettings() {
      if (transportSettingsBuilder_ == null) {
        transportSettings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        transportSettingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public Builder removeTransportSettings(int index) {
      if (transportSettingsBuilder_ == null) {
        ensureTransportSettingsIsMutable();
        transportSettings_.remove(index);
        onChanged();
      } else {
        transportSettingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public cloud.paolu.xray.transport.internet.TransportConfig.Builder getTransportSettingsBuilder(
        int index) {
      return getTransportSettingsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public cloud.paolu.xray.transport.internet.TransportConfigOrBuilder getTransportSettingsOrBuilder(
        int index) {
      if (transportSettingsBuilder_ == null) {
        return transportSettings_.get(index);  } else {
        return transportSettingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public java.util.List<? extends cloud.paolu.xray.transport.internet.TransportConfigOrBuilder> 
         getTransportSettingsOrBuilderList() {
      if (transportSettingsBuilder_ != null) {
        return transportSettingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(transportSettings_);
      }
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public cloud.paolu.xray.transport.internet.TransportConfig.Builder addTransportSettingsBuilder() {
      return getTransportSettingsFieldBuilder().addBuilder(
          cloud.paolu.xray.transport.internet.TransportConfig.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public cloud.paolu.xray.transport.internet.TransportConfig.Builder addTransportSettingsBuilder(
        int index) {
      return getTransportSettingsFieldBuilder().addBuilder(
          index, cloud.paolu.xray.transport.internet.TransportConfig.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.transport.internet.TransportConfig transport_settings = 1;</code>
     */
    public java.util.List<cloud.paolu.xray.transport.internet.TransportConfig.Builder> 
         getTransportSettingsBuilderList() {
      return getTransportSettingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cloud.paolu.xray.transport.internet.TransportConfig, cloud.paolu.xray.transport.internet.TransportConfig.Builder, cloud.paolu.xray.transport.internet.TransportConfigOrBuilder> 
        getTransportSettingsFieldBuilder() {
      if (transportSettingsBuilder_ == null) {
        transportSettingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cloud.paolu.xray.transport.internet.TransportConfig, cloud.paolu.xray.transport.internet.TransportConfig.Builder, cloud.paolu.xray.transport.internet.TransportConfigOrBuilder>(
                transportSettings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        transportSettings_ = null;
      }
      return transportSettingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xray.transport.Config)
  }

  // @@protoc_insertion_point(class_scope:xray.transport.Config)
  private static final cloud.paolu.xray.transport.global.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cloud.paolu.xray.transport.global.Config();
  }

  public static cloud.paolu.xray.transport.global.Config getDefaultInstance() {
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
  public cloud.paolu.xray.transport.global.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

