package com.swroom.behavior.responsibility;

/**
 * 处理类2
 * Created by jingz on 2017/1/22.
 */
public class ConcreteHandler2 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return new Level(3);
    }

    @Override
    public Response response(Request request) {
        System.out.println("-----请求由处理器2进行处理-----");
        return null;
    }
}
