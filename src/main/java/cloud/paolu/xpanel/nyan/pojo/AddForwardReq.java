package cloud.paolu.xpanel.nyan.pojo;

import lombok.Data;

@Data
public class AddForwardReq {
    public int deviceGroupIn;
    public int deviceGroupOut;
    public String name;
    public ForwardConfig config;
}
