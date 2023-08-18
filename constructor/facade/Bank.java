package com.swroom.constructor.facade;

/**
 * 银行子系统
 * Created by jingz on 2017/2/1.
 */
public class Bank {

    public boolean hasSufficentSavings(Customer c, int amount) {
        System.out.println("检查银行系统for："+c.getName());
        return true;
    }
}
