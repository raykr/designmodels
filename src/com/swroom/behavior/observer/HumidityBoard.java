package com.swroom.behavior.observer;

/**
 * 湿度显示板
 * Created by jingz on 2017/1/18.
 */
public class HumidityBoard implements IObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("最新湿度为：" + humidity);
    }
}
