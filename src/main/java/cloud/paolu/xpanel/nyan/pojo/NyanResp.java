package cloud.paolu.xpanel.nyan.pojo;

import lombok.Data;

@Data
public class NyanResp<T> {
    private int code;
    private String msg;
    private T data;
    private int count;
}
