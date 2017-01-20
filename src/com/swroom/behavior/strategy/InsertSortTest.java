package com.swroom.behavior.strategy;

import static org.junit.Assert.*;

/**
 * Created by jingz on 2017/1/20.
 */
public class InsertSortTest {
    @org.junit.Test
    public void sort() throws Exception {
        int[] nums = {7, 3, 1, 8, 4, 5, 9};
        InsertSort is = new InsertSort();
        is.sort(nums);

        int[] x = { 6, 2, 4, 1, 5, 9 };
        QuickSort qs = new QuickSort();
        qs.sort(x);
    }

}