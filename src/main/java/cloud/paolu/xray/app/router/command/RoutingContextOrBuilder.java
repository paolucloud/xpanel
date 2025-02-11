// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/command/command.proto

package cloud.paolu.xray.app.router.command;

public interface RoutingContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.app.router.command.RoutingContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string InboundTag = 1;</code>
   * @return The inboundTag.
   */
  java.lang.String getInboundTag();
  /**
   * <code>string InboundTag = 1;</code>
   * @return The bytes for inboundTag.
   */
  com.google.protobuf.ByteString
      getInboundTagBytes();

  /**
   * <code>.xray.common.net.Network Network = 2;</code>
   * @return The enum numeric value on the wire for network.
   */
  int getNetworkValue();
  /**
   * <code>.xray.common.net.Network Network = 2;</code>
   * @return The network.
   */
  cloud.paolu.xray.common.net.Network getNetwork();

  /**
   * <code>repeated bytes SourceIPs = 3;</code>
   * @return A list containing the sourceIPs.
   */
  java.util.List<com.google.protobuf.ByteString> getSourceIPsList();
  /**
   * <code>repeated bytes SourceIPs = 3;</code>
   * @return The count of sourceIPs.
   */
  int getSourceIPsCount();
  /**
   * <code>repeated bytes SourceIPs = 3;</code>
   * @param index The index of the element to return.
   * @return The sourceIPs at the given index.
   */
  com.google.protobuf.ByteString getSourceIPs(int index);

  /**
   * <code>repeated bytes TargetIPs = 4;</code>
   * @return A list containing the targetIPs.
   */
  java.util.List<com.google.protobuf.ByteString> getTargetIPsList();
  /**
   * <code>repeated bytes TargetIPs = 4;</code>
   * @return The count of targetIPs.
   */
  int getTargetIPsCount();
  /**
   * <code>repeated bytes TargetIPs = 4;</code>
   * @param index The index of the element to return.
   * @return The targetIPs at the given index.
   */
  com.google.protobuf.ByteString getTargetIPs(int index);

  /**
   * <code>uint32 SourcePort = 5;</code>
   * @return The sourcePort.
   */
  int getSourcePort();

  /**
   * <code>uint32 TargetPort = 6;</code>
   * @return The targetPort.
   */
  int getTargetPort();

  /**
   * <code>string TargetDomain = 7;</code>
   * @return The targetDomain.
   */
  java.lang.String getTargetDomain();
  /**
   * <code>string TargetDomain = 7;</code>
   * @return The bytes for targetDomain.
   */
  com.google.protobuf.ByteString
      getTargetDomainBytes();

  /**
   * <code>string Protocol = 8;</code>
   * @return The protocol.
   */
  java.lang.String getProtocol();
  /**
   * <code>string Protocol = 8;</code>
   * @return The bytes for protocol.
   */
  com.google.protobuf.ByteString
      getProtocolBytes();

  /**
   * <code>string User = 9;</code>
   * @return The user.
   */
  java.lang.String getUser();
  /**
   * <code>string User = 9;</code>
   * @return The bytes for user.
   */
  com.google.protobuf.ByteString
      getUserBytes();

  /**
   * <code>map&lt;string, string&gt; Attributes = 10;</code>
   */
  int getAttributesCount();
  /**
   * <code>map&lt;string, string&gt; Attributes = 10;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttributes();
  /**
   * <code>map&lt;string, string&gt; Attributes = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttributesMap();
  /**
   * <code>map&lt;string, string&gt; Attributes = 10;</code>
   */
  /* nullable */
java.lang.String getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; Attributes = 10;</code>
   */
  java.lang.String getAttributesOrThrow(
      java.lang.String key);

  /**
   * <code>repeated string OutboundGroupTags = 11;</code>
   * @return A list containing the outboundGroupTags.
   */
  java.util.List<java.lang.String>
      getOutboundGroupTagsList();
  /**
   * <code>repeated string OutboundGroupTags = 11;</code>
   * @return The count of outboundGroupTags.
   */
  int getOutboundGroupTagsCount();
  /**
   * <code>repeated string OutboundGroupTags = 11;</code>
   * @param index The index of the element to return.
   * @return The outboundGroupTags at the given index.
   */
  java.lang.String getOutboundGroupTags(int index);
  /**
   * <code>repeated string OutboundGroupTags = 11;</code>
   * @param index The index of the value to return.
   * @return The bytes of the outboundGroupTags at the given index.
   */
  com.google.protobuf.ByteString
      getOutboundGroupTagsBytes(int index);

  /**
   * <code>string OutboundTag = 12;</code>
   * @return The outboundTag.
   */
  java.lang.String getOutboundTag();
  /**
   * <code>string OutboundTag = 12;</code>
   * @return The bytes for outboundTag.
   */
  com.google.protobuf.ByteString
      getOutboundTagBytes();
}
