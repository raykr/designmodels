package com.swroom.behavior.template;

/**
 * 咖啡类
 * Created by jingz on 2017/1/16.
 */
public class Coffee extends Beverage {
    /**
     * 需要在子类里实现冲泡的饮料行为
     */
    @Override
    protected void brew() {
        System.out.println("泡上了一大杯咖啡！");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入两颗方糖！");
    }
}
