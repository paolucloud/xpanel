// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package cloud.paolu.xray.app.router;

public interface GeoIPOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.app.router.GeoIP)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string country_code = 1;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <code>string country_code = 1;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <code>repeated .xray.app.router.CIDR cidr = 2;</code>
   */
  java.util.List<cloud.paolu.xray.app.router.CIDR> 
      getCidrList();
  /**
   * <code>repeated .xray.app.router.CIDR cidr = 2;</code>
   */
  cloud.paolu.xray.app.router.CIDR getCidr(int index);
  /**
   * <code>repeated .xray.app.router.CIDR cidr = 2;</code>
   */
  int getCidrCount();
  /**
   * <code>repeated .xray.app.router.CIDR cidr = 2;</code>
   */
  java.util.List<? extends cloud.paolu.xray.app.router.CIDROrBuilder> 
      getCidrOrBuilderList();
  /**
   * <code>repeated .xray.app.router.CIDR cidr = 2;</code>
   */
  cloud.paolu.xray.app.router.CIDROrBuilder getCidrOrBuilder(
      int index);

  /**
   * <code>bool reverse_match = 3;</code>
   * @return The reverseMatch.
   */
  boolean getReverseMatch();
}
