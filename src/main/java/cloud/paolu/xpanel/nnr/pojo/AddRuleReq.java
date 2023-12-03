package cloud.paolu.xpanel.nnr.pojo;

import lombok.Data;

@Data
public class AddRuleReq {
    private String sid;
    private Integer port;
    private String remote;
    private Integer rport;
    private String type;
    private String name;
    private Setting setting;

    @Data
    public static class Setting {
        private String loadbalanceMode;
    }
}
