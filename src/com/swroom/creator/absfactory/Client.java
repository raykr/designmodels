package com.swroom.creator.absfactory;

/**
 * 抽象工厂模式演示调用类
 * Created by jingz on 2017/1/13.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        factory.createHatchbackCar().show();
        factory.createThreeBoxCar().show();
    }
}
