package com.swroom.behavior.strategy;

/**
 * 排序策略接口
 * Created by jingz on 2017/1/20.
 */
public interface SortStrategy {

    /**
     * 针对数字数组进行排序
     * @param nums 数字数组
     */
    void sort(int[] nums);
}
