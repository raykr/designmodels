package com.swroom.behavior.strategy;

/**
 * 插入排序算法
 * Created by jingz on 2017/1/20.
 */
public class InsertSort implements SortStrategy {

    @Override
    public void sort(int[] nums) {
        // 两层for嵌套，时间复杂度O(n^2)
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; (j > 0) && (nums[j] < nums[j - 1]); j--) {
                SortUtil.swap(nums, j, j - 1);
            }
        }

        for (int n : nums){
            System.out.print(n+",");
        }
    }

}
