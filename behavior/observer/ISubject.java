package com.swroom.behavior.observer;

/**
 * 被观察者
 * Created by jingz on 2017/1/18.
 */
public interface ISubject {

    /**
     * 注册观察者
     * @param o observer
     */
    void registerObserver(IObserver o);

    /**
     * 移除观察者
     * @param o observer
     */
    void removeObserver(IObserver o);

    /**
     * 向观察者发布通知
     */
    void notifyObserver();

}
