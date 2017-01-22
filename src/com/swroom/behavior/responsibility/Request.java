package com.swroom.behavior.responsibility;

/**
 * 请求类
 * Created by jingz on 2017/1/22.
 */
public class Request {

    private Level level;

    public Request(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }
}
