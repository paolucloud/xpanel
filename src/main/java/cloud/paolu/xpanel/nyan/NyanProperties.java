package cloud.paolu.xpanel.nyan;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "nyan")
public class NyanProperties {

    private List<NyanItem> items;
    private String cron;
    @Data
    public static class NyanItem {
        private String name;
        private String url;
        private String username;
        private String password;
    }

}
