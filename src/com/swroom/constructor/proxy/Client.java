package com.swroom.constructor.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 客户端类
 * Created by jingz on 2017/1/31.
 */
public class Client {

    public static void main(String[] args) {
        // 定义一个玩家
        final IGamePlayer player = new GamePlayer("张三");

        /*
        写成单独的GamePlayIH类的写法
         */
//        // 定义一个Handler
//        InvocationHandler handler = new GamePlayIH(player);
//
//        // 获得类class loader
//        ClassLoader cl = player.getClass().getClassLoader();
//        // 动态产生一个代理者
//        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, player.getClass().getInterfaces(), handler);

        /*
        直接写成代码块的写法，动态代理的核心
         */
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(
                player.getClass().getClassLoader(),
                player.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 可以在代理的所有method上添加诸如前置通知、后置通知等，这就是AOP面向切面编程
                        // Spring的AOP的本质就是动态代理
                        Object result = method.invoke(player, args);
                        return result;
                    }
                });


        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2017-1-31 10:45");
        // 使用代理执行方法
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2017-2-12 03:40");


    }
}
