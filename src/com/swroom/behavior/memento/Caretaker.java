package com.swroom.behavior.memento;

/**
 * 负责人角色类
 * Created by jingz on 2017/1/25.
 */
public class Caretaker {

    private Memento memento;

    /**
     * 备忘录取值方法
     * @return
     */
    public Memento retrieveMemento() {
        return memento;
    }

    /**
     * 备忘录赋值方法
     * @param memento
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
