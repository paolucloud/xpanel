// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/vmess/account.proto

package cloud.paolu.xray.proxy.vmess;

public final class AccountOuterClass {
  private AccountOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_vmess_Account_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_vmess_Account_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031proxy/vmess/account.proto\022\020xray.proxy." +
      "vmess\032\035common/protocol/headers.proto\"m\n\007" +
      "Account\022\n\n\002id\030\001 \001(\t\022?\n\021security_settings" +
      "\030\003 \001(\0132$.xray.common.protocol.SecurityCo" +
      "nfig\022\025\n\rtests_enabled\030\004 \001(\tBZ\n\034cloud.pao" +
      "lu.xray.proxy.vmessP\001Z%github.com/xtls/x" +
      "ray-core/proxy/vmess\252\002\020Xray.Proxy.Vmessb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cloud.paolu.xray.common.protocol.Headers.getDescriptor(),
        });
    internal_static_xray_proxy_vmess_Account_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_proxy_vmess_Account_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_vmess_Account_descriptor,
        new java.lang.String[] { "Id", "SecuritySettings", "TestsEnabled", });
    cloud.paolu.xray.common.protocol.Headers.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
