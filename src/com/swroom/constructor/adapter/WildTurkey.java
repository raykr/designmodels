package com.swroom.constructor.adapter;

/**
 * 火鸡实现类
 * Created by jingz on 2017/2/1.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("WildTurkey 咕咕叫");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey 飞啦");
    }
}
