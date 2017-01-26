package com.swroom.behavior.state;

/**
 * 开启状态具体类
 * Created by jingz on 2017/1/26.
 */
public class LightOn implements LightState {

    /**
     * 开启状态时操作开关是关闭电灯
     * @param light
     */
    @Override
    public void pressSwitch(Light light) {
        System.out.println("Turn Off the Light.");
        light.setState(new LightOff());
    }
}
