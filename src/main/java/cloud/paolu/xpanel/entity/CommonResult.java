package cloud.paolu.xpanel.entity;

import cloud.paolu.xpanel.exception.ErrorCode;
import cloud.paolu.xpanel.exception.ServerException;
import cloud.paolu.xpanel.exception.ServiceException;
import cloud.paolu.xpanel.exception.enums.GlobalErrorCodeConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * 通用返回
 *
 * @param <T> 数据泛型
 */
@Data
public class CommonResult<T> implements Serializable {

    /**
     * 错误码
     *
     * @see ErrorCode#getCode()
     */
    private Integer code;
    /**
     * 返回数据
     */
    private T data;
    /**
     * 错误提示，用户可阅读
     *
     * @see ErrorCode#getMsg() ()
     */
    private String errorMessage;

    /**
     * 请求是否成功 对接Ant Design Pro
     */
    private boolean success;

    /**
     * 将传入的 result 对象，转换成另外一个泛型结果的对象
     *
     * 因为 A 方法返回的 CommonResult 对象，不满足调用其的 B 方法的返回，所以需要进行转换。
     *
     * @param result 传入的 result 对象
     * @param <T> 返回的泛型
     * @return 新的 CommonResult 对象
     */
    public static <T> CommonResult<T> error(CommonResult<?> result) {
        return error(result.getCode(), result.getErrorMessage());
    }

    public static <T> CommonResult<T> error(Integer code, String message) {
//        Assert.isTrue(!GlobalErrorCodeConstants.OK.getCode().equals(code), "code 必须是错误的！");
        CommonResult<T> result = new CommonResult<>();
        result.code = code;
        result.errorMessage = message;
        result.success = false;
        return result;
    }

    public static <T> CommonResult<T> error(ErrorCode errorCode) {
        return error(errorCode.getCode(), errorCode.getMsg());
    }

    // ruoyi-vue-pro里面原本方法名称为success,但是Ant Design Pro中约定必须要返回success参数，由于名称冲突，所以修改此方法名称
    public static <T> CommonResult<T> ok(T data) {
        CommonResult<T> result = new CommonResult<>();
        result.success = true;
        result.code = GlobalErrorCodeConstants.OK.getCode();
        result.data = data;
        result.errorMessage = "";
        return result;
    }

    public static boolean isOk(Integer code) {
        return Objects.equals(code, GlobalErrorCodeConstants.OK.getCode());
    }

    @JsonIgnore // 避免 jackson 序列化
    public boolean isOk() {
        return isOk(code);
    }

    @JsonIgnore // 避免 jackson 序列化
    public boolean isError() {
        return !isOk();
    }

    // ========= 和 Exception 异常体系集成 =========

    /**
     * 判断是否有异常。如果有，则抛出 {@link ServiceException} 异常
     */
    public void checkError() throws ServiceException {
        if (isOk()) {
            return;
        }
        // 服务端异常
        if (GlobalErrorCodeConstants.isServerErrorCode(code)) {
            throw new ServerException(code, errorMessage);
        }
        // 业务异常
        throw new ServiceException(code, errorMessage);
    }

    /**
     * 判断是否有异常。如果有，则抛出 {@link ServiceException} 异常
     * 如果没有，则返回 {@link #data} 数据
     */
    @JsonIgnore // 避免 jackson 序列化
    public T getCheckedData() {
        checkError();
        return data;
    }

    public static <T> CommonResult<T> error(ServiceException serviceException) {
        return error(serviceException.getCode(), serviceException.getMessage());
    }

    @Override
    public String toString() {
        return "{" +
                "\"code\"=" + code +
                ", \"data\"=" + data +
                ", \"errorMessage\"='" + errorMessage + '\'' +
                ", \"success\"=" + success +
                '}';
    }
}
