// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/shadowsocks/config.proto

package cloud.paolu.xray.proxy.shadowsocks;

/**
 * Protobuf type {@code xray.proxy.shadowsocks.ServerConfig}
 */
public final class ServerConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.proxy.shadowsocks.ServerConfig)
    ServerConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerConfig.newBuilder() to construct.
  private ServerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerConfig() {
    users_ = java.util.Collections.emptyList();
    network_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServerConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cloud.paolu.xray.proxy.shadowsocks.Config.internal_static_xray_proxy_shadowsocks_ServerConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cloud.paolu.xray.proxy.shadowsocks.Config.internal_static_xray_proxy_shadowsocks_ServerConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cloud.paolu.xray.proxy.shadowsocks.ServerConfig.class, cloud.paolu.xray.proxy.shadowsocks.ServerConfig.Builder.class);
  }

  public static final int USERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<cloud.paolu.xray.common.protocol.User> users_;
  /**
   * <code>repeated .xray.common.protocol.User users = 1;</code>
   */
  @java.lang.Override
  public java.util.List<cloud.paolu.xray.common.protocol.User> getUsersList() {
    return users_;
  }
  /**
   * <code>repeated .xray.common.protocol.User users = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends cloud.paolu.xray.common.protocol.UserOrBuilder> 
      getUsersOrBuilderList() {
    return users_;
  }
  /**
   * <code>repeated .xray.common.protocol.User users = 1;</code>
   */
  @java.lang.Override
  public int getUsersCount() {
    return users_.size();
  }
  /**
   * <code>repeated .xray.common.protocol.User users = 1;</code>
   */
  @java.lang.Override
  public cloud.paolu.xray.common.protocol.User getUsers(int index) {
    return users_.get(index);
  }
  /**
   * <code>repeated .xray.common.protocol.User users = 1;</code>
   */
  @java.lang.Override
  public cloud.paolu.xray.common.protocol.UserOrBuilder getUsersOrBuilder(
      int index) {
    return users_.get(index);
  }

  public static final int NETWORK_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> network_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, cloud.paolu.xray.common.net.Network> network_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, cloud.paolu.xray.common.net.Network>() {
            public cloud.paolu.xray.common.net.Network convert(java.lang.Integer from) {
              cloud.paolu.xray.common.net.Network result = cloud.paolu.xray.common.net.Network.forNumber(from);
              return result == null ? cloud.paolu.xray.common.net.Network.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .xray.common.net.Network network = 2;</code>
   * @return A list containing the network.
   */
  @java.lang.Override
  public java.util.List<cloud.paolu.xray.common.net.Network> getNetworkList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, cloud.paolu.xray.common.net.Network>(network_, network_converter_);
  }
  /**
   * <code>repeated .xray.common.net.Network network = 2;</code>
   * @return The count of network.
   */
  @java.lang.Override
  public int getNetworkCount() {
    return network_.size();
  }
  /**
   * <code>repeated .xray.common.net.Network network = 2;</code>
   * @param index The index of the element to return.
   * @return The network at the given index.
   */
  @java.lang.Override
  public cloud.paolu.xray.common.net.Network getNetwork(int index) {
    return network_converter_.convert(network_.get(index));
  }
  /**
   * <code>repeated .xray.common.net.Network network = 2;</code>
   * @return A list containing the enum numeric values on the wire for network.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getNetworkValueList() {
    return network_;
  }
  /**
   * <code>repeated .xray.common.net.Network network = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of network at the given index.
   */
  @java.lang.Override
  public int getNetworkValue(int index) {
    return network_.get(index);
  }
  private int networkMemoizedSerializedSize;

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
    getSerializedSize();
    for (int i = 0; i < users_.size(); i++) {
      output.writeMessage(1, users_.get(i));
    }
    if (getNetworkList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(networkMemoizedSerializedSize);
    }
    for (int i = 0; i < network_.size(); i++) {
      output.writeEnumNoTag(network_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < users_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, users_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < network_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(network_.get(i));
      }
      size += dataSize;
      if (!getNetworkList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }networkMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof cloud.paolu.xray.proxy.shadowsocks.ServerConfig)) {
      return super.equals(obj);
    }
    cloud.paolu.xray.proxy.shadowsocks.ServerConfig other = (cloud.paolu.xray.proxy.shadowsocks.ServerConfig) obj;

    if (!getUsersList()
        .equals(other.getUsersList())) return false;
    if (!network_.equals(other.network_)) return false;
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
    if (getUsersCount() > 0) {
      hash = (37 * hash) + USERS_FIELD_NUMBER;
      hash = (53 * hash) + getUsersList().hashCode();
    }
    if (getNetworkCount() > 0) {
      hash = (37 * hash) + NETWORK_FIELD_NUMBER;
      hash = (53 * hash) + network_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig parseFrom(
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
  public static Builder newBuilder(cloud.paolu.xray.proxy.shadowsocks.ServerConfig prototype) {
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
   * Protobuf type {@code xray.proxy.shadowsocks.ServerConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.proxy.shadowsocks.ServerConfig)
      cloud.paolu.xray.proxy.shadowsocks.ServerConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cloud.paolu.xray.proxy.shadowsocks.Config.internal_static_xray_proxy_shadowsocks_ServerConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cloud.paolu.xray.proxy.shadowsocks.Config.internal_static_xray_proxy_shadowsocks_ServerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cloud.paolu.xray.proxy.shadowsocks.ServerConfig.class, cloud.paolu.xray.proxy.shadowsocks.ServerConfig.Builder.class);
    }

    // Construct using cloud.paolu.xray.proxy.shadowsocks.ServerConfig.newBuilder()
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
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
      } else {
        users_ = null;
        usersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      network_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cloud.paolu.xray.proxy.shadowsocks.Config.internal_static_xray_proxy_shadowsocks_ServerConfig_descriptor;
    }

    @java.lang.Override
    public cloud.paolu.xray.proxy.shadowsocks.ServerConfig getDefaultInstanceForType() {
      return cloud.paolu.xray.proxy.shadowsocks.ServerConfig.getDefaultInstance();
    }

    @java.lang.Override
    public cloud.paolu.xray.proxy.shadowsocks.ServerConfig build() {
      cloud.paolu.xray.proxy.shadowsocks.ServerConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cloud.paolu.xray.proxy.shadowsocks.ServerConfig buildPartial() {
      cloud.paolu.xray.proxy.shadowsocks.ServerConfig result = new cloud.paolu.xray.proxy.shadowsocks.ServerConfig(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(cloud.paolu.xray.proxy.shadowsocks.ServerConfig result) {
      if (usersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          users_ = java.util.Collections.unmodifiableList(users_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.users_ = users_;
      } else {
        result.users_ = usersBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        network_ = java.util.Collections.unmodifiableList(network_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.network_ = network_;
    }

    private void buildPartial0(cloud.paolu.xray.proxy.shadowsocks.ServerConfig result) {
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
      if (other instanceof cloud.paolu.xray.proxy.shadowsocks.ServerConfig) {
        return mergeFrom((cloud.paolu.xray.proxy.shadowsocks.ServerConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cloud.paolu.xray.proxy.shadowsocks.ServerConfig other) {
      if (other == cloud.paolu.xray.proxy.shadowsocks.ServerConfig.getDefaultInstance()) return this;
      if (usersBuilder_ == null) {
        if (!other.users_.isEmpty()) {
          if (users_.isEmpty()) {
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUsersIsMutable();
            users_.addAll(other.users_);
          }
          onChanged();
        }
      } else {
        if (!other.users_.isEmpty()) {
          if (usersBuilder_.isEmpty()) {
            usersBuilder_.dispose();
            usersBuilder_ = null;
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
            usersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUsersFieldBuilder() : null;
          } else {
            usersBuilder_.addAllMessages(other.users_);
          }
        }
      }
      if (!other.network_.isEmpty()) {
        if (network_.isEmpty()) {
          network_ = other.network_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureNetworkIsMutable();
          network_.addAll(other.network_);
        }
        onChanged();
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
              cloud.paolu.xray.common.protocol.User m =
                  input.readMessage(
                      cloud.paolu.xray.common.protocol.User.parser(),
                      extensionRegistry);
              if (usersBuilder_ == null) {
                ensureUsersIsMutable();
                users_.add(m);
              } else {
                usersBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              int tmpRaw = input.readEnum();
              ensureNetworkIsMutable();
              network_.add(tmpRaw);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureNetworkIsMutable();
                network_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
              break;
            } // case 18
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

    private java.util.List<cloud.paolu.xray.common.protocol.User> users_ =
      java.util.Collections.emptyList();
    private void ensureUsersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        users_ = new java.util.ArrayList<cloud.paolu.xray.common.protocol.User>(users_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cloud.paolu.xray.common.protocol.User, cloud.paolu.xray.common.protocol.User.Builder, cloud.paolu.xray.common.protocol.UserOrBuilder> usersBuilder_;

    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public java.util.List<cloud.paolu.xray.common.protocol.User> getUsersList() {
      if (usersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(users_);
      } else {
        return usersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public int getUsersCount() {
      if (usersBuilder_ == null) {
        return users_.size();
      } else {
        return usersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public cloud.paolu.xray.common.protocol.User getUsers(int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);
      } else {
        return usersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public Builder setUsers(
        int index, cloud.paolu.xray.common.protocol.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.set(index, value);
        onChanged();
      } else {
        usersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public Builder setUsers(
        int index, cloud.paolu.xray.common.protocol.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.set(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public Builder addUsers(cloud.paolu.xray.common.protocol.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(value);
        onChanged();
      } else {
        usersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public Builder addUsers(
        int index, cloud.paolu.xray.common.protocol.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(index, value);
        onChanged();
      } else {
        usersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public Builder addUsers(
        cloud.paolu.xray.common.protocol.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public Builder addUsers(
        int index, cloud.paolu.xray.common.protocol.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public Builder addAllUsers(
        java.lang.Iterable<? extends cloud.paolu.xray.common.protocol.User> values) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, users_);
        onChanged();
      } else {
        usersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public Builder clearUsers() {
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        usersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public Builder removeUsers(int index) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.remove(index);
        onChanged();
      } else {
        usersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public cloud.paolu.xray.common.protocol.User.Builder getUsersBuilder(
        int index) {
      return getUsersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public cloud.paolu.xray.common.protocol.UserOrBuilder getUsersOrBuilder(
        int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);  } else {
        return usersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public java.util.List<? extends cloud.paolu.xray.common.protocol.UserOrBuilder> 
         getUsersOrBuilderList() {
      if (usersBuilder_ != null) {
        return usersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(users_);
      }
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public cloud.paolu.xray.common.protocol.User.Builder addUsersBuilder() {
      return getUsersFieldBuilder().addBuilder(
          cloud.paolu.xray.common.protocol.User.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public cloud.paolu.xray.common.protocol.User.Builder addUsersBuilder(
        int index) {
      return getUsersFieldBuilder().addBuilder(
          index, cloud.paolu.xray.common.protocol.User.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.common.protocol.User users = 1;</code>
     */
    public java.util.List<cloud.paolu.xray.common.protocol.User.Builder> 
         getUsersBuilderList() {
      return getUsersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cloud.paolu.xray.common.protocol.User, cloud.paolu.xray.common.protocol.User.Builder, cloud.paolu.xray.common.protocol.UserOrBuilder> 
        getUsersFieldBuilder() {
      if (usersBuilder_ == null) {
        usersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cloud.paolu.xray.common.protocol.User, cloud.paolu.xray.common.protocol.User.Builder, cloud.paolu.xray.common.protocol.UserOrBuilder>(
                users_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        users_ = null;
      }
      return usersBuilder_;
    }

    private java.util.List<java.lang.Integer> network_ =
      java.util.Collections.emptyList();
    private void ensureNetworkIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        network_ = new java.util.ArrayList<java.lang.Integer>(network_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @return A list containing the network.
     */
    public java.util.List<cloud.paolu.xray.common.net.Network> getNetworkList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, cloud.paolu.xray.common.net.Network>(network_, network_converter_);
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @return The count of network.
     */
    public int getNetworkCount() {
      return network_.size();
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @param index The index of the element to return.
     * @return The network at the given index.
     */
    public cloud.paolu.xray.common.net.Network getNetwork(int index) {
      return network_converter_.convert(network_.get(index));
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @param index The index to set the value at.
     * @param value The network to set.
     * @return This builder for chaining.
     */
    public Builder setNetwork(
        int index, cloud.paolu.xray.common.net.Network value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNetworkIsMutable();
      network_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @param value The network to add.
     * @return This builder for chaining.
     */
    public Builder addNetwork(cloud.paolu.xray.common.net.Network value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNetworkIsMutable();
      network_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @param values The network to add.
     * @return This builder for chaining.
     */
    public Builder addAllNetwork(
        java.lang.Iterable<? extends cloud.paolu.xray.common.net.Network> values) {
      ensureNetworkIsMutable();
      for (cloud.paolu.xray.common.net.Network value : values) {
        network_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNetwork() {
      network_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @return A list containing the enum numeric values on the wire for network.
     */
    public java.util.List<java.lang.Integer>
    getNetworkValueList() {
      return java.util.Collections.unmodifiableList(network_);
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of network at the given index.
     */
    public int getNetworkValue(int index) {
      return network_.get(index);
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for network to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkValue(
        int index, int value) {
      ensureNetworkIsMutable();
      network_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @param value The enum numeric value on the wire for network to add.
     * @return This builder for chaining.
     */
    public Builder addNetworkValue(int value) {
      ensureNetworkIsMutable();
      network_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .xray.common.net.Network network = 2;</code>
     * @param values The enum numeric values on the wire for network to add.
     * @return This builder for chaining.
     */
    public Builder addAllNetworkValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureNetworkIsMutable();
      for (int value : values) {
        network_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:xray.proxy.shadowsocks.ServerConfig)
  }

  // @@protoc_insertion_point(class_scope:xray.proxy.shadowsocks.ServerConfig)
  private static final cloud.paolu.xray.proxy.shadowsocks.ServerConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cloud.paolu.xray.proxy.shadowsocks.ServerConfig();
  }

  public static cloud.paolu.xray.proxy.shadowsocks.ServerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerConfig>
      PARSER = new com.google.protobuf.AbstractParser<ServerConfig>() {
    @java.lang.Override
    public ServerConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServerConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cloud.paolu.xray.proxy.shadowsocks.ServerConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

