package com.swroom.behavior.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者，实现java.util.Observer接口
 * Created by jingz on 2017/1/18.
 */
public class TemperatureBoard implements Observer {

    private WeatherData w;
    private AnyObject obj;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            w = (WeatherData) o;
            System.out.println("当前温度：" + w.getTemperature() + ";当前湿度：" + w.getHumidity() + ";当前压强：" + w.getPressure());
        }

        // 在update方法里可以处理传递过来的Object对象
        if (arg instanceof AnyObject) {
            obj = (AnyObject) arg;
            System.out.println("Name="+obj.getName());
        }
    }
}
