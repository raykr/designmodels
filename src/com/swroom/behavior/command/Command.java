package com.swroom.behavior.command;

/**
 * 抽象命令类
 * Created by jingz on 2017/1/19.
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令
     */
    public abstract void excute();

}
