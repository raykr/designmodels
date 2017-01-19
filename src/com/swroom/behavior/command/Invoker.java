package com.swroom.behavior.command;

/**
 * 抽象调用者
 * Created by jingz on 2017/1/19.
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.excute();
    }
}
