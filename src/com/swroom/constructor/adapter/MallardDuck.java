package com.swroom.constructor.adapter;

/**
 * 鸭子实现类
 * Created by jingz on 2017/2/1.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard 呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("Mallard 飞啦");
    }
}
