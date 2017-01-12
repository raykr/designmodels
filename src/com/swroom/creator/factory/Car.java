package com.swroom.creator.factory;

import com.swroom.creator.factory.model.Engine;
import com.swroom.creator.factory.model.Underpan;
import com.swroom.creator.factory.model.Wheel;

/**
 * 汽车实现类
 * Created by jingz on 2017/1/12.
 */
public class Car implements ICar {

    private Engine engine;  // 发动机
    private Underpan underpan;  // 底盘
    private Wheel wheel; // 轮胎

    public Car() {
    }

    /**
     * 构造函数初始化汽车零部件
     * @param engine
     * @param underpan
     * @param wheel
     */
    public Car(Engine engine, Underpan underpan, Wheel wheel) {
        this.engine = engine;
        this.underpan = underpan;
        this.wheel = wheel;
    }

    @Override
    public void show() {
        engine.getStyle();
        underpan.getStyle();
        for (int i = 0; i < 4; i++) {
            wheel.getStyle();
        }
    }
}
