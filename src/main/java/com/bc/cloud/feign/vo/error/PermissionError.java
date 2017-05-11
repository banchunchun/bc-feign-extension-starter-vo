package com.bc.cloud.feign.vo.error;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-05-11
 * Time:  下午 4:17.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public class PermissionError {

    /**
     * 未授权
     */
    public static final int PERMISSION_NOT_AUTH = -4000;
    /**
     * 非法访问
     */
    public static final int PERMISSION_UNAUTHorized = -4001;
    /**
     * 授权被锁定
     */
    public static final int PERMISSION_LOCKED = -4002;
}
