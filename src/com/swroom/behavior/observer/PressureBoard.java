package com.swroom.behavior.observer;

/**
 * 压强显示板
 * Created by jingz on 2017/1/18.
 */
public class PressureBoard implements IObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("最新压强为：" + pressure);
    }
}
