package com.swroom.constructor.bridge;

/**
 * 桥接类
 * Created by jingz on 2017/2/1.
 */
public class Bridge {

    private Road road;
    private Car car;
    private Person person;

    public Bridge(Road road, Car car, Person person) {
        this.road = road;
        this.car = car;
        this.person = person;
    }

    /**
     * 负责把多维度的元素组合起来
     */
    public void doRun() {

        String p = person.driver();
        String c = car.run();
        String r = road.show();

        System.out.println(p + "在" + r + "上开着" + c);

    }

}
