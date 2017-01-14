package com.swroom.creator.builder;

/**
 * 导演类
 * Created by jingz on 2017/1/14.
 */
public class Director {

    // 导演类与建造者类依赖，不与具体产品类依赖
    private Builder builder = new ConcreteBuilder();

    public Product getBMWProduct() {
        builder.setPart("宝马汽车", "M3");
        return builder.getProduct();
    }

    public Product getAudiProduct() {
        builder.setPart("奥迪汽车", "TT");
        return builder.getProduct();
    }
}
