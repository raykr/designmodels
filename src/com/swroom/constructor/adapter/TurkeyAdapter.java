package com.swroom.constructor.adapter;

/**
 * 火鸡适配器类
 * Created by jingz on 2017/2/1.
 */
public class TurkeyAdapter implements Turkey {

    private Duck duck;

    public TurkeyAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
