// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/vmess/outbound/config.proto

package cloud.paolu.xray.proxy.vmess.outbound;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.proxy.vmess.outbound.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .xray.common.protocol.ServerEndpoint Receiver = 1;</code>
   */
  java.util.List<cloud.paolu.xray.common.protocol.ServerEndpoint> 
      getReceiverList();
  /**
   * <code>repeated .xray.common.protocol.ServerEndpoint Receiver = 1;</code>
   */
  cloud.paolu.xray.common.protocol.ServerEndpoint getReceiver(int index);
  /**
   * <code>repeated .xray.common.protocol.ServerEndpoint Receiver = 1;</code>
   */
  int getReceiverCount();
  /**
   * <code>repeated .xray.common.protocol.ServerEndpoint Receiver = 1;</code>
   */
  java.util.List<? extends cloud.paolu.xray.common.protocol.ServerEndpointOrBuilder> 
      getReceiverOrBuilderList();
  /**
   * <code>repeated .xray.common.protocol.ServerEndpoint Receiver = 1;</code>
   */
  cloud.paolu.xray.common.protocol.ServerEndpointOrBuilder getReceiverOrBuilder(
      int index);
}
