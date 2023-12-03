package cloud.paolu.xpanel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

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
public class Node implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer port;

    /**
     * 传输协议
     */
    private String protocol;

    /**
     * 连接地址
     */
    private String connAddr;

    /**
     * 订阅下发端口
     */
    private Integer connPort;
    private Integer serverId;

    private Boolean hidden;
    private String ruleId;

}
