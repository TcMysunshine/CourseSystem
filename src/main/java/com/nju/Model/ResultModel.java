package com.nju.Model;

import lombok.Data;
@Data
public class ResultModel {
    public final static String SUCCESS="success";
    public final static String FAIL="fail";
    public final static String ERROR="error";
    private Integer code;
    private String message;
    private Integer count;
    private Object data;
    public ResultModel(Integer code,String message,Object data){
        this.code=code;
        this.message=message;
        this.data=data;
    }
}
