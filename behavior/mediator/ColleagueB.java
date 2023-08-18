package com.swroom.behavior.mediator;

/**
 * B同事类
 * Created by jingz on 2017/1/17.
 */
public class ColleagueB extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        // B的值更改，要去影响B
        am.BaffectA();
    }
}
