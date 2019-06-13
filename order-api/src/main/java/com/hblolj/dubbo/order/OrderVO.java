package com.hblolj.dubbo.order;

import java.io.Serializable;

/**
 * @auther Ori
 * @Date 2019/6/13 21 36
 * @Description
 */
public class OrderVO implements Serializable {

    private static final long serialVersionUID = 2469177165635555646L;

    private Object data;

    private String code;

    private String name;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
