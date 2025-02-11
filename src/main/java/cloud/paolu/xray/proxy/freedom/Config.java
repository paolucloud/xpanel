// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/freedom/config.proto

package cloud.paolu.xray.proxy.freedom;

/**
 * Protobuf type {@code xray.proxy.freedom.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.proxy.freedom.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    domainStrategy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Config();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cloud.paolu.xray.proxy.freedom.ConfigOuterClass.internal_static_xray_proxy_freedom_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cloud.paolu.xray.proxy.freedom.ConfigOuterClass.internal_static_xray_proxy_freedom_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cloud.paolu.xray.proxy.freedom.Config.class, cloud.paolu.xray.proxy.freedom.Config.Builder.class);
  }

  /**
   * Protobuf enum {@code xray.proxy.freedom.Config.DomainStrategy}
   */
  public enum DomainStrategy
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>AS_IS = 0;</code>
     */
    AS_IS(0),
    /**
     * <code>USE_IP = 1;</code>
     */
    USE_IP(1),
    /**
     * <code>USE_IP4 = 2;</code>
     */
    USE_IP4(2),
    /**
     * <code>USE_IP6 = 3;</code>
     */
    USE_IP6(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>AS_IS = 0;</code>
     */
    public static final int AS_IS_VALUE = 0;
    /**
     * <code>USE_IP = 1;</code>
     */
    public static final int USE_IP_VALUE = 1;
    /**
     * <code>USE_IP4 = 2;</code>
     */
    public static final int USE_IP4_VALUE = 2;
    /**
     * <code>USE_IP6 = 3;</code>
     */
    public static final int USE_IP6_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DomainStrategy valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DomainStrategy forNumber(int value) {
      switch (value) {
        case 0: return AS_IS;
        case 1: return USE_IP;
        case 2: return USE_IP4;
        case 3: return USE_IP6;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DomainStrategy>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DomainStrategy> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DomainStrategy>() {
            public DomainStrategy findValueByNumber(int number) {
              return DomainStrategy.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return cloud.paolu.xray.proxy.freedom.Config.getDescriptor().getEnumTypes().get(0);
    }

    private static final DomainStrategy[] VALUES = values();

    public static DomainStrategy valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DomainStrategy(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:xray.proxy.freedom.Config.DomainStrategy)
  }

  public static final int DOMAIN_STRATEGY_FIELD_NUMBER = 1;
  private int domainStrategy_ = 0;
  /**
   * <code>.xray.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
   * @return The enum numeric value on the wire for domainStrategy.
   */
  @java.lang.Override public int getDomainStrategyValue() {
    return domainStrategy_;
  }
  /**
   * <code>.xray.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
   * @return The domainStrategy.
   */
  @java.lang.Override public cloud.paolu.xray.proxy.freedom.Config.DomainStrategy getDomainStrategy() {
    cloud.paolu.xray.proxy.freedom.Config.DomainStrategy result = cloud.paolu.xray.proxy.freedom.Config.DomainStrategy.forNumber(domainStrategy_);
    return result == null ? cloud.paolu.xray.proxy.freedom.Config.DomainStrategy.UNRECOGNIZED : result;
  }

  public static final int TIMEOUT_FIELD_NUMBER = 2;
  private int timeout_ = 0;
  /**
   * <code>uint32 timeout = 2 [deprecated = true];</code>
   * @deprecated xray.proxy.freedom.Config.timeout is deprecated.
   *     See proxy/freedom/config.proto;l=31
   * @return The timeout.
   */
  @java.lang.Override
  @java.lang.Deprecated public int getTimeout() {
    return timeout_;
  }

  public static final int DESTINATION_OVERRIDE_FIELD_NUMBER = 3;
  private cloud.paolu.xray.proxy.freedom.DestinationOverride destinationOverride_;
  /**
   * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
   * @return Whether the destinationOverride field is set.
   */
  @java.lang.Override
  public boolean hasDestinationOverride() {
    return destinationOverride_ != null;
  }
  /**
   * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
   * @return The destinationOverride.
   */
  @java.lang.Override
  public cloud.paolu.xray.proxy.freedom.DestinationOverride getDestinationOverride() {
    return destinationOverride_ == null ? cloud.paolu.xray.proxy.freedom.DestinationOverride.getDefaultInstance() : destinationOverride_;
  }
  /**
   * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
   */
  @java.lang.Override
  public cloud.paolu.xray.proxy.freedom.DestinationOverrideOrBuilder getDestinationOverrideOrBuilder() {
    return destinationOverride_ == null ? cloud.paolu.xray.proxy.freedom.DestinationOverride.getDefaultInstance() : destinationOverride_;
  }

  public static final int USER_LEVEL_FIELD_NUMBER = 4;
  private int userLevel_ = 0;
  /**
   * <code>uint32 user_level = 4;</code>
   * @return The userLevel.
   */
  @java.lang.Override
  public int getUserLevel() {
    return userLevel_;
  }

  public static final int FRAGMENT_FIELD_NUMBER = 5;
  private cloud.paolu.xray.proxy.freedom.Fragment fragment_;
  /**
   * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
   * @return Whether the fragment field is set.
   */
  @java.lang.Override
  public boolean hasFragment() {
    return fragment_ != null;
  }
  /**
   * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
   * @return The fragment.
   */
  @java.lang.Override
  public cloud.paolu.xray.proxy.freedom.Fragment getFragment() {
    return fragment_ == null ? cloud.paolu.xray.proxy.freedom.Fragment.getDefaultInstance() : fragment_;
  }
  /**
   * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
   */
  @java.lang.Override
  public cloud.paolu.xray.proxy.freedom.FragmentOrBuilder getFragmentOrBuilder() {
    return fragment_ == null ? cloud.paolu.xray.proxy.freedom.Fragment.getDefaultInstance() : fragment_;
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
    if (domainStrategy_ != cloud.paolu.xray.proxy.freedom.Config.DomainStrategy.AS_IS.getNumber()) {
      output.writeEnum(1, domainStrategy_);
    }
    if (timeout_ != 0) {
      output.writeUInt32(2, timeout_);
    }
    if (destinationOverride_ != null) {
      output.writeMessage(3, getDestinationOverride());
    }
    if (userLevel_ != 0) {
      output.writeUInt32(4, userLevel_);
    }
    if (fragment_ != null) {
      output.writeMessage(5, getFragment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (domainStrategy_ != cloud.paolu.xray.proxy.freedom.Config.DomainStrategy.AS_IS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, domainStrategy_);
    }
    if (timeout_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, timeout_);
    }
    if (destinationOverride_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDestinationOverride());
    }
    if (userLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, userLevel_);
    }
    if (fragment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getFragment());
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
    if (!(obj instanceof cloud.paolu.xray.proxy.freedom.Config)) {
      return super.equals(obj);
    }
    cloud.paolu.xray.proxy.freedom.Config other = (cloud.paolu.xray.proxy.freedom.Config) obj;

    if (domainStrategy_ != other.domainStrategy_) return false;
    if (getTimeout()
        != other.getTimeout()) return false;
    if (hasDestinationOverride() != other.hasDestinationOverride()) return false;
    if (hasDestinationOverride()) {
      if (!getDestinationOverride()
          .equals(other.getDestinationOverride())) return false;
    }
    if (getUserLevel()
        != other.getUserLevel()) return false;
    if (hasFragment() != other.hasFragment()) return false;
    if (hasFragment()) {
      if (!getFragment()
          .equals(other.getFragment())) return false;
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
    hash = (37 * hash) + DOMAIN_STRATEGY_FIELD_NUMBER;
    hash = (53 * hash) + domainStrategy_;
    hash = (37 * hash) + TIMEOUT_FIELD_NUMBER;
    hash = (53 * hash) + getTimeout();
    if (hasDestinationOverride()) {
      hash = (37 * hash) + DESTINATION_OVERRIDE_FIELD_NUMBER;
      hash = (53 * hash) + getDestinationOverride().hashCode();
    }
    hash = (37 * hash) + USER_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getUserLevel();
    if (hasFragment()) {
      hash = (37 * hash) + FRAGMENT_FIELD_NUMBER;
      hash = (53 * hash) + getFragment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cloud.paolu.xray.proxy.freedom.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.proxy.freedom.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.freedom.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.proxy.freedom.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.freedom.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.proxy.freedom.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.freedom.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.proxy.freedom.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cloud.paolu.xray.proxy.freedom.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cloud.paolu.xray.proxy.freedom.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.freedom.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.proxy.freedom.Config parseFrom(
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
  public static Builder newBuilder(cloud.paolu.xray.proxy.freedom.Config prototype) {
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
   * Protobuf type {@code xray.proxy.freedom.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.proxy.freedom.Config)
      cloud.paolu.xray.proxy.freedom.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cloud.paolu.xray.proxy.freedom.ConfigOuterClass.internal_static_xray_proxy_freedom_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cloud.paolu.xray.proxy.freedom.ConfigOuterClass.internal_static_xray_proxy_freedom_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cloud.paolu.xray.proxy.freedom.Config.class, cloud.paolu.xray.proxy.freedom.Config.Builder.class);
    }

    // Construct using cloud.paolu.xray.proxy.freedom.Config.newBuilder()
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
      domainStrategy_ = 0;
      timeout_ = 0;
      destinationOverride_ = null;
      if (destinationOverrideBuilder_ != null) {
        destinationOverrideBuilder_.dispose();
        destinationOverrideBuilder_ = null;
      }
      userLevel_ = 0;
      fragment_ = null;
      if (fragmentBuilder_ != null) {
        fragmentBuilder_.dispose();
        fragmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cloud.paolu.xray.proxy.freedom.ConfigOuterClass.internal_static_xray_proxy_freedom_Config_descriptor;
    }

    @java.lang.Override
    public cloud.paolu.xray.proxy.freedom.Config getDefaultInstanceForType() {
      return cloud.paolu.xray.proxy.freedom.Config.getDefaultInstance();
    }

    @java.lang.Override
    public cloud.paolu.xray.proxy.freedom.Config build() {
      cloud.paolu.xray.proxy.freedom.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cloud.paolu.xray.proxy.freedom.Config buildPartial() {
      cloud.paolu.xray.proxy.freedom.Config result = new cloud.paolu.xray.proxy.freedom.Config(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cloud.paolu.xray.proxy.freedom.Config result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.domainStrategy_ = domainStrategy_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeout_ = timeout_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.destinationOverride_ = destinationOverrideBuilder_ == null
            ? destinationOverride_
            : destinationOverrideBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.userLevel_ = userLevel_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.fragment_ = fragmentBuilder_ == null
            ? fragment_
            : fragmentBuilder_.build();
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
      if (other instanceof cloud.paolu.xray.proxy.freedom.Config) {
        return mergeFrom((cloud.paolu.xray.proxy.freedom.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cloud.paolu.xray.proxy.freedom.Config other) {
      if (other == cloud.paolu.xray.proxy.freedom.Config.getDefaultInstance()) return this;
      if (other.domainStrategy_ != 0) {
        setDomainStrategyValue(other.getDomainStrategyValue());
      }
      if (other.getTimeout() != 0) {
        setTimeout(other.getTimeout());
      }
      if (other.hasDestinationOverride()) {
        mergeDestinationOverride(other.getDestinationOverride());
      }
      if (other.getUserLevel() != 0) {
        setUserLevel(other.getUserLevel());
      }
      if (other.hasFragment()) {
        mergeFragment(other.getFragment());
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
              domainStrategy_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              timeout_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getDestinationOverrideFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              userLevel_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getFragmentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private int domainStrategy_ = 0;
    /**
     * <code>.xray.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
     * @return The enum numeric value on the wire for domainStrategy.
     */
    @java.lang.Override public int getDomainStrategyValue() {
      return domainStrategy_;
    }
    /**
     * <code>.xray.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
     * @param value The enum numeric value on the wire for domainStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setDomainStrategyValue(int value) {
      domainStrategy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
     * @return The domainStrategy.
     */
    @java.lang.Override
    public cloud.paolu.xray.proxy.freedom.Config.DomainStrategy getDomainStrategy() {
      cloud.paolu.xray.proxy.freedom.Config.DomainStrategy result = cloud.paolu.xray.proxy.freedom.Config.DomainStrategy.forNumber(domainStrategy_);
      return result == null ? cloud.paolu.xray.proxy.freedom.Config.DomainStrategy.UNRECOGNIZED : result;
    }
    /**
     * <code>.xray.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
     * @param value The domainStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setDomainStrategy(cloud.paolu.xray.proxy.freedom.Config.DomainStrategy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      domainStrategy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.xray.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomainStrategy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      domainStrategy_ = 0;
      onChanged();
      return this;
    }

    private int timeout_ ;
    /**
     * <code>uint32 timeout = 2 [deprecated = true];</code>
     * @deprecated xray.proxy.freedom.Config.timeout is deprecated.
     *     See proxy/freedom/config.proto;l=31
     * @return The timeout.
     */
    @java.lang.Override
    @java.lang.Deprecated public int getTimeout() {
      return timeout_;
    }
    /**
     * <code>uint32 timeout = 2 [deprecated = true];</code>
     * @deprecated xray.proxy.freedom.Config.timeout is deprecated.
     *     See proxy/freedom/config.proto;l=31
     * @param value The timeout to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setTimeout(int value) {

      timeout_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 timeout = 2 [deprecated = true];</code>
     * @deprecated xray.proxy.freedom.Config.timeout is deprecated.
     *     See proxy/freedom/config.proto;l=31
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearTimeout() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timeout_ = 0;
      onChanged();
      return this;
    }

    private cloud.paolu.xray.proxy.freedom.DestinationOverride destinationOverride_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cloud.paolu.xray.proxy.freedom.DestinationOverride, cloud.paolu.xray.proxy.freedom.DestinationOverride.Builder, cloud.paolu.xray.proxy.freedom.DestinationOverrideOrBuilder> destinationOverrideBuilder_;
    /**
     * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
     * @return Whether the destinationOverride field is set.
     */
    public boolean hasDestinationOverride() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
     * @return The destinationOverride.
     */
    public cloud.paolu.xray.proxy.freedom.DestinationOverride getDestinationOverride() {
      if (destinationOverrideBuilder_ == null) {
        return destinationOverride_ == null ? cloud.paolu.xray.proxy.freedom.DestinationOverride.getDefaultInstance() : destinationOverride_;
      } else {
        return destinationOverrideBuilder_.getMessage();
      }
    }
    /**
     * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public Builder setDestinationOverride(cloud.paolu.xray.proxy.freedom.DestinationOverride value) {
      if (destinationOverrideBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        destinationOverride_ = value;
      } else {
        destinationOverrideBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public Builder setDestinationOverride(
        cloud.paolu.xray.proxy.freedom.DestinationOverride.Builder builderForValue) {
      if (destinationOverrideBuilder_ == null) {
        destinationOverride_ = builderForValue.build();
      } else {
        destinationOverrideBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public Builder mergeDestinationOverride(cloud.paolu.xray.proxy.freedom.DestinationOverride value) {
      if (destinationOverrideBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          destinationOverride_ != null &&
          destinationOverride_ != cloud.paolu.xray.proxy.freedom.DestinationOverride.getDefaultInstance()) {
          getDestinationOverrideBuilder().mergeFrom(value);
        } else {
          destinationOverride_ = value;
        }
      } else {
        destinationOverrideBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public Builder clearDestinationOverride() {
      bitField0_ = (bitField0_ & ~0x00000004);
      destinationOverride_ = null;
      if (destinationOverrideBuilder_ != null) {
        destinationOverrideBuilder_.dispose();
        destinationOverrideBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public cloud.paolu.xray.proxy.freedom.DestinationOverride.Builder getDestinationOverrideBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDestinationOverrideFieldBuilder().getBuilder();
    }
    /**
     * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public cloud.paolu.xray.proxy.freedom.DestinationOverrideOrBuilder getDestinationOverrideOrBuilder() {
      if (destinationOverrideBuilder_ != null) {
        return destinationOverrideBuilder_.getMessageOrBuilder();
      } else {
        return destinationOverride_ == null ?
            cloud.paolu.xray.proxy.freedom.DestinationOverride.getDefaultInstance() : destinationOverride_;
      }
    }
    /**
     * <code>.xray.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cloud.paolu.xray.proxy.freedom.DestinationOverride, cloud.paolu.xray.proxy.freedom.DestinationOverride.Builder, cloud.paolu.xray.proxy.freedom.DestinationOverrideOrBuilder> 
        getDestinationOverrideFieldBuilder() {
      if (destinationOverrideBuilder_ == null) {
        destinationOverrideBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cloud.paolu.xray.proxy.freedom.DestinationOverride, cloud.paolu.xray.proxy.freedom.DestinationOverride.Builder, cloud.paolu.xray.proxy.freedom.DestinationOverrideOrBuilder>(
                getDestinationOverride(),
                getParentForChildren(),
                isClean());
        destinationOverride_ = null;
      }
      return destinationOverrideBuilder_;
    }

    private int userLevel_ ;
    /**
     * <code>uint32 user_level = 4;</code>
     * @return The userLevel.
     */
    @java.lang.Override
    public int getUserLevel() {
      return userLevel_;
    }
    /**
     * <code>uint32 user_level = 4;</code>
     * @param value The userLevel to set.
     * @return This builder for chaining.
     */
    public Builder setUserLevel(int value) {

      userLevel_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 user_level = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserLevel() {
      bitField0_ = (bitField0_ & ~0x00000008);
      userLevel_ = 0;
      onChanged();
      return this;
    }

    private cloud.paolu.xray.proxy.freedom.Fragment fragment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cloud.paolu.xray.proxy.freedom.Fragment, cloud.paolu.xray.proxy.freedom.Fragment.Builder, cloud.paolu.xray.proxy.freedom.FragmentOrBuilder> fragmentBuilder_;
    /**
     * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
     * @return Whether the fragment field is set.
     */
    public boolean hasFragment() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
     * @return The fragment.
     */
    public cloud.paolu.xray.proxy.freedom.Fragment getFragment() {
      if (fragmentBuilder_ == null) {
        return fragment_ == null ? cloud.paolu.xray.proxy.freedom.Fragment.getDefaultInstance() : fragment_;
      } else {
        return fragmentBuilder_.getMessage();
      }
    }
    /**
     * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
     */
    public Builder setFragment(cloud.paolu.xray.proxy.freedom.Fragment value) {
      if (fragmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fragment_ = value;
      } else {
        fragmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
     */
    public Builder setFragment(
        cloud.paolu.xray.proxy.freedom.Fragment.Builder builderForValue) {
      if (fragmentBuilder_ == null) {
        fragment_ = builderForValue.build();
      } else {
        fragmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
     */
    public Builder mergeFragment(cloud.paolu.xray.proxy.freedom.Fragment value) {
      if (fragmentBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          fragment_ != null &&
          fragment_ != cloud.paolu.xray.proxy.freedom.Fragment.getDefaultInstance()) {
          getFragmentBuilder().mergeFrom(value);
        } else {
          fragment_ = value;
        }
      } else {
        fragmentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
     */
    public Builder clearFragment() {
      bitField0_ = (bitField0_ & ~0x00000010);
      fragment_ = null;
      if (fragmentBuilder_ != null) {
        fragmentBuilder_.dispose();
        fragmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
     */
    public cloud.paolu.xray.proxy.freedom.Fragment.Builder getFragmentBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getFragmentFieldBuilder().getBuilder();
    }
    /**
     * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
     */
    public cloud.paolu.xray.proxy.freedom.FragmentOrBuilder getFragmentOrBuilder() {
      if (fragmentBuilder_ != null) {
        return fragmentBuilder_.getMessageOrBuilder();
      } else {
        return fragment_ == null ?
            cloud.paolu.xray.proxy.freedom.Fragment.getDefaultInstance() : fragment_;
      }
    }
    /**
     * <code>.xray.proxy.freedom.Fragment fragment = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cloud.paolu.xray.proxy.freedom.Fragment, cloud.paolu.xray.proxy.freedom.Fragment.Builder, cloud.paolu.xray.proxy.freedom.FragmentOrBuilder> 
        getFragmentFieldBuilder() {
      if (fragmentBuilder_ == null) {
        fragmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cloud.paolu.xray.proxy.freedom.Fragment, cloud.paolu.xray.proxy.freedom.Fragment.Builder, cloud.paolu.xray.proxy.freedom.FragmentOrBuilder>(
                getFragment(),
                getParentForChildren(),
                isClean());
        fragment_ = null;
      }
      return fragmentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xray.proxy.freedom.Config)
  }

  // @@protoc_insertion_point(class_scope:xray.proxy.freedom.Config)
  private static final cloud.paolu.xray.proxy.freedom.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cloud.paolu.xray.proxy.freedom.Config();
  }

  public static cloud.paolu.xray.proxy.freedom.Config getDefaultInstance() {
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
  public cloud.paolu.xray.proxy.freedom.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

