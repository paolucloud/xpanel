package cloud.paolu.xpanel.entity;

import lombok.Data;

@Data
public class V2rayNUrl {
    /**
     * v表示配置版本，目前仅支持2
     */
    private String v;
    /**
     * 节点名称
     */
    private String ps;
    /**
     * 节点名称
     */
    private String add;
    /**
     * 节点端口
     */
    private String port;
    /**
     * 用户uuid
     */
    private String id;
    /**
     * alterId
     */
    private String aid;
    /**
     * 加密方式
     */
    private String scy;
    /**
     * 传输方式
     */
    private String net;
    /**
     * 伪装类型
     */
    private String type;
    /**
     * 伪装域名
     */
    private String host;
    /**
     * 请求路径
     */
    private String path;
    /**
     * tls
     */
    private String tls;
    /**
     * sni
     */
    private String sni;
    /**
     * alpn
     */
    private String alpn;
}
