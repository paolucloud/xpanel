// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/router/config.proto

package cloud.paolu.xray.app.router;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_Domain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_Domain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_Domain_Attribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_Domain_Attribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_CIDR_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_CIDR_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_GeoIP_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_GeoIP_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_GeoIPList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_GeoIPList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_GeoSite_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_GeoSite_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_GeoSiteList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_GeoSiteList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_RoutingRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_RoutingRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_RoutingRule_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_RoutingRule_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_BalancingRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_BalancingRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xray_app_router_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xray_app_router_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027app/router/config.proto\022\017xray.app.rout" +
      "er\032\025common/net/port.proto\032\030common/net/ne" +
      "twork.proto\"\201\002\n\006Domain\022*\n\004type\030\001 \001(\0162\034.x" +
      "ray.app.router.Domain.Type\022\r\n\005value\030\002 \001(" +
      "\t\0224\n\tattribute\030\003 \003(\0132!.xray.app.router.D" +
      "omain.Attribute\032R\n\tAttribute\022\013\n\003key\030\001 \001(" +
      "\t\022\024\n\nbool_value\030\002 \001(\010H\000\022\023\n\tint_value\030\003 \001" +
      "(\003H\000B\r\n\013typed_value\"2\n\004Type\022\t\n\005Plain\020\000\022\t" +
      "\n\005Regex\020\001\022\n\n\006Domain\020\002\022\010\n\004Full\020\003\"\"\n\004CIDR\022" +
      "\n\n\002ip\030\001 \001(\014\022\016\n\006prefix\030\002 \001(\r\"Y\n\005GeoIP\022\024\n\014" +
      "country_code\030\001 \001(\t\022#\n\004cidr\030\002 \003(\0132\025.xray." +
      "app.router.CIDR\022\025\n\rreverse_match\030\003 \001(\010\"2" +
      "\n\tGeoIPList\022%\n\005entry\030\001 \003(\0132\026.xray.app.ro" +
      "uter.GeoIP\"H\n\007GeoSite\022\024\n\014country_code\030\001 " +
      "\001(\t\022\'\n\006domain\030\002 \003(\0132\027.xray.app.router.Do" +
      "main\"6\n\013GeoSiteList\022\'\n\005entry\030\001 \003(\0132\030.xra" +
      "y.app.router.GeoSite\"\335\005\n\013RoutingRule\022\r\n\003" +
      "tag\030\001 \001(\tH\000\022\027\n\rbalancing_tag\030\014 \001(\tH\000\022\'\n\006" +
      "domain\030\002 \003(\0132\027.xray.app.router.Domain\022\'\n" +
      "\004cidr\030\003 \003(\0132\025.xray.app.router.CIDRB\002\030\001\022%" +
      "\n\005geoip\030\n \003(\0132\026.xray.app.router.GeoIP\0222\n" +
      "\nport_range\030\004 \001(\0132\032.xray.common.net.Port" +
      "RangeB\002\030\001\022,\n\tport_list\030\016 \001(\0132\031.xray.comm" +
      "on.net.PortList\0226\n\014network_list\030\005 \001(\0132\034." +
      "xray.common.net.NetworkListB\002\030\001\022*\n\010netwo" +
      "rks\030\r \003(\0162\030.xray.common.net.Network\022.\n\013s" +
      "ource_cidr\030\006 \003(\0132\025.xray.app.router.CIDRB" +
      "\002\030\001\022,\n\014source_geoip\030\013 \003(\0132\026.xray.app.rou" +
      "ter.GeoIP\0223\n\020source_port_list\030\020 \001(\0132\031.xr" +
      "ay.common.net.PortList\022\022\n\nuser_email\030\007 \003" +
      "(\t\022\023\n\013inbound_tag\030\010 \003(\t\022\020\n\010protocol\030\t \003(" +
      "\t\022@\n\nattributes\030\017 \003(\0132,.xray.app.router." +
      "RoutingRule.AttributesEntry\022\026\n\016domain_ma" +
      "tcher\030\021 \001(\t\0321\n\017AttributesEntry\022\013\n\003key\030\001 " +
      "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\014\n\ntarget_tag\"I\n\r" +
      "BalancingRule\022\013\n\003tag\030\001 \001(\t\022\031\n\021outbound_s" +
      "elector\030\002 \003(\t\022\020\n\010strategy\030\003 \001(\t\"\366\001\n\006Conf" +
      "ig\022?\n\017domain_strategy\030\001 \001(\0162&.xray.app.r" +
      "outer.Config.DomainStrategy\022*\n\004rule\030\002 \003(" +
      "\0132\034.xray.app.router.RoutingRule\0226\n\016balan" +
      "cing_rule\030\003 \003(\0132\036.xray.app.router.Balanc" +
      "ingRule\"G\n\016DomainStrategy\022\010\n\004AsIs\020\000\022\t\n\005U" +
      "seIp\020\001\022\020\n\014IpIfNonMatch\020\002\022\016\n\nIpOnDemand\020\003" +
      "BW\n\033cloud.paolu.xray.app.routerP\001Z$githu" +
      "b.com/xtls/xray-core/app/router\252\002\017Xray.A" +
      "pp.Routerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cloud.paolu.xray.common.net.Port.getDescriptor(),
          cloud.paolu.xray.common.net.NetworkOuterClass.getDescriptor(),
        });
    internal_static_xray_app_router_Domain_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xray_app_router_Domain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_Domain_descriptor,
        new java.lang.String[] { "Type", "Value", "Attribute", });
    internal_static_xray_app_router_Domain_Attribute_descriptor =
      internal_static_xray_app_router_Domain_descriptor.getNestedTypes().get(0);
    internal_static_xray_app_router_Domain_Attribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_Domain_Attribute_descriptor,
        new java.lang.String[] { "Key", "BoolValue", "IntValue", "TypedValue", });
    internal_static_xray_app_router_CIDR_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xray_app_router_CIDR_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_CIDR_descriptor,
        new java.lang.String[] { "Ip", "Prefix", });
    internal_static_xray_app_router_GeoIP_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_xray_app_router_GeoIP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_GeoIP_descriptor,
        new java.lang.String[] { "CountryCode", "Cidr", "ReverseMatch", });
    internal_static_xray_app_router_GeoIPList_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_xray_app_router_GeoIPList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_GeoIPList_descriptor,
        new java.lang.String[] { "Entry", });
    internal_static_xray_app_router_GeoSite_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_xray_app_router_GeoSite_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_GeoSite_descriptor,
        new java.lang.String[] { "CountryCode", "Domain", });
    internal_static_xray_app_router_GeoSiteList_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_xray_app_router_GeoSiteList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_GeoSiteList_descriptor,
        new java.lang.String[] { "Entry", });
    internal_static_xray_app_router_RoutingRule_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_xray_app_router_RoutingRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_RoutingRule_descriptor,
        new java.lang.String[] { "Tag", "BalancingTag", "Domain", "Cidr", "Geoip", "PortRange", "PortList", "NetworkList", "Networks", "SourceCidr", "SourceGeoip", "SourcePortList", "UserEmail", "InboundTag", "Protocol", "Attributes", "DomainMatcher", "TargetTag", });
    internal_static_xray_app_router_RoutingRule_AttributesEntry_descriptor =
      internal_static_xray_app_router_RoutingRule_descriptor.getNestedTypes().get(0);
    internal_static_xray_app_router_RoutingRule_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_RoutingRule_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_xray_app_router_BalancingRule_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_xray_app_router_BalancingRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_BalancingRule_descriptor,
        new java.lang.String[] { "Tag", "OutboundSelector", "Strategy", });
    internal_static_xray_app_router_Config_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_xray_app_router_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xray_app_router_Config_descriptor,
        new java.lang.String[] { "DomainStrategy", "Rule", "BalancingRule", });
    cloud.paolu.xray.common.net.Port.getDescriptor();
    cloud.paolu.xray.common.net.NetworkOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
