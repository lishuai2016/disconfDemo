package xyz.uutech.www.opencartservice.exception;

/**
 * 未发现记录异常
 *
 * @author chenx
 * @date 2016/4/20
 */
public class NotFoundException extends RuntimeException {
    /**
     * 构造函数
     *
     * @param errorCode 错误码
     * @param msg 日志异常信息
     *
     * @author chenx
     * @date 2016/04/20
     */
    public NotFoundException(int errorCode, String msg) {
        this(errorCode, msg, null);
    }

    /**
     * 构造函数
     *
     * @param errorCode 错误码
     * @param msg       日志异常信息
     * @param cause     异常原因
     *
     * @author chenx
     * @date 2016/04/20
     */
    public NotFoundException(int errorCode, String msg, Throwable cause) {
        super(errorCode, msg, cause);
    }
}
