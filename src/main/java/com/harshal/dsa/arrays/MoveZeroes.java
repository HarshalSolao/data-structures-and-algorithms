package com.harshal.dsa.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[x] = nums[i];
                x++;
            }
        }
        while (x < nums.length) {
            nums[x] = 0;
            x++;
        }
    }
}
