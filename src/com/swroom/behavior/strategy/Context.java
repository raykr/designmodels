package com.swroom.behavior.strategy;

/**
 * 排序上下文类
 * 二次封装策略，避免客户类直接访问到策略
 * Created by jingz on 2017/1/20.
 */
public class Context {

    /**
     * has-a，聚合关系，上下文类拥有一个策略
     */
    private SortStrategy sortStrategy;

    /**
     * 构造函数初始化具体策略
     * @param sortStrategy 策略
     */
    public Context(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    /**
     * 上下文类中的具体方法，调用策略方法实现
     * @param nums
     */
    public void sort(int[] nums) {
        this.sortStrategy.sort(nums);
    }
}
