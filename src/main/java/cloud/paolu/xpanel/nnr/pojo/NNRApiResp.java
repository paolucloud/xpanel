package cloud.paolu.xpanel.nnr.pojo;

import lombok.Data;

@Data
public class NNRApiResp<T> {

    private int status;
    private T data;
}
