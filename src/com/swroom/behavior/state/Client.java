package com.swroom.behavior.state;

/**
 * 客户端类
 * Created by jingz on 2017/1/26.
 */
public class Client {

    public static void main(String[] args) {
        // 创建初始关闭的电灯
        Light light = new Light(new LightOff());

        // 第一下按下开关，打开电灯
        light.pressSwitch();

        // 第二下按下开关，关闭电灯
        light.pressSwitch();
    }
}
