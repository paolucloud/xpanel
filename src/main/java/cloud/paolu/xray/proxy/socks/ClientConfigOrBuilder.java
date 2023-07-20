// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/socks/config.proto

package cloud.paolu.xray.proxy.socks;

public interface ClientConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.proxy.socks.ClientConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sever is a list of Socks server addresses.
   * </pre>
   *
   * <code>repeated .xray.common.protocol.ServerEndpoint server = 1;</code>
   */
  java.util.List<cloud.paolu.xray.common.protocol.ServerEndpoint> 
      getServerList();
  /**
   * <pre>
   * Sever is a list of Socks server addresses.
   * </pre>
   *
   * <code>repeated .xray.common.protocol.ServerEndpoint server = 1;</code>
   */
  cloud.paolu.xray.common.protocol.ServerEndpoint getServer(int index);
  /**
   * <pre>
   * Sever is a list of Socks server addresses.
   * </pre>
   *
   * <code>repeated .xray.common.protocol.ServerEndpoint server = 1;</code>
   */
  int getServerCount();
  /**
   * <pre>
   * Sever is a list of Socks server addresses.
   * </pre>
   *
   * <code>repeated .xray.common.protocol.ServerEndpoint server = 1;</code>
   */
  java.util.List<? extends cloud.paolu.xray.common.protocol.ServerEndpointOrBuilder> 
      getServerOrBuilderList();
  /**
   * <pre>
   * Sever is a list of Socks server addresses.
   * </pre>
   *
   * <code>repeated .xray.common.protocol.ServerEndpoint server = 1;</code>
   */
  cloud.paolu.xray.common.protocol.ServerEndpointOrBuilder getServerOrBuilder(
      int index);

  /**
   * <code>.xray.proxy.socks.Version version = 2;</code>
   * @return The enum numeric value on the wire for version.
   */
  int getVersionValue();
  /**
   * <code>.xray.proxy.socks.Version version = 2;</code>
   * @return The version.
   */
  cloud.paolu.xray.proxy.socks.Version getVersion();
}
