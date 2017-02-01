package com.swroom.constructor.flyweight;

/**
 * 具体享元类
 * Created by jingz on 2017/2/1.
 */
public class ConcreteFlyweight extends Flyweight {

    private String str;

    public ConcreteFlyweight(String str) {
        this.str = str;
    }

    @Override
    public void operation() {
        System.out.println("Concrete---Flyweight : " + str);
    }
}
