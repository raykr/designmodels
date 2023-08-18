package com.swroom.behavior.visitor;

/**
 * 访问者实现类
 * Created by jingz on 2017/1/24.
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(Element el) {
        el.doBusiness();
    }
}
