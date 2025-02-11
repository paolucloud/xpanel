// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/wireguard/config.proto

package cloud.paolu.xray.proxy.wireguard;

public interface PeerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.proxy.wireguard.PeerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string public_key = 1;</code>
   * @return The publicKey.
   */
  java.lang.String getPublicKey();
  /**
   * <code>string public_key = 1;</code>
   * @return The bytes for publicKey.
   */
  com.google.protobuf.ByteString
      getPublicKeyBytes();

  /**
   * <code>string pre_shared_key = 2;</code>
   * @return The preSharedKey.
   */
  java.lang.String getPreSharedKey();
  /**
   * <code>string pre_shared_key = 2;</code>
   * @return The bytes for preSharedKey.
   */
  com.google.protobuf.ByteString
      getPreSharedKeyBytes();

  /**
   * <code>string endpoint = 3;</code>
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   * <code>string endpoint = 3;</code>
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString
      getEndpointBytes();

  /**
   * <code>int32 keep_alive = 4;</code>
   * @return The keepAlive.
   */
  int getKeepAlive();

  /**
   * <code>repeated string allowed_ips = 5;</code>
   * @return A list containing the allowedIps.
   */
  java.util.List<java.lang.String>
      getAllowedIpsList();
  /**
   * <code>repeated string allowed_ips = 5;</code>
   * @return The count of allowedIps.
   */
  int getAllowedIpsCount();
  /**
   * <code>repeated string allowed_ips = 5;</code>
   * @param index The index of the element to return.
   * @return The allowedIps at the given index.
   */
  java.lang.String getAllowedIps(int index);
  /**
   * <code>repeated string allowed_ips = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowedIps at the given index.
   */
  com.google.protobuf.ByteString
      getAllowedIpsBytes(int index);
}
