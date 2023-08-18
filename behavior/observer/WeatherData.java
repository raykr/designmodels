package com.swroom.behavior.observer;

import java.util.Vector;

/**
 * 气象数据，作为被观察者
 * Created by jingz on 2017/1/18.
 */
public class WeatherData implements ISubject {

    private Vector<IObserver> obs;  // 观察者们
    private float temperature;      // 温度
    private float humidity;         // 湿度
    private float pressure;         // 压强

    public WeatherData() {
        obs = new Vector<IObserver>();
    }

    @Override
    public void registerObserver(IObserver o) {
        this.obs.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        this.obs.remove(o);
    }

    /**
     * 将最新气象数据通知给所有观察者
     */
    @Override
    public void notifyObserver() {
        for (IObserver o : obs) {
            o.update(temperature, humidity, pressure);
        }
    }

    /**
     * 气象站输入数据入口
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // 通知观察者
        this.notifyObserver();
    }
}
