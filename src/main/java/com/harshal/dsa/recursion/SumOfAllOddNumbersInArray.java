package com.harshal.dsa.recursion;

public class SumOfAllOddNumbersInArray {
    public static void main(String[] args) {
        int[] nums = {0, 3, 5, 6, 4, 1};
        System.out.println(sum(nums, nums.length - 1));
    }

    public static int sum(int[] nums, int n) {
        boolean isOdd = (nums[n] % 2) != 0;
        if (n == 0) return isOdd ? nums[n] : 0;
        return (isOdd ? nums[n] : 0) + sum(nums, n - 1);
    }
}
