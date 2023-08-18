package com.swroom.behavior.mediator;

/**
 * 中介者实现类，具体实现调停各对象的逻辑
 * Created by jingz on 2017/1/17.
 */
public class Mediator extends AbstractMediator {

    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }

    @Override
    public void AaffectB() {
        this.B.setNumber(this.A.getNumber() * 100);
    }

    @Override
    public void BaffectA() {
        this.A.setNumber(this.B.getNumber() / 100);
    }
}
