package com.swroom.constructor.facade;

/**
 * 贷款子系统
 * Created by jingz on 2017/2/1.
 */
public class Loan {

    public boolean hasNoBadLoans(Customer c) {
        System.out.println("检查贷款子系统，没有不良贷款"+c.getName());
        return true;
    }
}
