package cloud.paolu.xpanel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ray
 * @since 2023-07-18
 */
@Data
@ToString
public class Server implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private String ip;
    private Integer sshPort;
    private String sshUser;
    private String sshPass;
    private Integer xrayEndpoint;
    private String location;
    private String conditionn;

}
