package com.swroom.constructor.bridge;

/**
 * 调用类
 * Created by jingz on 2017/2/1.
 */
public class Client {

    public static void main(String[] args) {
        // 路
        Road road = new Highway();
        // 车
        Car car = new SUV();
        // 人
        Person person = new PersonWoman();
        // 执行动作
        Bridge bridge = new Bridge(road, car, person);
        bridge.doRun();

        road = new StreetRoad();
        car = new Bus();
        person = new PersonMan();
        bridge = new Bridge(road, car, person);
        bridge.doRun();
    }
}
