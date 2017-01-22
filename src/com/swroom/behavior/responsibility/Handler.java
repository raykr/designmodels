package com.swroom.behavior.responsibility;

/**
 * 抽象处理类
 * Created by jingz on 2017/1/22.
 */
public abstract class Handler {

    // 包含一个指向下一个处理类的引用
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 处理请求
     * @param request
     * @return
     */
    public final Response handleRequest(Request request) {
        Response response = null;

        // 判断如果当前类可处理则处理，如果不能处理交由nextHandler处理
        if (this.getHandlerLevel().above(request.getLevel())) {
            response = this.response(request);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleRequest(request);
            } else {
                System.out.println("-----------没有合适的处理器------------");
            }
        }

        return response;
    }

    /**
     * 不同Handler有不同的level，变化的部分交由子类去具体实现
     * @return level
     */
    protected abstract Level getHandlerLevel();

    /**
     * 处理请求返回响应的交由子类去实现
     * @param request
     * @return
     */
    public abstract Response response(Request request);
}
