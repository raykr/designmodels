package com.swroom.creator.builder;

/**
 * 抽象建造者
 * Created by jingz on 2017/1/14.
 */
public abstract class Builder {

    /**
     * 用来建造产品的方法
     * @param arg1
     * @param arg2
     */
    public abstract void setPart(String arg1, String arg2);

    /**
     * 返回建造好的产品的方法
     * @return
     */
    public abstract Product getProduct();
}
