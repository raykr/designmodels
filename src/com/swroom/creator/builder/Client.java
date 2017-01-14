package com.swroom.creator.builder;

/**
 * 调用测试类
 * Created by jingz on 2017/1/14.
 */
public class Client {

    public static void main(String[] args) {
        // 调用者只需通过导演类便可获取具体产品对象，进而可以调用产品的方法
        Director director = new Director();

        Product bmwProduct = director.getBMWProduct();
        bmwProduct.showProduct();

        Product audiProduct = director.getAudiProduct();
        audiProduct.showProduct();
    }
}
