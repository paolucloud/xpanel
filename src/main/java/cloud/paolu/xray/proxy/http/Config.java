// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/http/config.proto

package cloud.paolu.xray.proxy.http;

public final class Config {
  private Config() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_http_Account_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_http_Account_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_http_ServerConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_http_ServerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_http_ServerConfig_AccountsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_http_ServerConfig_AccountsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_http_Header_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_http_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_http_ClientConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_http_ClientConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027proxy/http/config.proto\022\017xray.proxy.ht" +
      "tp\032!common/protocol/server_spec.proto\"-\n" +
      "\007Account\022\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002" +
      " \001(\t\"\302\001\n\014ServerConfig\022\023\n\007timeout\030\001 \001(\rB\002" +
      "\030\001\022=\n\010accounts\030\002 \003(\0132+.xray.proxy.http.S" +
      "erverConfig.AccountsEntry\022\031\n\021allow_trans" +
      "parent\030\003 \001(\010\022\022\n\nuser_level\030\004 \001(\r\032/\n\rAcco" +
      "untsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001\"$\n\006Header\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\"" +
      "m\n\014ClientConfig\0224\n\006server\030\001 \003(\0132$.xray.c" +
      "ommon.protocol.ServerEndpoint\022\'\n\006header\030" +
      "\002 \003(\0132\027.xray.proxy.http.HeaderBW\n\033cloud." +
      "paolu.xray.proxy.httpP\001Z$github.com/xtls" +
      "/xray-core/proxy/http\252\002\017Xray.Proxy.Httpb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cloud.paolu.xray.common.protocol.ServerSpec.getDescriptor(),
        });
    internal_static_xray_proxy_http_Account_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_proxy_http_Account_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_http_Account_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_xray_proxy_http_ServerConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xray_proxy_http_ServerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_http_ServerConfig_descriptor,
        new java.lang.String[] { "Timeout", "Accounts", "AllowTransparent", "UserLevel", });
    internal_static_xray_proxy_http_ServerConfig_AccountsEntry_descriptor =
      internal_static_xray_proxy_http_ServerConfig_descriptor.getNestedTypes().get(0);
    internal_static_xray_proxy_http_ServerConfig_AccountsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_http_ServerConfig_AccountsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_xray_proxy_http_Header_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_xray_proxy_http_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_http_Header_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_xray_proxy_http_ClientConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_xray_proxy_http_ClientConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_http_ClientConfig_descriptor,
        new java.lang.String[] { "Server", "Header", });
    cloud.paolu.xray.common.protocol.ServerSpec.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
