package com.swroom.behavior.visitor;

/**
 * 抽象元素类
 * Created by jingz on 2017/1/24.
 */
public abstract class Element {

    /**
     * 接受访问者访问
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);

    /**
     * 元素类业务方法
     */
    public abstract void doBusiness();
}
