// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/net/port.proto

package cloud.paolu.xray.common.net;

public final class Port {
  private Port() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_common_net_PortRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_common_net_PortRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_common_net_PortList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_common_net_PortList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025common/net/port.proto\022\017xray.common.net" +
      "\"%\n\tPortRange\022\014\n\004From\030\001 \001(\r\022\n\n\002To\030\002 \001(\r\"" +
      "5\n\010PortList\022)\n\005range\030\001 \003(\0132\032.xray.common" +
      ".net.PortRangeBW\n\033cloud.paolu.xray.commo" +
      "n.netP\001Z$github.com/xtls/xray-core/commo" +
      "n/net\252\002\017Xray.Common.Netb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_xray_common_net_PortRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_common_net_PortRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_common_net_PortRange_descriptor,
        new java.lang.String[] { "From", "To", });
    internal_static_xray_common_net_PortList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xray_common_net_PortList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_common_net_PortList_descriptor,
        new java.lang.String[] { "Range", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
