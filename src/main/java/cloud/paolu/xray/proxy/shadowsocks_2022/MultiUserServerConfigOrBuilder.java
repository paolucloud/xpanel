// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/shadowsocks_2022/config.proto

package cloud.paolu.xray.proxy.shadowsocks_2022;

public interface MultiUserServerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.proxy.shadowsocks_2022.MultiUserServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string method = 1;</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <code>string method = 1;</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <code>string key = 2;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 2;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>repeated .xray.proxy.shadowsocks_2022.User users = 3;</code>
   */
  java.util.List<cloud.paolu.xray.proxy.shadowsocks_2022.User> 
      getUsersList();
  /**
   * <code>repeated .xray.proxy.shadowsocks_2022.User users = 3;</code>
   */
  cloud.paolu.xray.proxy.shadowsocks_2022.User getUsers(int index);
  /**
   * <code>repeated .xray.proxy.shadowsocks_2022.User users = 3;</code>
   */
  int getUsersCount();
  /**
   * <code>repeated .xray.proxy.shadowsocks_2022.User users = 3;</code>
   */
  java.util.List<? extends cloud.paolu.xray.proxy.shadowsocks_2022.UserOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <code>repeated .xray.proxy.shadowsocks_2022.User users = 3;</code>
   */
  cloud.paolu.xray.proxy.shadowsocks_2022.UserOrBuilder getUsersOrBuilder(
      int index);

  /**
   * <code>repeated .xray.common.net.Network network = 4;</code>
   * @return A list containing the network.
   */
  java.util.List<cloud.paolu.xray.common.net.Network> getNetworkList();
  /**
   * <code>repeated .xray.common.net.Network network = 4;</code>
   * @return The count of network.
   */
  int getNetworkCount();
  /**
   * <code>repeated .xray.common.net.Network network = 4;</code>
   * @param index The index of the element to return.
   * @return The network at the given index.
   */
  cloud.paolu.xray.common.net.Network getNetwork(int index);
  /**
   * <code>repeated .xray.common.net.Network network = 4;</code>
   * @return A list containing the enum numeric values on the wire for network.
   */
  java.util.List<java.lang.Integer>
  getNetworkValueList();
  /**
   * <code>repeated .xray.common.net.Network network = 4;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of network at the given index.
   */
  int getNetworkValue(int index);
}
