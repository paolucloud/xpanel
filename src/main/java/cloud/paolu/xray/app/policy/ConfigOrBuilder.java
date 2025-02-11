// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/policy/config.proto

package cloud.paolu.xray.app.policy;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xray.app.policy.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint32, .xray.app.policy.Policy&gt; level = 1;</code>
   */
  int getLevelCount();
  /**
   * <code>map&lt;uint32, .xray.app.policy.Policy&gt; level = 1;</code>
   */
  boolean containsLevel(
      int key);
  /**
   * Use {@link #getLevelMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, cloud.paolu.xray.app.policy.Policy>
  getLevel();
  /**
   * <code>map&lt;uint32, .xray.app.policy.Policy&gt; level = 1;</code>
   */
  java.util.Map<java.lang.Integer, cloud.paolu.xray.app.policy.Policy>
  getLevelMap();
  /**
   * <code>map&lt;uint32, .xray.app.policy.Policy&gt; level = 1;</code>
   */
  /* nullable */
cloud.paolu.xray.app.policy.Policy getLevelOrDefault(
      int key,
      /* nullable */
cloud.paolu.xray.app.policy.Policy defaultValue);
  /**
   * <code>map&lt;uint32, .xray.app.policy.Policy&gt; level = 1;</code>
   */
  cloud.paolu.xray.app.policy.Policy getLevelOrThrow(
      int key);

  /**
   * <code>.xray.app.policy.SystemPolicy system = 2;</code>
   * @return Whether the system field is set.
   */
  boolean hasSystem();
  /**
   * <code>.xray.app.policy.SystemPolicy system = 2;</code>
   * @return The system.
   */
  cloud.paolu.xray.app.policy.SystemPolicy getSystem();
  /**
   * <code>.xray.app.policy.SystemPolicy system = 2;</code>
   */
  cloud.paolu.xray.app.policy.SystemPolicyOrBuilder getSystemOrBuilder();
}
