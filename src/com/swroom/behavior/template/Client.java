package com.swroom.behavior.template;

/**
 * 调用类
 * Created by jingz on 2017/1/16.
 */
public class Client {

    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        beverage.prepareRecipe();

        beverage = new Tea();
        beverage.prepareRecipe();
    }

}
