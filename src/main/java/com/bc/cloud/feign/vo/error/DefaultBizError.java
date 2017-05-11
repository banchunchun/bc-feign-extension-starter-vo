package com.bc.cloud.feign.vo.error;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-05-11
 * Time:  下午 4:17.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public class DefaultBizError {


    /**
     * 通用业务失败
     */
    public static final int BIZ_FAILURE = -5000;
    /**
     * 保存失败
     */
    public static final int BIZ_SAVE_FAILURE = -5001;
    /**
     * 删除失败
     */
    public static final int BIZ_DELETE_FAILURE = -5002;
    /**
     * 更新失败
     */
    public static final int BIZ_UPDATE_FAILURE = -5003;
    /**
     * 查询失败
     */
    public static final int BIZ_QUERY_FAILURE = -5004;
}
