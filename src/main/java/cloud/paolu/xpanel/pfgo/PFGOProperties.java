package cloud.paolu.xpanel.pfgo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "pfgo")
public class PFGOProperties {

    private String username;
    private String password;
    private String token;
}
