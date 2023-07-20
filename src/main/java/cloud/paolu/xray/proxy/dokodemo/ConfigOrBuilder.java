// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/dokodemo/config.proto

package cloud.paolu.xray.proxy.dokodemo;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.proxy.dokodemo.Config)
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
   * <pre>
   * List of networks that the Dokodemo accepts.
   * Deprecated. Use networks.
   * </pre>
   *
   * <code>.xray.common.net.NetworkList network_list = 3 [deprecated = true];</code>
   * @deprecated xray.proxy.dokodemo.Config.network_list is deprecated.
   *     See proxy/dokodemo/config.proto;l=17
   * @return Whether the networkList field is set.
   */
  @java.lang.Deprecated boolean hasNetworkList();
  /**
   * <pre>
   * List of networks that the Dokodemo accepts.
   * Deprecated. Use networks.
   * </pre>
   *
   * <code>.xray.common.net.NetworkList network_list = 3 [deprecated = true];</code>
   * @deprecated xray.proxy.dokodemo.Config.network_list is deprecated.
   *     See proxy/dokodemo/config.proto;l=17
   * @return The networkList.
   */
  @java.lang.Deprecated cloud.paolu.xray.common.net.NetworkList getNetworkList();
  /**
   * <pre>
   * List of networks that the Dokodemo accepts.
   * Deprecated. Use networks.
   * </pre>
   *
   * <code>.xray.common.net.NetworkList network_list = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated cloud.paolu.xray.common.net.NetworkListOrBuilder getNetworkListOrBuilder();

  /**
   * <pre>
   * List of networks that the Dokodemo accepts.
   * </pre>
   *
   * <code>repeated .xray.common.net.Network networks = 7;</code>
   * @return A list containing the networks.
   */
  java.util.List<cloud.paolu.xray.common.net.Network> getNetworksList();
  /**
   * <pre>
   * List of networks that the Dokodemo accepts.
   * </pre>
   *
   * <code>repeated .xray.common.net.Network networks = 7;</code>
   * @return The count of networks.
   */
  int getNetworksCount();
  /**
   * <pre>
   * List of networks that the Dokodemo accepts.
   * </pre>
   *
   * <code>repeated .xray.common.net.Network networks = 7;</code>
   * @param index The index of the element to return.
   * @return The networks at the given index.
   */
  cloud.paolu.xray.common.net.Network getNetworks(int index);
  /**
   * <pre>
   * List of networks that the Dokodemo accepts.
   * </pre>
   *
   * <code>repeated .xray.common.net.Network networks = 7;</code>
   * @return A list containing the enum numeric values on the wire for networks.
   */
  java.util.List<java.lang.Integer>
  getNetworksValueList();
  /**
   * <pre>
   * List of networks that the Dokodemo accepts.
   * </pre>
   *
   * <code>repeated .xray.common.net.Network networks = 7;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of networks at the given index.
   */
  int getNetworksValue(int index);

  /**
   * <code>uint32 timeout = 4 [deprecated = true];</code>
   * @deprecated xray.proxy.dokodemo.Config.timeout is deprecated.
   *     See proxy/dokodemo/config.proto;l=21
   * @return The timeout.
   */
  @java.lang.Deprecated int getTimeout();

  /**
   * <code>bool follow_redirect = 5;</code>
   * @return The followRedirect.
   */
  boolean getFollowRedirect();

  /**
   * <code>uint32 user_level = 6;</code>
   * @return The userLevel.
   */
  int getUserLevel();
}
