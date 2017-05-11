package com.bc.cloud.feign.vo.error;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-05-11
 * Time:  下午 4:18.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public class ResourceError {
    /**
     * 资源未找到
     */
    public static final int RESOURCE_NOT_FOUND = -3000;
    /**
     * 资源已过期
     */
    public static final int RESOURCE_EXPIRE = -3001;
    /**
     * 资源已罄
     */
    public static final int RESOURCE_OUT_OF_STOCK = -3002;
    /**
     * 资源访问受限
     */
    public static final int RESOURCE_ACCESS_LIMITED = -3003;
}
