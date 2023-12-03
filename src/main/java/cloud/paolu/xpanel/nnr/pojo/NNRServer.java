package cloud.paolu.xpanel.nnr.pojo;

import lombok.Data;

import java.util.List;

@Data
public class NNRServer {
    private String sid;
    private String name;
    private String host;
    private int min;
    private int max;
    private double mf;
    private int level;
    private String detail;
    private List<String> types;
}
