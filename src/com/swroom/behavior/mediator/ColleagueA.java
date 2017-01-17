package com.swroom.behavior.mediator;

/**
 * A同事类
 * Created by jingz on 2017/1/17.
 */
public class ColleagueA extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractMediator am) {
        // 修改自身对象的值
        this.number = number;

        // 影响B对象的值，不是直接影响，是通过中介者间接影响
        am.AaffectB();
    }
}
