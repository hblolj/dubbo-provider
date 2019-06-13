package com.hblolj.dubbo.order;

import java.io.Serializable;

/**
 * @auther Ori
 * @Date 2019/6/13 21 36
 * @Description
 */
public class OrderDTO implements Serializable {

    private static final long serialVersionUID = -5747928164157270399L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "name='" + name + '\'' +
                '}';
    }
}
