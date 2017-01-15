package com.swroom.creator.prototype;

/**
 * 原型模式实现类
 * Created by jingz on 2017/1/15.
 */
public class ConceretePrototype extends Prototype {

    public void show() {
        System.out.println("这是一个原型模式实现类");
        System.out.println(this);
    }
}
