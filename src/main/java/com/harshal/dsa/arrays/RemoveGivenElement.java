package com.harshal.dsa.arrays;

//https://leetcode.com/problems/remove-element/description/
public class RemoveGivenElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeGivenElement(nums, val));
    }

    public static int removeGivenElement(int[] nums, int val) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[x] = nums[i];
                x = x + 1;
            }
        }
        return x;
    }
}
