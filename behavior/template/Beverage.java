package com.swroom.behavior.template;

/**
 * 饮料抽象类
 * Created by jingz on 2017/1/16.
 */
public abstract class Beverage {

    /**
     * final限制子类不能覆盖
     */
    final void prepareRecipe() {
        // 1. 把水煮沸
        boilWater();
        // 2. 沸水冲泡该饮料
        brew();
        // 3. 将饮料倒入杯子
        pourInCup();
        // 4. 加调料,如果不需要加调料，则在子类中自己控制
        if (needCondiemts()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("水已经烧开！");
    }

    private void pourInCup() {
        System.out.println("将泡好的饮料倒入杯子！");
    }

    /**
     * 钩子（Hook）方法
     * 可以让子类控制流程的切入点
     * @return
     */
    protected boolean needCondiemts() {
        return true;
    }

}
