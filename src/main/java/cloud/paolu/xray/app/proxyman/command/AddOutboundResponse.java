// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/proxyman/command/command.proto

package cloud.paolu.xray.app.proxyman.command;

/**
 * Protobuf type {@code xray.app.proxyman.command.AddOutboundResponse}
 */
public final class AddOutboundResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.app.proxyman.command.AddOutboundResponse)
    AddOutboundResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddOutboundResponse.newBuilder() to construct.
  private AddOutboundResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddOutboundResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddOutboundResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cloud.paolu.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AddOutboundResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cloud.paolu.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AddOutboundResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cloud.paolu.xray.app.proxyman.command.AddOutboundResponse.class, cloud.paolu.xray.app.proxyman.command.AddOutboundResponse.Builder.class);
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
    if (!(obj instanceof cloud.paolu.xray.app.proxyman.command.AddOutboundResponse)) {
      return super.equals(obj);
    }
    cloud.paolu.xray.app.proxyman.command.AddOutboundResponse other = (cloud.paolu.xray.app.proxyman.command.AddOutboundResponse) obj;

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

  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse parseFrom(
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
  public static Builder newBuilder(cloud.paolu.xray.app.proxyman.command.AddOutboundResponse prototype) {
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
   * Protobuf type {@code xray.app.proxyman.command.AddOutboundResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.app.proxyman.command.AddOutboundResponse)
      cloud.paolu.xray.app.proxyman.command.AddOutboundResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cloud.paolu.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AddOutboundResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cloud.paolu.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AddOutboundResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cloud.paolu.xray.app.proxyman.command.AddOutboundResponse.class, cloud.paolu.xray.app.proxyman.command.AddOutboundResponse.Builder.class);
    }

    // Construct using cloud.paolu.xray.app.proxyman.command.AddOutboundResponse.newBuilder()
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
      return cloud.paolu.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AddOutboundResponse_descriptor;
    }

    @java.lang.Override
    public cloud.paolu.xray.app.proxyman.command.AddOutboundResponse getDefaultInstanceForType() {
      return cloud.paolu.xray.app.proxyman.command.AddOutboundResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cloud.paolu.xray.app.proxyman.command.AddOutboundResponse build() {
      cloud.paolu.xray.app.proxyman.command.AddOutboundResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cloud.paolu.xray.app.proxyman.command.AddOutboundResponse buildPartial() {
      cloud.paolu.xray.app.proxyman.command.AddOutboundResponse result = new cloud.paolu.xray.app.proxyman.command.AddOutboundResponse(this);
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
      if (other instanceof cloud.paolu.xray.app.proxyman.command.AddOutboundResponse) {
        return mergeFrom((cloud.paolu.xray.app.proxyman.command.AddOutboundResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cloud.paolu.xray.app.proxyman.command.AddOutboundResponse other) {
      if (other == cloud.paolu.xray.app.proxyman.command.AddOutboundResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:xray.app.proxyman.command.AddOutboundResponse)
  }

  // @@protoc_insertion_point(class_scope:xray.app.proxyman.command.AddOutboundResponse)
  private static final cloud.paolu.xray.app.proxyman.command.AddOutboundResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cloud.paolu.xray.app.proxyman.command.AddOutboundResponse();
  }

  public static cloud.paolu.xray.app.proxyman.command.AddOutboundResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddOutboundResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddOutboundResponse>() {
    @java.lang.Override
    public AddOutboundResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddOutboundResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddOutboundResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cloud.paolu.xray.app.proxyman.command.AddOutboundResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

