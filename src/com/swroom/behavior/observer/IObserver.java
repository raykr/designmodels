package com.swroom.behavior.observer;

/**
 * 观察者接口
 * Created by jingz on 2017/1/18.
 */
public interface IObserver {

    /**
     * 接收被观察的通知进行处理
     */
    void update(float temperature, float humidity, float pressure);
}
