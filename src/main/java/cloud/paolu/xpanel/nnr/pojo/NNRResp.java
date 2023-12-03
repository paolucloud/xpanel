package cloud.paolu.xpanel.nnr.pojo;

import lombok.Data;

@Data
public class NNRResp<T> {

    private Boolean status;
    private T data;
}
