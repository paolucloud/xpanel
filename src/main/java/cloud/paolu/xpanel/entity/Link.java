package cloud.paolu.xpanel.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ray
 * @since 2023-07-19
 */
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String token;
    private String userid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Link{" +
        ", id = " + id +
        ", token = " + token +
        ", userid = " + userid +
        "}";
    }
}
