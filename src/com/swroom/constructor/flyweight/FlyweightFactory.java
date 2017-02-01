package com.swroom.constructor.flyweight;

import java.util.Hashtable;

/**
 * 享元工厂类
 * Created by jingz on 2017/2/1.
 */
public class FlyweightFactory {

    private Hashtable flyweights = new Hashtable();

    public Flyweight getFlyWeight(Object obj) {
        Flyweight fw = (Flyweight) flyweights.get(obj);
        if (fw == null) {
            // 产生新的享元类
            fw = new ConcreteFlyweight((String) obj);
            flyweights.put(obj, fw);
        }
        return fw;
    }

    public int getFlyweightSize() {
        return flyweights.size();
    }

}
