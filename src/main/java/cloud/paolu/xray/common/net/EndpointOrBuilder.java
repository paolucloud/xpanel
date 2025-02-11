// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/net/destination.proto

package cloud.paolu.xray.common.net;

public interface EndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.common.net.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.xray.common.net.Network network = 1;</code>
   * @return The enum numeric value on the wire for network.
   */
  int getNetworkValue();
  /**
   * <code>.xray.common.net.Network network = 1;</code>
   * @return The network.
   */
  cloud.paolu.xray.common.net.Network getNetwork();

  /**
   * <code>.xray.common.net.IPOrDomain address = 2;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.xray.common.net.IPOrDomain address = 2;</code>
   * @return The address.
   */
  cloud.paolu.xray.common.net.IPOrDomain getAddress();
  /**
   * <code>.xray.common.net.IPOrDomain address = 2;</code>
   */
  cloud.paolu.xray.common.net.IPOrDomainOrBuilder getAddressOrBuilder();

  /**
   * <code>uint32 port = 3;</code>
   * @return The port.
   */
  int getPort();
}
