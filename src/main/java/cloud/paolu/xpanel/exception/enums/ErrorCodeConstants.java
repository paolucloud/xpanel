package cloud.paolu.xpanel.exception.enums;


import cloud.paolu.xpanel.exception.ErrorCode;

public interface ErrorCodeConstants {

    // ==================sso-server================
    // ===================权限模块===================
    // -------------------重置密码-------------------
    ErrorCode AUTH_RESET_PASSWORD_NOT_REQUEST = new ErrorCode(1001000000,"重置密码验证失败，未找到用户请求重置密码记录");
    ErrorCode AUTH_RESET_PASSWORD_TOKEN_EXPIRED = new ErrorCode(1001000001,"重置密码验证失败，请求已过期");
    ErrorCode AUTH_RESET_PASSWORD_TOKEN_NOT_MATCH = new ErrorCode(1001000002,"重置密码验证失败，token不匹配");

    // -------------------角色管理-------------------
    ErrorCode AUTH_ROLE_IS_NULL = new ErrorCode(1001001000, "用户尚未分配角色");

    // -------------------菜单管理-------------------
    ErrorCode AUTH_MENU_IS_NULL = new ErrorCode(1001001001,"用户尚未分配菜单");


    // =================nps-server=================
    // ===================NPS模块===================
    // ----------------NPS服务端管理-----------------



    // ----------------NPS客户端管理-----------------



    // ---------------NPS API请求管理---------------
    public static final int NPS_API_CLIENT_EXCEPTION = 1002002000;
    ErrorCode NPS_API_CLIENT_ADD_ERROR = new ErrorCode(1002002001,"添加客户端失败");
    ErrorCode NPS_API_TUNNEL_ADD_ERROR = new ErrorCode(1002002002,"添加隧道失败");
    ErrorCode NPS_API_TUNNEL_EDIT_ERROR = new ErrorCode(1002002003,"修改隧道失败");
    ErrorCode NPS_API_TUNNEL_DELETE_ERROR = new ErrorCode(1002002004,"删除隧道失败");
    ErrorCode NPS_API_HOST_ADD_ERROR = new ErrorCode(1002002005,"添加建站失败");
    ErrorCode NPS_API_HOST_EDIT_ERROR = new ErrorCode(1002002006,"修改建站失败");
    ErrorCode NPS_API_HOST_DELETE_ERROR = new ErrorCode(1002002007,"删除建站失败");

    // -----------------支付模块-------------------
    public static final int PAY_EXCEPTION = 1002003000;
    ErrorCode PAY_RECHARGE_COMPLETE = new ErrorCode(1002003001, "充值已到账");
}
