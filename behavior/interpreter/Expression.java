package com.swroom.behavior.interpreter;

import java.util.HashMap;

/**
 * 抽象表达式类
 * Created by jingz on 2017/1/26.
 */
public abstract class Expression {
    /**
     * 解析公式和数值,其中var中的key值是是公式中的参数，value值是具体的数字
     * @param var
     * @return
     */
    public abstract int interpreter(HashMap<String, Integer> var);
}
