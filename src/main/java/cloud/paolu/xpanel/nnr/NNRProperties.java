package cloud.paolu.xpanel.nnr;

import cloud.paolu.xpanel.nnr.pojo.NNRUser;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "nnr")
public class NNRProperties {

    private String name;
    private String passwd;
    private String token;

}
