package com.swroom.behavior.memento;

/**
 * 备忘录角色类
 * Created by jingz on 2017/1/25.
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
