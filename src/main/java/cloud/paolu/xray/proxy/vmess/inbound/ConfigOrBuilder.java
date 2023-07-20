// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/vmess/inbound/config.proto

package cloud.paolu.xray.proxy.vmess.inbound;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.proxy.vmess.inbound.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .xray.common.protocol.User user = 1;</code>
   */
  java.util.List<cloud.paolu.xray.common.protocol.User> 
      getUserList();
  /**
   * <code>repeated .xray.common.protocol.User user = 1;</code>
   */
  cloud.paolu.xray.common.protocol.User getUser(int index);
  /**
   * <code>repeated .xray.common.protocol.User user = 1;</code>
   */
  int getUserCount();
  /**
   * <code>repeated .xray.common.protocol.User user = 1;</code>
   */
  java.util.List<? extends cloud.paolu.xray.common.protocol.UserOrBuilder> 
      getUserOrBuilderList();
  /**
   * <code>repeated .xray.common.protocol.User user = 1;</code>
   */
  cloud.paolu.xray.common.protocol.UserOrBuilder getUserOrBuilder(
      int index);

  /**
   * <code>.xray.proxy.vmess.inbound.DefaultConfig default = 2;</code>
   * @return Whether the default field is set.
   */
  boolean hasDefault();
  /**
   * <code>.xray.proxy.vmess.inbound.DefaultConfig default = 2;</code>
   * @return The default.
   */
  cloud.paolu.xray.proxy.vmess.inbound.DefaultConfig getDefault();
  /**
   * <code>.xray.proxy.vmess.inbound.DefaultConfig default = 2;</code>
   */
  cloud.paolu.xray.proxy.vmess.inbound.DefaultConfigOrBuilder getDefaultOrBuilder();

  /**
   * <pre>
   * 4 is for legacy setting
   * </pre>
   *
   * <code>.xray.proxy.vmess.inbound.DetourConfig detour = 3;</code>
   * @return Whether the detour field is set.
   */
  boolean hasDetour();
  /**
   * <pre>
   * 4 is for legacy setting
   * </pre>
   *
   * <code>.xray.proxy.vmess.inbound.DetourConfig detour = 3;</code>
   * @return The detour.
   */
  cloud.paolu.xray.proxy.vmess.inbound.DetourConfig getDetour();
  /**
   * <pre>
   * 4 is for legacy setting
   * </pre>
   *
   * <code>.xray.proxy.vmess.inbound.DetourConfig detour = 3;</code>
   */
  cloud.paolu.xray.proxy.vmess.inbound.DetourConfigOrBuilder getDetourOrBuilder();
}
