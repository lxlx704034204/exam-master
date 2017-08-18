package com.lsc.exam.base;

/**
 * Created by Administrator on 2017/5/2.
 */
public enum  ResultEnum {
    //调用成功
    SUCCESS(1, "success"),
    //查询结果不存在
    NOTEXIST(2, "result not existed"),
    //查询结果已存在
    EXIST(3,"result existed"),
    //插入时发生错误
    FAILED_INSERT(4,"insert error"),
    //更新时发生错误
    FAILED_UPDATE(5,"update error");

    private int i;
    private String code;

    ResultEnum(int i,String code){
        this.i = i;
        this.code = code;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
