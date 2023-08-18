package com.swroom.behavior.command;

/**
 * Created by jingz on 2017/1/19.
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void excute() {
        this.receiver.doSomething();
    }
}
