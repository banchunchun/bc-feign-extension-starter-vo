package com.bc.cloud.feign.vo.error;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-05-11
 * Time:  下午 4:18.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public class SystemError {

    /**
     * 系统不可用
     */
    public static final int SYSTEM_UNAVAILABLE = -1000;
    /**
     * 系统繁忙
     */
    public static final int SYSTEM_BUSY = -1001;
    /**
     * 系统错误
     */
    public static final int SYSTEM_ERROR = -1002;
}
