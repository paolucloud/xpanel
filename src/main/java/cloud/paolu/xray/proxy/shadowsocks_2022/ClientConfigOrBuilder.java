// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/shadowsocks_2022/config.proto

package cloud.paolu.xray.proxy.shadowsocks_2022;

public interface ClientConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.proxy.shadowsocks_2022.ClientConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.xray.common.net.IPOrDomain address = 1;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.xray.common.net.IPOrDomain address = 1;</code>
   * @return The address.
   */
  cloud.paolu.xray.common.net.IPOrDomain getAddress();
  /**
   * <code>.xray.common.net.IPOrDomain address = 1;</code>
   */
  cloud.paolu.xray.common.net.IPOrDomainOrBuilder getAddressOrBuilder();

  /**
   * <code>uint32 port = 2;</code>
   * @return The port.
   */
  int getPort();

  /**
   * <code>string method = 3;</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <code>string method = 3;</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <code>string key = 4;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 4;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>bool udp_over_tcp = 5;</code>
   * @return The udpOverTcp.
   */
  boolean getUdpOverTcp();

  /**
   * <code>uint32 udp_over_tcp_version = 6;</code>
   * @return The udpOverTcpVersion.
   */
  int getUdpOverTcpVersion();
}
