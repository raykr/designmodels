package com.swroom.behavior.memento;

/**
 * 发起人
 * Created by jingz on 2017/1/25.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.getState());
    }

    /**
     * 返回一个新的包含当前状态的备忘录对象
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 将发起人恢复到备忘录对象所记载的状态
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
