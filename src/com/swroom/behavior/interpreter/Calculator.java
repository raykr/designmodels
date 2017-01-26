package com.swroom.behavior.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * 解析器封装类
 * Created by jingz on 2017/1/26.
 */
public class Calculator {

    // 定义的表达式
    private Expression expression;

    /**
     * 构造函数接收输入的表达式，并解析
     */
    public Calculator(String expStr) {
        // 定义一个堆栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();
        // 运算
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':   // 加法
                    left = stack.pop(); // 取堆栈最顶的值为左侧表达式
                    right = new VarExpression(String.valueOf(charArray[++i]));  // 取字符数组下一个值为右侧表达式
                    stack.push(new AddExpression(left, right)); // 左右相加
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right)); // 左右相减
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i]))); // 如果为终结符表达式，则直接压入堆栈
            }
        }
        // 将运算结果弹出
        this.expression = stack.pop();
    }

    /**
     * 开始运算
     * @param var
     */
    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
