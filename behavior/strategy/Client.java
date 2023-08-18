package com.swroom.behavior.strategy;

/**
 * Created by jingz on 2017/1/20.
 */
public class Client {
    public static void main(String[] args) {
        int[] x = { 6, 2, 4, 1, 5, 9 };

        Context context = new Context(new QuickSort());
        context.sort(x);
        System.out.println("---------------------");
        context = new Context(new InsertSort());
        context.sort(x);
    }

}
