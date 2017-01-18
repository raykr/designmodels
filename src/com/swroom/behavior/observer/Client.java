package com.swroom.behavior.observer;

/**
 * Created by jingz on 2017/1/18.
 */
public class Client {
    public static void main(String[] args) {
        // 被观察者
        WeatherData wd = new WeatherData();

        // 注册观察者
        wd.registerObserver(new TemperatureBoard());
        wd.registerObserver(new HumidityBoard());
        wd.registerObserver(new PressureBoard());

        // 更新被观察者数据
        wd.setMeasurements(80, 65, 30.5f);
        wd.setMeasurements(30, 25, 22.5f);
    }
}
