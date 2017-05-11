package com.bc.cloud.feign.vo.response;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-05-11
 * Time:  下午 4:19.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public class MMHResponse<T> implements Serializable {

    public static final int SUCCESS_CODE = 1;
    public static final int ERROR_CODE = 0;
    //成功或失败
    private boolean             success = true;
    //信息
    private String              msg = "";
    //业务扩展码：可以用于错误码
    private Integer             bizCode = SUCCESS_CODE;
    //扩展信息
    private String              bizInfo = "";
    //实际的数据
//    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
    private T                   body;

    public MMHResponse() {
    }

    public MMHResponse(boolean success) {
        this.success = success;
    }

    public MMHResponse(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public MMHResponse(boolean success, Integer bizCode, String msg) {
        this.success = success;
        this.bizCode = bizCode;
        this.msg = msg;
    }

    public MMHResponse(boolean success, String msg, String bizInfo) {
        this.success = success;
        this.msg = msg;
        this.bizInfo = bizInfo;
    }

    public MMHResponse(boolean success, Integer bizCode, String msg, String bizInfo) {
        this.success = success;
        this.bizCode = bizCode;
        this.msg = msg;
        this.bizInfo = bizInfo;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getBizCode() {
        return bizCode;
    }

    public void setBizCode(Integer bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizInfo() {
        return bizInfo;
    }

    public void setBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
