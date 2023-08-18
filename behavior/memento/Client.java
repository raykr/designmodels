package com.swroom.behavior.memento;

/**
 * 客户端角色类
 * Created by jingz on 2017/1/25.
 */
public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        // 改变发起人对象的状态
        o.setState("On");
        // 创建备忘录对象，并将发起人对象的状态储存起来
        c.saveMemento(o.createMemento());
        // 修改发起人状态
        o.setState("Off");
        // 恢复发起人对象的状态
        o.restoreMemento(c.retrieveMemento());

        System.out.println(o.getState());
    }
}
