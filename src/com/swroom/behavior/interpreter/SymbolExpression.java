package com.swroom.behavior.interpreter;

/**
 * 抽象运算符解析器
 * Created by jingz on 2017/1/26.
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;  // 左侧表达式
    protected Expression right; // 右侧表达式

    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     * @param left
     * @param right
     */
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
