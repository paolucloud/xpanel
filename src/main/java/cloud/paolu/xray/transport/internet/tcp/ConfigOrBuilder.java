// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/tcp/config.proto

package cloud.paolu.xray.transport.internet.tcp;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.transport.internet.tcp.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.xray.common.serial.TypedMessage header_settings = 2;</code>
   * @return Whether the headerSettings field is set.
   */
  boolean hasHeaderSettings();
  /**
   * <code>.xray.common.serial.TypedMessage header_settings = 2;</code>
   * @return The headerSettings.
   */
  cloud.paolu.xray.common.serial.TypedMessage getHeaderSettings();
  /**
   * <code>.xray.common.serial.TypedMessage header_settings = 2;</code>
   */
  cloud.paolu.xray.common.serial.TypedMessageOrBuilder getHeaderSettingsOrBuilder();

  /**
   * <code>bool accept_proxy_protocol = 3;</code>
   * @return The acceptProxyProtocol.
   */
  boolean getAcceptProxyProtocol();
}
