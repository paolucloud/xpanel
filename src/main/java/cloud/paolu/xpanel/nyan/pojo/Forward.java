package cloud.paolu.xpanel.nyan.pojo;

import cn.hutool.json.JSONObject;
import lombok.Data;

@Data
public class Forward {
    public int id;
    public String name;
    public int uid;
    public int listenPort;
    public int deviceGroupIn;
    public int deviceGroupOut;
    public String config;
    public String status;
    public String displayUpdatedAt;
}
