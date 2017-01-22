package com.swroom.behavior.responsibility;

/**
 * 调用类
 * Created by jingz on 2017/1/22.
 */
public class Client {
    public static void main(String[] args) {
        // 创建责任链上各处理类
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        // 将处理类串联成责任链
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        // 处理请求
        Response response = handler1.handleRequest(new Request(new Level(4)));
    }
}
