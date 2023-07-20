// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/shadowsocks_2022/config.proto

package cloud.paolu.xray.proxy.shadowsocks_2022;

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
    internal_static_xray_proxy_shadowsocks_2022_ServerConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_shadowsocks_2022_ServerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_shadowsocks_2022_MultiUserServerConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_shadowsocks_2022_MultiUserServerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_shadowsocks_2022_RelayDestination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_shadowsocks_2022_RelayDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_shadowsocks_2022_RelayServerConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_shadowsocks_2022_RelayServerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_shadowsocks_2022_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_shadowsocks_2022_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_proxy_shadowsocks_2022_ClientConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_proxy_shadowsocks_2022_ClientConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#proxy/shadowsocks_2022/config.proto\022\033x" +
      "ray.proxy.shadowsocks_2022\032\030common/net/n" +
      "etwork.proto\032\030common/net/address.proto\"t" +
      "\n\014ServerConfig\022\016\n\006method\030\001 \001(\t\022\013\n\003key\030\002 " +
      "\001(\t\022\r\n\005email\030\003 \001(\t\022\r\n\005level\030\004 \001(\005\022)\n\007net" +
      "work\030\005 \003(\0162\030.xray.common.net.Network\"\221\001\n" +
      "\025MultiUserServerConfig\022\016\n\006method\030\001 \001(\t\022\013" +
      "\n\003key\030\002 \001(\t\0220\n\005users\030\003 \003(\0132!.xray.proxy." +
      "shadowsocks_2022.User\022)\n\007network\030\004 \003(\0162\030" +
      ".xray.common.net.Network\"y\n\020RelayDestina" +
      "tion\022\013\n\003key\030\001 \001(\t\022,\n\007address\030\002 \001(\0132\033.xra" +
      "y.common.net.IPOrDomain\022\014\n\004port\030\003 \001(\r\022\r\n" +
      "\005email\030\004 \001(\t\022\r\n\005level\030\005 \001(\005\"\240\001\n\021RelaySer" +
      "verConfig\022\016\n\006method\030\001 \001(\t\022\013\n\003key\030\002 \001(\t\022C" +
      "\n\014destinations\030\003 \003(\0132-.xray.proxy.shadow" +
      "socks_2022.RelayDestination\022)\n\007network\030\004" +
      " \003(\0162\030.xray.common.net.Network\"1\n\004User\022\013" +
      "\n\003key\030\001 \001(\t\022\r\n\005email\030\002 \001(\t\022\r\n\005level\030\003 \001(" +
      "\005\"\233\001\n\014ClientConfig\022,\n\007address\030\001 \001(\0132\033.xr" +
      "ay.common.net.IPOrDomain\022\014\n\004port\030\002 \001(\r\022\016" +
      "\n\006method\030\003 \001(\t\022\013\n\003key\030\004 \001(\t\022\024\n\014udp_over_" +
      "tcp\030\005 \001(\010\022\034\n\024udp_over_tcp_version\030\006 \001(\rB" +
      "z\n\'cloud.paolu.xray.proxy.shadowsocks_20" +
      "22P\001Z0github.com/xtls/xray-core/proxy/sh" +
      "adowsocks_2022\252\002\032Xray.Proxy.Shadowsocks2" +
      "022b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cloud.paolu.xray.common.net.NetworkOuterClass.getDescriptor(),
          cloud.paolu.xray.common.net.Address.getDescriptor(),
        });
    internal_static_xray_proxy_shadowsocks_2022_ServerConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_proxy_shadowsocks_2022_ServerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_shadowsocks_2022_ServerConfig_descriptor,
        new java.lang.String[] { "Method", "Key", "Email", "Level", "Network", });
    internal_static_xray_proxy_shadowsocks_2022_MultiUserServerConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xray_proxy_shadowsocks_2022_MultiUserServerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_shadowsocks_2022_MultiUserServerConfig_descriptor,
        new java.lang.String[] { "Method", "Key", "Users", "Network", });
    internal_static_xray_proxy_shadowsocks_2022_RelayDestination_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_xray_proxy_shadowsocks_2022_RelayDestination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_shadowsocks_2022_RelayDestination_descriptor,
        new java.lang.String[] { "Key", "Address", "Port", "Email", "Level", });
    internal_static_xray_proxy_shadowsocks_2022_RelayServerConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_xray_proxy_shadowsocks_2022_RelayServerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_shadowsocks_2022_RelayServerConfig_descriptor,
        new java.lang.String[] { "Method", "Key", "Destinations", "Network", });
    internal_static_xray_proxy_shadowsocks_2022_User_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_xray_proxy_shadowsocks_2022_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_shadowsocks_2022_User_descriptor,
        new java.lang.String[] { "Key", "Email", "Level", });
    internal_static_xray_proxy_shadowsocks_2022_ClientConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_xray_proxy_shadowsocks_2022_ClientConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_proxy_shadowsocks_2022_ClientConfig_descriptor,
        new java.lang.String[] { "Address", "Port", "Method", "Key", "UdpOverTcp", "UdpOverTcpVersion", });
    cloud.paolu.xray.common.net.NetworkOuterClass.getDescriptor();
    cloud.paolu.xray.common.net.Address.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
