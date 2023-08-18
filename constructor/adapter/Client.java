package com.swroom.constructor.adapter;

/**
 * Created by jingz on 2017/2/1.
 */
public class Client {
    public static void main(String[] args) {
        TurkeyAdapter ta = new TurkeyAdapter(new MallardDuck());
        ta.gobble();
        ta.fly();
    }
}
