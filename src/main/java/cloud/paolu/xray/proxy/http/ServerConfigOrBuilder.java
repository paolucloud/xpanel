// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/http/config.proto

package cloud.paolu.xray.proxy.http;

public interface ServerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.proxy.http.ServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 timeout = 1 [deprecated = true];</code>
   * @deprecated xray.proxy.http.ServerConfig.timeout is deprecated.
   *     See proxy/http/config.proto;l=17
   * @return The timeout.
   */
  @java.lang.Deprecated int getTimeout();

  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  int getAccountsCount();
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  boolean containsAccounts(
      java.lang.String key);
  /**
   * Use {@link #getAccountsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAccounts();
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAccountsMap();
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  /* nullable */
java.lang.String getAccountsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  java.lang.String getAccountsOrThrow(
      java.lang.String key);

  /**
   * <code>bool allow_transparent = 3;</code>
   * @return The allowTransparent.
   */
  boolean getAllowTransparent();

  /**
   * <code>uint32 user_level = 4;</code>
   * @return The userLevel.
   */
  int getUserLevel();
}
