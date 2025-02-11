// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/config.proto

package cloud.paolu.xray.transport.internet;

public interface SocketConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.transport.internet.SocketConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Mark of the connection. If non-zero, the value will be set to SO_MARK.
   * </pre>
   *
   * <code>int32 mark = 1;</code>
   * @return The mark.
   */
  int getMark();

  /**
   * <pre>
   * TFO is the state of TFO settings.
   * </pre>
   *
   * <code>int32 tfo = 2;</code>
   * @return The tfo.
   */
  int getTfo();

  /**
   * <pre>
   * TProxy is for enabling TProxy socket option.
   * </pre>
   *
   * <code>.xray.transport.internet.SocketConfig.TProxyMode tproxy = 3;</code>
   * @return The enum numeric value on the wire for tproxy.
   */
  int getTproxyValue();
  /**
   * <pre>
   * TProxy is for enabling TProxy socket option.
   * </pre>
   *
   * <code>.xray.transport.internet.SocketConfig.TProxyMode tproxy = 3;</code>
   * @return The tproxy.
   */
  cloud.paolu.xray.transport.internet.SocketConfig.TProxyMode getTproxy();

  /**
   * <pre>
   * ReceiveOriginalDestAddress is for enabling IP_RECVORIGDSTADDR socket
   * option. This option is for UDP only.
   * </pre>
   *
   * <code>bool receive_original_dest_address = 4;</code>
   * @return The receiveOriginalDestAddress.
   */
  boolean getReceiveOriginalDestAddress();

  /**
   * <code>bytes bind_address = 5;</code>
   * @return The bindAddress.
   */
  com.google.protobuf.ByteString getBindAddress();

  /**
   * <code>uint32 bind_port = 6;</code>
   * @return The bindPort.
   */
  int getBindPort();

  /**
   * <code>bool accept_proxy_protocol = 7;</code>
   * @return The acceptProxyProtocol.
   */
  boolean getAcceptProxyProtocol();

  /**
   * <code>.xray.transport.internet.DomainStrategy domain_strategy = 8;</code>
   * @return The enum numeric value on the wire for domainStrategy.
   */
  int getDomainStrategyValue();
  /**
   * <code>.xray.transport.internet.DomainStrategy domain_strategy = 8;</code>
   * @return The domainStrategy.
   */
  cloud.paolu.xray.transport.internet.DomainStrategy getDomainStrategy();

  /**
   * <code>string dialer_proxy = 9;</code>
   * @return The dialerProxy.
   */
  java.lang.String getDialerProxy();
  /**
   * <code>string dialer_proxy = 9;</code>
   * @return The bytes for dialerProxy.
   */
  com.google.protobuf.ByteString
      getDialerProxyBytes();

  /**
   * <code>int32 tcp_keep_alive_interval = 10;</code>
   * @return The tcpKeepAliveInterval.
   */
  int getTcpKeepAliveInterval();

  /**
   * <code>int32 tcp_keep_alive_idle = 11;</code>
   * @return The tcpKeepAliveIdle.
   */
  int getTcpKeepAliveIdle();

  /**
   * <code>string tcp_congestion = 12;</code>
   * @return The tcpCongestion.
   */
  java.lang.String getTcpCongestion();
  /**
   * <code>string tcp_congestion = 12;</code>
   * @return The bytes for tcpCongestion.
   */
  com.google.protobuf.ByteString
      getTcpCongestionBytes();

  /**
   * <code>string interface = 13;</code>
   * @return The interface.
   */
  java.lang.String getInterface();
  /**
   * <code>string interface = 13;</code>
   * @return The bytes for interface.
   */
  com.google.protobuf.ByteString
      getInterfaceBytes();

  /**
   * <code>bool v6only = 14;</code>
   * @return The v6only.
   */
  boolean getV6Only();

  /**
   * <code>int32 tcp_window_clamp = 15;</code>
   * @return The tcpWindowClamp.
   */
  int getTcpWindowClamp();

  /**
   * <code>int32 tcp_user_timeout = 16;</code>
   * @return The tcpUserTimeout.
   */
  int getTcpUserTimeout();

  /**
   * <code>int32 tcp_max_seg = 17;</code>
   * @return The tcpMaxSeg.
   */
  int getTcpMaxSeg();

  /**
   * <code>bool tcp_no_delay = 18;</code>
   * @return The tcpNoDelay.
   */
  boolean getTcpNoDelay();
}
