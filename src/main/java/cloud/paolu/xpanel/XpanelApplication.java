package cloud.paolu.xpanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("cloud.paolu.xpanel.*")
@EnableScheduling
public class XpanelApplication {

    public static void main(String[] args) {
        SpringApplication.run(XpanelApplication.class, args);
    }

}
