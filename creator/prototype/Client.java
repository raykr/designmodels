package com.swroom.creator.prototype;

/**
 * 原型调用测试类
 * Created by jingz on 2017/1/15.
 */
public class Client {
    public static void main(String[] args) {
        ConceretePrototype cp = new ConceretePrototype();
        for (int i = 0; i < 10; i++) {
            ConceretePrototype clonecp = (ConceretePrototype) cp.clone();
            clonecp.show();
        }
    }
}
