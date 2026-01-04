package com.harshal.dsa.searching_sorting;

public class LinearSearch {
    public static void main(String[] args) {
        int target = 4;
        int[] nums = {1, 4, 3, 6, 7, 8, 5, 0};
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) return i;
        }
        return -1;
    }

}
