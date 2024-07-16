package cloud.paolu.xpanel.nyan.pojo;

import cn.hutool.json.JSONObject;
import lombok.Data;

@Data
public class DeviceGroup {
    private int id;
    private String name;
    private String type;
    private String ratio;
    private long trafficUsed;
    private String connectHost;
    private String portRange;
    private String config;
    private int fallbackGroup;
    private int showOrder;
    private int displayNum;
}
