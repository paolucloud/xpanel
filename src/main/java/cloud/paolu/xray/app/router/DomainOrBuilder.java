// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package cloud.paolu.xray.app.router;

public interface DomainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.app.router.Domain)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Domain matching type.
   * </pre>
   *
   * <code>.xray.app.router.Domain.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Domain matching type.
   * </pre>
   *
   * <code>.xray.app.router.Domain.Type type = 1;</code>
   * @return The type.
   */
  cloud.paolu.xray.app.router.Domain.Type getType();

  /**
   * <pre>
   * Domain value.
   * </pre>
   *
   * <code>string value = 2;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Domain value.
   * </pre>
   *
   * <code>string value = 2;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * Attributes of this domain. May be used for filtering.
   * </pre>
   *
   * <code>repeated .xray.app.router.Domain.Attribute attribute = 3;</code>
   */
  java.util.List<cloud.paolu.xray.app.router.Domain.Attribute> 
      getAttributeList();
  /**
   * <pre>
   * Attributes of this domain. May be used for filtering.
   * </pre>
   *
   * <code>repeated .xray.app.router.Domain.Attribute attribute = 3;</code>
   */
  cloud.paolu.xray.app.router.Domain.Attribute getAttribute(int index);
  /**
   * <pre>
   * Attributes of this domain. May be used for filtering.
   * </pre>
   *
   * <code>repeated .xray.app.router.Domain.Attribute attribute = 3;</code>
   */
  int getAttributeCount();
  /**
   * <pre>
   * Attributes of this domain. May be used for filtering.
   * </pre>
   *
   * <code>repeated .xray.app.router.Domain.Attribute attribute = 3;</code>
   */
  java.util.List<? extends cloud.paolu.xray.app.router.Domain.AttributeOrBuilder> 
      getAttributeOrBuilderList();
  /**
   * <pre>
   * Attributes of this domain. May be used for filtering.
   * </pre>
   *
   * <code>repeated .xray.app.router.Domain.Attribute attribute = 3;</code>
   */
  cloud.paolu.xray.app.router.Domain.AttributeOrBuilder getAttributeOrBuilder(
      int index);
}
