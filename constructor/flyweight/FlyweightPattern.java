package com.swroom.constructor.flyweight;

/**
 * Created by jingz on 2017/2/1.
 */
public class FlyweightPattern {

    FlyweightFactory factory = new FlyweightFactory();
    Flyweight fly1;
    Flyweight fly2;
    Flyweight fly3;
    Flyweight fly4;
    Flyweight fly5;
    Flyweight fly6;

    public FlyweightPattern() {
        this.fly1 = factory.getFlyWeight("Google");
        this.fly2 = factory.getFlyWeight("Qutr");
        this.fly3 = factory.getFlyWeight("Google");
        this.fly4 = factory.getFlyWeight("Google");
        this.fly5 = factory.getFlyWeight("Google");
        this.fly6 = factory.getFlyWeight("Google");
    }

    public void showFlyweight() {
        fly1.operation();
        fly2.operation();
        fly3.operation();
        fly4.operation();
        fly5.operation();
        fly6.operation();

        int objSize = factory.getFlyweightSize();
        System.out.println("objSize="+objSize);
    }

    public static void main(String[] args) {
        FlyweightPattern fp = new FlyweightPattern();
        fp.showFlyweight();
    }
}
