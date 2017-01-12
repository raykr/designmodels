package com.swroom.creator.factory;

/**
 * 调用者类，可理解为使用到工厂方法模型的上下文类
 * Created by jingz on 2017/1/12.
 */
public class Client {
    public static void main(String[] args) {
        /*
         * 调用者只与工厂有依赖关系，不关心汽车相关
         */
        // 1. 实例化工厂类
        IFactory factory = new Factory();
        // 2. 使用工厂类生产汽车
        ICar car = factory.createCar();
        // 3. 调用汽车的方法
        car.show();
    }
}
