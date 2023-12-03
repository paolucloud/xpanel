package cloud.paolu.xpanel.nnr.pojo;

import lombok.Data;

@Data
public class NNRRule {
    private String rid;
    private String uid;
    private String sid;
    private String host;
    private int port;
    private String remote;
    private int rport;
    private String type;
    private int status;
    private String name;
    private long traffic;
    private String data;
    private long date;
    private Setting setting;

    @Data
    public static class Setting {
        private int proxyProtocol;
        private String loadbalanceMode;
    }
}
