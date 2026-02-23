package com.harshal.dsa.binary_search;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        int l =0;
        int r = nums.length -1;
        while (l <= r){
            int m = l + (r-l)/2;
            if(nums[m] == target){
                ans[0] = m;
                r = m - 1;
            } else if(nums[m] < target) {
                l = m + 1;
            } else {
                r = m-1;
            }
        }

        l =0;
        r = nums.length -1;
        while (l <= r){
            int m = l + (r-l)/2;
            if(nums[m] == target){
                ans[1] = m;
                r = m + 1;
            } else if(nums[m] < target) {
                l = m + 1;
            } else {
                r = m-1;
            }
        }

        return ans;
    }

        //Approach 1
    public static int[] searchRange1(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        int l = 0;
        int r = nums.length - 1;
        if(nums.length == 0) return ans;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (nums[l] == target) {
            ans[0] = l;
        }

        l = 0;
        r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l + 1) / 2;
            if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (nums[l] == target) {
            ans[1] = l;
        }
        return ans;
    }
}
