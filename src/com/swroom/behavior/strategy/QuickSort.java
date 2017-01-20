package com.swroom.behavior.strategy;

/**
 * Created by jingz on 2017/1/20.
 */
public class QuickSort implements SortStrategy {
    @Override
    public void sort(int[] nums) {
        quick_sort(nums, 0, nums.length - 1);
        for (int n : nums) {
            System.out.print(n + ",");
        }
    }

    private int partition(int[] unsorted, int low, int high) {
        int pivot = unsorted[low];
        while (low < high) {
            while (low < high && unsorted[high] > pivot) high--;
            unsorted[low] = unsorted[high];
            while (low < high && unsorted[low] <= pivot) low++;
            unsorted[high] = unsorted[low];
        }
        unsorted[low] = pivot;
        return low;
    }

    private void quick_sort(int[] unsorted, int low, int high) {
        int loc = 0;
        if (low < high) {
            loc = partition(unsorted, low, high);
            quick_sort(unsorted, low, loc - 1);
            quick_sort(unsorted, loc + 1, high);
        }
    }
}
