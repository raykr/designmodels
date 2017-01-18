package com.swroom.behavior.observer.java;

import java.util.Observable;

/**
 * 被观察者，继承java.util.Observable
 * Created by jingz on 2017/1/18.
 */
public class WeatherData extends Observable {

    private float temperature;      // 温度
    private float humidity;         // 湿度
    private float pressure;         // 压强

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    /**
     * 气象站输入数据入口
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        // 数据更新
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // 数据更新后的操作
        measurementsChanged();
    }

    private void measurementsChanged() {
        // !!!必须要有此方法，才会更改状态量，进行通知
        setChanged();

        // 通知观察者，空参的方法即代表将被观察者本身传递过去
//        notifyObservers();

        AnyObject obj = new AnyObject();
        obj.setName("Pudding");

        // 带参数的方法，除被观察者本身外还将传递一个任意Object对象
        notifyObservers(obj);
    }

}
