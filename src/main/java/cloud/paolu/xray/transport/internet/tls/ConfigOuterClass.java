// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/tls/config.proto

package cloud.paolu.xray.transport.internet.tls;

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
    internal_static_xray_transport_internet_tls_Certificate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_transport_internet_tls_Certificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_transport_internet_tls_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_transport_internet_tls_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#transport/internet/tls/config.proto\022\033x" +
      "ray.transport.internet.tls\"\221\002\n\013Certifica" +
      "te\022\023\n\013certificate\030\001 \001(\014\022\013\n\003key\030\002 \001(\014\022=\n\005" +
      "usage\030\003 \001(\0162..xray.transport.internet.tl" +
      "s.Certificate.Usage\022\025\n\rocsp_stapling\030\004 \001" +
      "(\004\022\030\n\020certificate_path\030\005 \001(\t\022\020\n\010key_path" +
      "\030\006 \001(\t\022\030\n\020One_time_loading\030\007 \001(\010\"D\n\005Usag" +
      "e\022\020\n\014ENCIPHERMENT\020\000\022\024\n\020AUTHORITY_VERIFY\020" +
      "\001\022\023\n\017AUTHORITY_ISSUE\020\002\"\303\003\n\006Config\022\026\n\016all" +
      "ow_insecure\030\001 \001(\010\022=\n\013certificate\030\002 \003(\0132(" +
      ".xray.transport.internet.tls.Certificate" +
      "\022\023\n\013server_name\030\003 \001(\t\022\025\n\rnext_protocol\030\004" +
      " \003(\t\022!\n\031enable_session_resumption\030\005 \001(\010\022" +
      "\033\n\023disable_system_root\030\006 \001(\010\022\023\n\013min_vers" +
      "ion\030\007 \001(\t\022\023\n\013max_version\030\010 \001(\t\022\025\n\rcipher" +
      "_suites\030\t \001(\t\022#\n\033prefer_server_cipher_su" +
      "ites\030\n \001(\010\022\023\n\013fingerprint\030\013 \001(\t\022\032\n\022rejec" +
      "t_unknown_sni\030\014 \001(\010\022,\n$pinned_peer_certi" +
      "ficate_chain_sha256\030\r \003(\014\0221\n)pinned_peer" +
      "_certificate_public_key_sha256\030\016 \003(\014B{\n\'" +
      "cloud.paolu.xray.transport.internet.tlsP" +
      "\001Z0github.com/xtls/xray-core/transport/i" +
      "nternet/tls\252\002\033Xray.Transport.Internet.Tl" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_xray_transport_internet_tls_Certificate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_transport_internet_tls_Certificate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_transport_internet_tls_Certificate_descriptor,
        new java.lang.String[] { "Certificate", "Key", "Usage", "OcspStapling", "CertificatePath", "KeyPath", "OneTimeLoading", });
    internal_static_xray_transport_internet_tls_Config_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xray_transport_internet_tls_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_transport_internet_tls_Config_descriptor,
        new java.lang.String[] { "AllowInsecure", "Certificate", "ServerName", "NextProtocol", "EnableSessionResumption", "DisableSystemRoot", "MinVersion", "MaxVersion", "CipherSuites", "PreferServerCipherSuites", "Fingerprint", "RejectUnknownSni", "PinnedPeerCertificateChainSha256", "PinnedPeerCertificatePublicKeySha256", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
