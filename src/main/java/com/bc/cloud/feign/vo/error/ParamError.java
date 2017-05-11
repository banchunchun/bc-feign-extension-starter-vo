package com.bc.cloud.feign.vo.error;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-05-11
 * Time:  下午 4:17.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public class ParamError {

    /**
     * 参数为空
     */
    public static final int PARAM_NULL = -2001;
    /**
     * 参数不正确
     */
    public static final int PARAM_INCORRECT = -2002;
    /**
     * ID不正确
     */
    public static final int PARAM_ID_INCORRECT = -2003;
    /**
     * 手机号不正确
     */
    public static final int PARAM_MOBILE_INCORRECT = -2004;
    /**
     * 账号不正确
     */
    public static final int PARAM_ACCOUNT_INCORRECT = -2005;
    /**
     * 验证码不正确
     */
    public static final int PARAM_VCODE_INCORRECT = -2006;
    /**
     * 密码不正确
     */
    public static final int PARAM_PWD_INCORRECT = -2007;
    /**
     * 电邮不正确
     */
    public static final int PARAM_EMAIL_INCORRECT = -2008;
    /**
     * 日期不正确
     */
    public static final int PARAM_DATE_INCORRECT = -2009;
    /**
     * 性别不正确
     */
    public static final int PARAM_GENDER_INCORRECT = -2010;

}
