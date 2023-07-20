// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/proxyman/command/command.proto

package cloud.paolu.xray.app.proxyman.command;

/**
 * Protobuf type {@code xray.app.proxyman.command.AlterInboundResponse}
 */
public final class AlterInboundResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xray.app.proxyman.command.AlterInboundResponse)
    AlterInboundResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterInboundResponse.newBuilder() to construct.
  private AlterInboundResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterInboundResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterInboundResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cloud.paolu.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AlterInboundResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cloud.paolu.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AlterInboundResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cloud.paolu.xray.app.proxyman.command.AlterInboundResponse.class, cloud.paolu.xray.app.proxyman.command.AlterInboundResponse.Builder.class);
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
    if (!(obj instanceof cloud.paolu.xray.app.proxyman.command.AlterInboundResponse)) {
      return super.equals(obj);
    }
    cloud.paolu.xray.app.proxyman.command.AlterInboundResponse other = (cloud.paolu.xray.app.proxyman.command.AlterInboundResponse) obj;

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

  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse parseFrom(
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
  public static Builder newBuilder(cloud.paolu.xray.app.proxyman.command.AlterInboundResponse prototype) {
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
   * Protobuf type {@code xray.app.proxyman.command.AlterInboundResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xray.app.proxyman.command.AlterInboundResponse)
      cloud.paolu.xray.app.proxyman.command.AlterInboundResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cloud.paolu.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AlterInboundResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cloud.paolu.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AlterInboundResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cloud.paolu.xray.app.proxyman.command.AlterInboundResponse.class, cloud.paolu.xray.app.proxyman.command.AlterInboundResponse.Builder.class);
    }

    // Construct using cloud.paolu.xray.app.proxyman.command.AlterInboundResponse.newBuilder()
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
      return cloud.paolu.xray.app.proxyman.command.Command.internal_static_xray_app_proxyman_command_AlterInboundResponse_descriptor;
    }

    @java.lang.Override
    public cloud.paolu.xray.app.proxyman.command.AlterInboundResponse getDefaultInstanceForType() {
      return cloud.paolu.xray.app.proxyman.command.AlterInboundResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cloud.paolu.xray.app.proxyman.command.AlterInboundResponse build() {
      cloud.paolu.xray.app.proxyman.command.AlterInboundResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cloud.paolu.xray.app.proxyman.command.AlterInboundResponse buildPartial() {
      cloud.paolu.xray.app.proxyman.command.AlterInboundResponse result = new cloud.paolu.xray.app.proxyman.command.AlterInboundResponse(this);
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
      if (other instanceof cloud.paolu.xray.app.proxyman.command.AlterInboundResponse) {
        return mergeFrom((cloud.paolu.xray.app.proxyman.command.AlterInboundResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cloud.paolu.xray.app.proxyman.command.AlterInboundResponse other) {
      if (other == cloud.paolu.xray.app.proxyman.command.AlterInboundResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:xray.app.proxyman.command.AlterInboundResponse)
  }

  // @@protoc_insertion_point(class_scope:xray.app.proxyman.command.AlterInboundResponse)
  private static final cloud.paolu.xray.app.proxyman.command.AlterInboundResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cloud.paolu.xray.app.proxyman.command.AlterInboundResponse();
  }

  public static cloud.paolu.xray.app.proxyman.command.AlterInboundResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterInboundResponse>
      PARSER = new com.google.protobuf.AbstractParser<AlterInboundResponse>() {
    @java.lang.Override
    public AlterInboundResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlterInboundResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterInboundResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cloud.paolu.xray.app.proxyman.command.AlterInboundResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

