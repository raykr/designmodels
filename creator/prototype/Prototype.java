package com.swroom.creator.prototype;

/**
 * 原型类
 * Created by jingz on 2017/1/15.
 */
public class Prototype implements Cloneable {

    public Prototype clone() {
        Prototype prototype = null;

        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }


}
