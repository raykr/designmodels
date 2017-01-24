package com.swroom.behavior.visitor;

/**
 * 元素类2
 * Created by jingz on 2017/1/24.
 */
public class ConcreteElement2 extends Element {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doBusiness() {
        System.out.println("这是元素2");
    }
}
