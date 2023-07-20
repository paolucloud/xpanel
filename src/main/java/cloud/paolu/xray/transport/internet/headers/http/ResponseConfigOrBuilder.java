// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport/internet/headers/http/config.proto

package cloud.paolu.xray.transport.internet.headers.http;

public interface ResponseConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.transport.internet.headers.http.ResponseConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.xray.transport.internet.headers.http.Version version = 1;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <code>.xray.transport.internet.headers.http.Version version = 1;</code>
   * @return The version.
   */
  cloud.paolu.xray.transport.internet.headers.http.Version getVersion();
  /**
   * <code>.xray.transport.internet.headers.http.Version version = 1;</code>
   */
  cloud.paolu.xray.transport.internet.headers.http.VersionOrBuilder getVersionOrBuilder();

  /**
   * <code>.xray.transport.internet.headers.http.Status status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.xray.transport.internet.headers.http.Status status = 2;</code>
   * @return The status.
   */
  cloud.paolu.xray.transport.internet.headers.http.Status getStatus();
  /**
   * <code>.xray.transport.internet.headers.http.Status status = 2;</code>
   */
  cloud.paolu.xray.transport.internet.headers.http.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated .xray.transport.internet.headers.http.Header header = 3;</code>
   */
  java.util.List<cloud.paolu.xray.transport.internet.headers.http.Header> 
      getHeaderList();
  /**
   * <code>repeated .xray.transport.internet.headers.http.Header header = 3;</code>
   */
  cloud.paolu.xray.transport.internet.headers.http.Header getHeader(int index);
  /**
   * <code>repeated .xray.transport.internet.headers.http.Header header = 3;</code>
   */
  int getHeaderCount();
  /**
   * <code>repeated .xray.transport.internet.headers.http.Header header = 3;</code>
   */
  java.util.List<? extends cloud.paolu.xray.transport.internet.headers.http.HeaderOrBuilder> 
      getHeaderOrBuilderList();
  /**
   * <code>repeated .xray.transport.internet.headers.http.Header header = 3;</code>
   */
  cloud.paolu.xray.transport.internet.headers.http.HeaderOrBuilder getHeaderOrBuilder(
      int index);
}
