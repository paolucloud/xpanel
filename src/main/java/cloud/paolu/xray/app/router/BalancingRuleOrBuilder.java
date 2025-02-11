// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package cloud.paolu.xray.app.router;

public interface BalancingRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.app.router.BalancingRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tag = 1;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <code>string tag = 1;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <code>repeated string outbound_selector = 2;</code>
   * @return A list containing the outboundSelector.
   */
  java.util.List<java.lang.String>
      getOutboundSelectorList();
  /**
   * <code>repeated string outbound_selector = 2;</code>
   * @return The count of outboundSelector.
   */
  int getOutboundSelectorCount();
  /**
   * <code>repeated string outbound_selector = 2;</code>
   * @param index The index of the element to return.
   * @return The outboundSelector at the given index.
   */
  java.lang.String getOutboundSelector(int index);
  /**
   * <code>repeated string outbound_selector = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the outboundSelector at the given index.
   */
  com.google.protobuf.ByteString
      getOutboundSelectorBytes(int index);

  /**
   * <code>string strategy = 3;</code>
   * @return The strategy.
   */
  java.lang.String getStrategy();
  /**
   * <code>string strategy = 3;</code>
   * @return The bytes for strategy.
   */
  com.google.protobuf.ByteString
      getStrategyBytes();
}
