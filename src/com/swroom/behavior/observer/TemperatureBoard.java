package com.swroom.behavior.observer;

/**
 * 温度显示板
 * Created by jingz on 2017/1/18.
 */
public class TemperatureBoard implements IObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("最新温度为："+temperature);
    }
}
