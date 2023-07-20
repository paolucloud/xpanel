package cloud.paolu.xpanel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ray
 * @since 2023-07-18
 */
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getConnAddr() {
        return connAddr;
    }

    public void setConnAddr(String connAddr) {
        this.connAddr = connAddr;
    }

    public Integer getConnPort() {
        return connPort;
    }

    public void setConnPort(Integer connPort) {
        this.connPort = connPort;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    @Override
    public String toString() {
        return "Node{" +
        ", id = " + id +
        ", name = " + name +
        ", port = " + port +
        ", protocol = " + protocol +
        ", connAddr = " + connAddr +
        ", connPort = " + connPort +
        ", serverId = " + serverId +
        "}";
    }
}
