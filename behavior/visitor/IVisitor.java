package com.swroom.behavior.visitor;

/**
 * 访问者接口
 * Created by jingz on 2017/1/24.
 */
public interface IVisitor {

    /**
     * 定义可被访问的对象
     * @param el
     */
    void visit(Element el);
}
