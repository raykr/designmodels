package com.swroom.constructor.facade;

/**
 * 信用子系统
 * Created by jingz on 2017/2/1.
 */
public class Credit {

    public boolean hasGoodCredit(Customer c) {
        System.out.println("检查信用系统for：" + c.getName());
        return true;
    }
}
