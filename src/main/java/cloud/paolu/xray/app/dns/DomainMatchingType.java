// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/dns/config.proto

package cloud.paolu.xray.app.dns;

/**
 * Protobuf enum {@code xray.app.dns.DomainMatchingType}
 */
public enum DomainMatchingType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Full = 0;</code>
   */
  Full(0),
  /**
   * <code>Subdomain = 1;</code>
   */
  Subdomain(1),
  /**
   * <code>Keyword = 2;</code>
   */
  Keyword(2),
  /**
   * <code>Regex = 3;</code>
   */
  Regex(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Full = 0;</code>
   */
  public static final int Full_VALUE = 0;
  /**
   * <code>Subdomain = 1;</code>
   */
  public static final int Subdomain_VALUE = 1;
  /**
   * <code>Keyword = 2;</code>
   */
  public static final int Keyword_VALUE = 2;
  /**
   * <code>Regex = 3;</code>
   */
  public static final int Regex_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DomainMatchingType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DomainMatchingType forNumber(int value) {
    switch (value) {
      case 0: return Full;
      case 1: return Subdomain;
      case 2: return Keyword;
      case 3: return Regex;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DomainMatchingType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DomainMatchingType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DomainMatchingType>() {
          public DomainMatchingType findValueByNumber(int number) {
            return DomainMatchingType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return cloud.paolu.xray.app.dns.ConfigOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final DomainMatchingType[] VALUES = values();

  public static DomainMatchingType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DomainMatchingType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:xray.app.dns.DomainMatchingType)
}

