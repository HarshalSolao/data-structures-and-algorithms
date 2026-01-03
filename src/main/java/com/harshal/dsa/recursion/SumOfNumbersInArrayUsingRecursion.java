package com.harshal.dsa.recursion;

public class SumOfNumbersInArrayUsingRecursion {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 4, 1, 1};
        System.out.println(sum(nums, nums.length - 1));
    }
    public static int sum(int[] nums, int n){
        if(n == 0) return nums[n];
        return nums[n] + sum(nums, n-1);
    }
}
