package com.bc.cloud.feign.vo.response;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-05-11
 * Time:  下午 4:20.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public class SuccessResponse<T> extends MMHResponse {

    public SuccessResponse() {
        this("",null);
    }
    public SuccessResponse(String msg){
        this(msg,null);
    }
    public SuccessResponse(T body){
        this("",body);
    }
    public SuccessResponse(String msg, T body){
        super(true,SUCCESS_CODE,msg,"");
        setBody(body);
    }

    public static SuccessResponse newInstance(){
        return new SuccessResponse();
    }
    public static SuccessResponse newInstance(String msg){
        return new SuccessResponse(msg);
    }
    public static <T> SuccessResponse<T> newInstance(T body){
        return new SuccessResponse(body);
    }
}
