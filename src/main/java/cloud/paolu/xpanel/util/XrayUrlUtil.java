package cloud.paolu.xpanel.util;

import cloud.paolu.xpanel.entity.Node;
import cloud.paolu.xpanel.entity.V2rayNUrl;
import cn.hutool.core.codec.Base64;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.casbin.casdoor.entity.CasdoorUser;

public class XrayUrlUtil {
    public static String url(Node node, CasdoorUser user) {
        return node.getProtocol()+"://" + user.getId() + "@" + node.getConnAddr() + ":" +node.getConnPort() + "#" + node.getName();
    }

    /**
     * v2rayn订阅地址
     * 参考链接： <a href="https://www.python100.com/html/194ZH281FEXR.html">...</a>
     * @param node 节点
     * @param user casdoor用户
     * @return
     */
    public static String jsonUrl(Node node, CasdoorUser user) {
        V2rayNUrl url = new V2rayNUrl();
        url.setV("2");
        url.setPs(node.getName());
        url.setAdd(node.getConnAddr());
        url.setPort(node.getConnPort()+"");
        url.setId(user.getId());
        url.setAid("0");
        url.setScy("auto");
        url.setNet("tcp");
        url.setType("none");
        return node.getProtocol() + "://" + Base64.encode(JSONUtil.toJsonStr(url));
    }

    public static String jsonUrl(Node node, String user) {
        V2rayNUrl url = new V2rayNUrl();
        url.setV("2");
        url.setPs(node.getName());
        url.setAdd(node.getConnAddr());
        url.setPort(node.getConnPort()+"");
        url.setId(user);
        url.setAid("0");
        url.setScy("auto");
        url.setNet("tcp");
        url.setType("none");
        return node.getProtocol() + "://" + Base64.encode(JSONUtil.toJsonStr(url));
    }
}
