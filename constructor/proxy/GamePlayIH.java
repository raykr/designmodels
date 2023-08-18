package com.swroom.constructor.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * 实现了InvocationHandler动态代理接口
 * Created by jingz on 2017/1/31.
 */
public class GamePlayIH implements InvocationHandler {

    // 被代理者
    Class cls = null;

    // 被代理的实例
    Object obj = null;

    // 要代理谁，通过构造函数传入
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    // 调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
