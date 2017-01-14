package com.swroom.creator.builder;

/**
 * 产品类，可能是一个有着复杂逻辑的对象
 * Created by jingz on 2017/1/14.
 */
public class Product {

    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showProduct() {
        System.out.println("名称：" + name);
        System.out.println("类型：" + type);
    }
}
