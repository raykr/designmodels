package com.swroom.constructor.proxy;

/**
 * 游戏者接口
 * Created by jingz on 2017/1/31.
 */
public interface IGamePlayer {

    /**
     * 登录游戏
     */
    void login(String user, String password);


    /**
     * 杀怪
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();
}
