// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/serial/typed_message.proto

package cloud.paolu.xray.common.serial;

public interface TypedMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.common.serial.TypedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the message type, retrieved from protobuf API.
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * The name of the message type, retrieved from protobuf API.
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Serialized proto message.
   * </pre>
   *
   * <code>bytes value = 2;</code>
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();
}
