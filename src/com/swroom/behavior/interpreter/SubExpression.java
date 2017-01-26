package com.swroom.behavior.interpreter;

import java.util.HashMap;

/**
 * 减法解析器
 * Created by jingz on 2017/1/26.
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 左右两个表达式结果相减
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return left.interpreter(var) - right.interpreter(var);
    }
}
