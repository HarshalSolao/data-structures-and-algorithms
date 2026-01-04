package com.harshal.dsa.searching_sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 7, 9};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    //Here, isSwapped is used if array is somehow already sorted in that case it breaks the loop
    //Its just improvement so no further iteration done unnecessary.
    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    isSwapped = true;
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
            if(!isSwapped) break;
        }
    }
}
