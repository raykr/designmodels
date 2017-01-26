package com.swroom.behavior.state;

/**
 * 电灯
 * Created by jingz on 2017/1/26.
 */
public class Light {

    private LightState state;

    public Light(LightState state) {
        this.state = state;
    }

    public LightState getState() {
        return state;
    }

    public void setState(LightState state) {
        this.state = state;
    }

    /**
     * 电灯按压开关的操作交由状态类去处理
     */
    public void pressSwitch() {
        state.pressSwitch(this);
    }
}
