package com.base.bean;

public class ResultVO {
    private Integer status;
    private String msg;
    private Object obj;

    private ResultVO() {
    }

    public static ResultVO build() {
        return new ResultVO();
    }

    public static ResultVO success(String msg, Object obj) {
        return new ResultVO(200, msg, obj);
    }

    public static ResultVO success(String msg) {
        return new ResultVO(200, msg, null);
    }

    public static ResultVO error(String msg, Object obj) {
        return new ResultVO(500, msg, obj);
    }

    public static ResultVO error(String msg) {
        return new ResultVO(500, msg, null);
    }

    private ResultVO(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    public Integer getStatus() {

        return status;
    }

    public ResultVO setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultVO setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public ResultVO setObj(Object obj) {
        this.obj = obj;
        return this;
    }
}
