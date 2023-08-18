package com.swroom.behavior.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 客户模拟类
 * Created by jingz on 2017/1/26.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 接收表达式输入
        String expStr = getExpStr();
        // 赋值
        HashMap<String, Integer> var = getValue(expStr);
        // 计算
        Calculator cal = new Calculator(expStr);
        int rst = cal.run(var);
        System.out.println("运算结果为：" + rst);
    }

    /**
     * 获取表达式
     *
     * @return
     * @throws IOException
     */
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    /**
     * 获取输入值
     *
     * @param expStr
     * @return
     */
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {

        HashMap<String, Integer> map = new HashMap<>();

        // 解析参数个数，输入相应的值
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                // 解决重复参数问题
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.println("请输入" + ch + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }

        return map;
    }
}
