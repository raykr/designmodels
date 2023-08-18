package com.swroom.constructor.facade;

/**
 * 客户类
 * Created by jingz on 2017/2/1.
 */
public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
