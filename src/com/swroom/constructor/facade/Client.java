package com.swroom.constructor.facade;

/**
 * 客户端测试程序
 * Created by jingz on 2017/2/1.
 */
public class Client {
    public static void main(String[] args) {
        // 客户
        Customer customer = new Customer("张三");

        Mortgage mortgage = new Mortgage();
        boolean eligible = mortgage.isEligible(customer, 100);
        System.out.println(eligible);
    }
}
