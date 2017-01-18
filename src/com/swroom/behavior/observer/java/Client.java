package com.swroom.behavior.observer.java;

/**
 * Created by jingz on 2017/1/18.
 */
public class Client {
    public static void main(String[] args) {
        // 实例化被观察者和观察者
        WeatherData wd = new WeatherData();
        TemperatureBoard tb = new TemperatureBoard();
        // 注册观察者
        wd.addObserver(tb);
        // 更新被观察者数据
        wd.setMeasurements(88, 22, 33.5f);
    }
}
