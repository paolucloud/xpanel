// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/stats/config.proto

package cloud.paolu.xray.app.stats;

public interface ChannelConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.app.stats.ChannelConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool Blocking = 1;</code>
   * @return The blocking.
   */
  boolean getBlocking();

  /**
   * <code>int32 SubscriberLimit = 2;</code>
   * @return The subscriberLimit.
   */
  int getSubscriberLimit();

  /**
   * <code>int32 BufferSize = 3;</code>
   * @return The bufferSize.
   */
  int getBufferSize();
}
