package com.harshal.dsa.arrays;

//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 5, 3, 2};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int requiredCount = (nums.length * (nums.length + 1)) / 2;
        int currentCount = 0;
        for (int num : nums) {
            currentCount += num;
        }
        return requiredCount - currentCount;
    }
}
