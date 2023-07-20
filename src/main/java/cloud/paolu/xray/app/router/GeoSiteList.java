// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package cloud.paolu.xray.app.router;

/**
 * Protobuf type {@code xray.app.router.GeoSiteList}
 */
public final class GeoSiteList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.app.router.GeoSiteList)
    GeoSiteListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GeoSiteList.newBuilder() to construct.
  private GeoSiteList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GeoSiteList() {
    entry_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GeoSiteList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cloud.paolu.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_GeoSiteList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cloud.paolu.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_GeoSiteList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cloud.paolu.xray.app.router.GeoSiteList.class, cloud.paolu.xray.app.router.GeoSiteList.Builder.class);
  }

  public static final int ENTRY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<cloud.paolu.xray.app.router.GeoSite> entry_;
  /**
   * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
   */
  @java.lang.Override
  public java.util.List<cloud.paolu.xray.app.router.GeoSite> getEntryList() {
    return entry_;
  }
  /**
   * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends cloud.paolu.xray.app.router.GeoSiteOrBuilder> 
      getEntryOrBuilderList() {
    return entry_;
  }
  /**
   * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
   */
  @java.lang.Override
  public int getEntryCount() {
    return entry_.size();
  }
  /**
   * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
   */
  @java.lang.Override
  public cloud.paolu.xray.app.router.GeoSite getEntry(int index) {
    return entry_.get(index);
  }
  /**
   * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
   */
  @java.lang.Override
  public cloud.paolu.xray.app.router.GeoSiteOrBuilder getEntryOrBuilder(
      int index) {
    return entry_.get(index);
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
    for (int i = 0; i < entry_.size(); i++) {
      output.writeMessage(1, entry_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entry_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, entry_.get(i));
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
    if (!(obj instanceof cloud.paolu.xray.app.router.GeoSiteList)) {
      return super.equals(obj);
    }
    cloud.paolu.xray.app.router.GeoSiteList other = (cloud.paolu.xray.app.router.GeoSiteList) obj;

    if (!getEntryList()
        .equals(other.getEntryList())) return false;
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
    if (getEntryCount() > 0) {
      hash = (37 * hash) + ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getEntryList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cloud.paolu.xray.app.router.GeoSiteList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.router.GeoSiteList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.router.GeoSiteList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.router.GeoSiteList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.router.GeoSiteList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.router.GeoSiteList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.router.GeoSiteList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.app.router.GeoSiteList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cloud.paolu.xray.app.router.GeoSiteList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cloud.paolu.xray.app.router.GeoSiteList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cloud.paolu.xray.app.router.GeoSiteList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.app.router.GeoSiteList parseFrom(
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
  public static Builder newBuilder(cloud.paolu.xray.app.router.GeoSiteList prototype) {
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
   * Protobuf type {@code xray.app.router.GeoSiteList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.app.router.GeoSiteList)
      cloud.paolu.xray.app.router.GeoSiteListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cloud.paolu.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_GeoSiteList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cloud.paolu.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_GeoSiteList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cloud.paolu.xray.app.router.GeoSiteList.class, cloud.paolu.xray.app.router.GeoSiteList.Builder.class);
    }

    // Construct using cloud.paolu.xray.app.router.GeoSiteList.newBuilder()
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
      if (entryBuilder_ == null) {
        entry_ = java.util.Collections.emptyList();
      } else {
        entry_ = null;
        entryBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cloud.paolu.xray.app.router.ConfigOuterClass.internal_static_xray_app_router_GeoSiteList_descriptor;
    }

    @java.lang.Override
    public cloud.paolu.xray.app.router.GeoSiteList getDefaultInstanceForType() {
      return cloud.paolu.xray.app.router.GeoSiteList.getDefaultInstance();
    }

    @java.lang.Override
    public cloud.paolu.xray.app.router.GeoSiteList build() {
      cloud.paolu.xray.app.router.GeoSiteList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cloud.paolu.xray.app.router.GeoSiteList buildPartial() {
      cloud.paolu.xray.app.router.GeoSiteList result = new cloud.paolu.xray.app.router.GeoSiteList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(cloud.paolu.xray.app.router.GeoSiteList result) {
      if (entryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          entry_ = java.util.Collections.unmodifiableList(entry_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entry_ = entry_;
      } else {
        result.entry_ = entryBuilder_.build();
      }
    }

    private void buildPartial0(cloud.paolu.xray.app.router.GeoSiteList result) {
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
      if (other instanceof cloud.paolu.xray.app.router.GeoSiteList) {
        return mergeFrom((cloud.paolu.xray.app.router.GeoSiteList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cloud.paolu.xray.app.router.GeoSiteList other) {
      if (other == cloud.paolu.xray.app.router.GeoSiteList.getDefaultInstance()) return this;
      if (entryBuilder_ == null) {
        if (!other.entry_.isEmpty()) {
          if (entry_.isEmpty()) {
            entry_ = other.entry_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntryIsMutable();
            entry_.addAll(other.entry_);
          }
          onChanged();
        }
      } else {
        if (!other.entry_.isEmpty()) {
          if (entryBuilder_.isEmpty()) {
            entryBuilder_.dispose();
            entryBuilder_ = null;
            entry_ = other.entry_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entryBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEntryFieldBuilder() : null;
          } else {
            entryBuilder_.addAllMessages(other.entry_);
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
              cloud.paolu.xray.app.router.GeoSite m =
                  input.readMessage(
                      cloud.paolu.xray.app.router.GeoSite.parser(),
                      extensionRegistry);
              if (entryBuilder_ == null) {
                ensureEntryIsMutable();
                entry_.add(m);
              } else {
                entryBuilder_.addMessage(m);
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

    private java.util.List<cloud.paolu.xray.app.router.GeoSite> entry_ =
      java.util.Collections.emptyList();
    private void ensureEntryIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        entry_ = new java.util.ArrayList<cloud.paolu.xray.app.router.GeoSite>(entry_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cloud.paolu.xray.app.router.GeoSite, cloud.paolu.xray.app.router.GeoSite.Builder, cloud.paolu.xray.app.router.GeoSiteOrBuilder> entryBuilder_;

    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public java.util.List<cloud.paolu.xray.app.router.GeoSite> getEntryList() {
      if (entryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entry_);
      } else {
        return entryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public int getEntryCount() {
      if (entryBuilder_ == null) {
        return entry_.size();
      } else {
        return entryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public cloud.paolu.xray.app.router.GeoSite getEntry(int index) {
      if (entryBuilder_ == null) {
        return entry_.get(index);
      } else {
        return entryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public Builder setEntry(
        int index, cloud.paolu.xray.app.router.GeoSite value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.set(index, value);
        onChanged();
      } else {
        entryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public Builder setEntry(
        int index, cloud.paolu.xray.app.router.GeoSite.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.set(index, builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public Builder addEntry(cloud.paolu.xray.app.router.GeoSite value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.add(value);
        onChanged();
      } else {
        entryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public Builder addEntry(
        int index, cloud.paolu.xray.app.router.GeoSite value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.add(index, value);
        onChanged();
      } else {
        entryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public Builder addEntry(
        cloud.paolu.xray.app.router.GeoSite.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.add(builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public Builder addEntry(
        int index, cloud.paolu.xray.app.router.GeoSite.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.add(index, builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public Builder addAllEntry(
        java.lang.Iterable<? extends cloud.paolu.xray.app.router.GeoSite> values) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entry_);
        onChanged();
      } else {
        entryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public Builder clearEntry() {
      if (entryBuilder_ == null) {
        entry_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public Builder removeEntry(int index) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.remove(index);
        onChanged();
      } else {
        entryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public cloud.paolu.xray.app.router.GeoSite.Builder getEntryBuilder(
        int index) {
      return getEntryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public cloud.paolu.xray.app.router.GeoSiteOrBuilder getEntryOrBuilder(
        int index) {
      if (entryBuilder_ == null) {
        return entry_.get(index);  } else {
        return entryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public java.util.List<? extends cloud.paolu.xray.app.router.GeoSiteOrBuilder> 
         getEntryOrBuilderList() {
      if (entryBuilder_ != null) {
        return entryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entry_);
      }
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public cloud.paolu.xray.app.router.GeoSite.Builder addEntryBuilder() {
      return getEntryFieldBuilder().addBuilder(
          cloud.paolu.xray.app.router.GeoSite.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public cloud.paolu.xray.app.router.GeoSite.Builder addEntryBuilder(
        int index) {
      return getEntryFieldBuilder().addBuilder(
          index, cloud.paolu.xray.app.router.GeoSite.getDefaultInstance());
    }
    /**
     * <code>repeated .xray.app.router.GeoSite entry = 1;</code>
     */
    public java.util.List<cloud.paolu.xray.app.router.GeoSite.Builder> 
         getEntryBuilderList() {
      return getEntryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cloud.paolu.xray.app.router.GeoSite, cloud.paolu.xray.app.router.GeoSite.Builder, cloud.paolu.xray.app.router.GeoSiteOrBuilder> 
        getEntryFieldBuilder() {
      if (entryBuilder_ == null) {
        entryBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cloud.paolu.xray.app.router.GeoSite, cloud.paolu.xray.app.router.GeoSite.Builder, cloud.paolu.xray.app.router.GeoSiteOrBuilder>(
                entry_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        entry_ = null;
      }
      return entryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xray.app.router.GeoSiteList)
  }

  // @@protoc_insertion_point(class_scope:xray.app.router.GeoSiteList)
  private static final cloud.paolu.xray.app.router.GeoSiteList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cloud.paolu.xray.app.router.GeoSiteList();
  }

  public static cloud.paolu.xray.app.router.GeoSiteList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeoSiteList>
      PARSER = new com.google.protobuf.AbstractParser<GeoSiteList>() {
    @java.lang.Override
    public GeoSiteList parsePartialFrom(
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

  public static com.google.protobuf.Parser<GeoSiteList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GeoSiteList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cloud.paolu.xray.app.router.GeoSiteList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

