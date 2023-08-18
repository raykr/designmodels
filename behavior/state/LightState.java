package com.swroom.behavior.state;

/**
 * 电灯状态接口
 * Created by jingz on 2017/1/26.
 */
public interface LightState {

    /**
     * 按压电灯开关的方法
     * @param light
     */
    void pressSwitch(Light light);
}
