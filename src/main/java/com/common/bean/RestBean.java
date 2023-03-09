package com.common.bean;

import lombok.*;

import java.util.List;
import java.util.Map;

public class RestBean {
    private List<Map<String,Object>> list;//对应查询数据
    private int totalCount;//对应查询总条目数量
    private String msg;//前端显示信息
    private String status;//前端状态字符串

    public RestBean(List<Map<String, Object>> list, int totalCount, String msg, String status) {
        this.list = list;
        this.totalCount = totalCount;
        this.msg = msg;
        this.status = status;
    }

    public RestBean() {
    }

    public List<Map<String, Object>> getList() {
        return list;
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RestBean{" +
                "list=" + list +
                ", totalCount=" + totalCount +
                ", msg='" + msg + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
