package com.harshal.dsa.binary_search;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class MinimumInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {5, 0, 1, 2, 3, 4};
        System.out.println(findMin(arr));
    }


    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if(nums[l] <= nums[r]) return nums[l];
            int m = l + (r - l) / 2;
            if (m > 0 && nums[m] < nums[m - 1]) return nums[m];
            if (nums[l] > nums[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    //My Approach working but riski
    public static int findMin1(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        if (nums[l] < nums[r] || nums.length == 1) return nums[l];
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > nums[m + 1]) return nums[m + 1];
            if (nums[m] > nums[r]) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return nums[l];
    }
}
