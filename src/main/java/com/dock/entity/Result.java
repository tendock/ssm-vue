package com.dock.entity;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 10:44
 * @version:1.0
 */
public class Result {
    private Integer code=0;
    private String msg="success";
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Result() {
    }

    public Result(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
            "code=" + code +
            ", msg='" + msg + '\'' +
            ", data=" + data +
            '}';
    }
}
