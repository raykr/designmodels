package com.swroom.creator.builder;

/**
 * 具体建造者类
 * Created by jingz on 2017/1/14.
 */
public class ConcreteBuilder extends Builder {

    // 实例化空产品对象
    private Product product = new Product();

    /**
     * 入口：设置产品属性
     *
     * @param arg1 name
     * @param arg2 type
     */
    @Override
    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }

    /**
     * 返回：创建好的产品
     *
     * @return product
     */
    @Override
    public Product getProduct() {
        return product;
    }
}
