// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/tcp/config.proto

package cloud.paolu.xray.transport.internet.tcp;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_transport_internet_tcp_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_transport_internet_tcp_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#transport/internet/tcp/config.proto\022\033x" +
      "ray.transport.internet.tcp\032!common/seria" +
      "l/typed_message.proto\"h\n\006Config\0229\n\017heade" +
      "r_settings\030\002 \001(\0132 .xray.common.serial.Ty" +
      "pedMessage\022\035\n\025accept_proxy_protocol\030\003 \001(" +
      "\010J\004\010\001\020\002B{\n\'cloud.paolu.xray.transport.in" +
      "ternet.tcpP\001Z0github.com/xtls/xray-core/" +
      "transport/internet/tcp\252\002\033Xray.Transport." +
      "Internet.Tcpb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cloud.paolu.xray.common.serial.TypedMessageOuterClass.getDescriptor(),
        });
    internal_static_xray_transport_internet_tcp_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_transport_internet_tcp_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_transport_internet_tcp_Config_descriptor,
        new java.lang.String[] { "HeaderSettings", "AcceptProxyProtocol", });
    cloud.paolu.xray.common.serial.TypedMessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
