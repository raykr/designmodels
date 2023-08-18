package com.swroom.behavior.mediator;

/**
 * 抽象中介者类
 * Created by jingz on 2017/1/17.
 */
public abstract class AbstractMediator {

    // 在此中介者类里声明所有要调停的类对象
    protected AbstractColleague A;
    protected AbstractColleague B;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }

    public abstract void AaffectB();

    public abstract void BaffectA();
}
