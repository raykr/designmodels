package com.swroom.behavior.interpreter;

import java.util.HashMap;

/**
 * 加法解析器
 * Created by jingz on 2017/1/26.
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 把左右两个表达式运算的结果加起来
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return left.interpreter(var) + right.interpreter(var);
    }
}
