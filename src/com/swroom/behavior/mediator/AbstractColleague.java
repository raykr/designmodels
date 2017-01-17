package com.swroom.behavior.mediator;

/**
 * 抽象同事类
 * Created by jingz on 2017/1/17.
 */
public abstract class AbstractColleague {

    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * 抽象方法，修改数字的时候修改关联中介者
     * @param number
     * @param am
     */
    public abstract void setNumber(int number, AbstractMediator am);
}
