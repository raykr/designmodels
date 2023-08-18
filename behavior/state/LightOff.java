package com.swroom.behavior.state;

/**
 * 关闭状态具体实现
 * Created by jingz on 2017/1/26.
 */
public class LightOff implements LightState {

    /**
     * 关闭状态按压开关是开启电灯
     * @param light
     */
    @Override
    public void pressSwitch(Light light) {
        System.out.println("Turn On the Light.");
        light.setState(new LightOn());
    }
}
