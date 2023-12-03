package cloud.paolu.xpanel.nnr.pojo;

import lombok.Data;

@Data
public class AddRuleResp {
    private String rid;
    private String sid;
    private String host;
    private int port;
    private String remote;
    private int rport;
    private String type;
    private String name;
    private long traffic;
    private Setting setting;

    @Data
    public static class Setting {
        private String loadbalanceMode;
    }
}
