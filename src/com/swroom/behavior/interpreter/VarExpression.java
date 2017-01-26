package com.swroom.behavior.interpreter;

import java.util.HashMap;

/**
 * 变量解析器
 * Created by jingz on 2017/1/26.
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * 从map中取
     * @param var
     * @return
     */
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
