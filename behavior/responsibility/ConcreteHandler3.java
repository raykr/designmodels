package com.swroom.behavior.responsibility;

/**
 * 处理类3
 * Created by jingz on 2017/1/22.
 */
public class ConcreteHandler3 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return new Level(5);
    }

    @Override
    public Response response(Request request) {
        System.out.println("-----请求由处理器3进行处理-----");
        return null;
    }
}
