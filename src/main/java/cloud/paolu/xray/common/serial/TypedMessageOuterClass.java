// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/serial/typed_message.proto

package cloud.paolu.xray.common.serial;

public final class TypedMessageOuterClass {
  private TypedMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_common_serial_TypedMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_common_serial_TypedMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!common/serial/typed_message.proto\022\022xra" +
      "y.common.serial\"+\n\014TypedMessage\022\014\n\004type\030" +
      "\001 \001(\t\022\r\n\005value\030\002 \001(\014B`\n\036cloud.paolu.xray" +
      ".common.serialP\001Z\'github.com/xtls/xray-c" +
      "ore/common/serial\252\002\022Xray.Common.Serialb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_xray_common_serial_TypedMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_common_serial_TypedMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_common_serial_TypedMessage_descriptor,
        new java.lang.String[] { "Type", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
