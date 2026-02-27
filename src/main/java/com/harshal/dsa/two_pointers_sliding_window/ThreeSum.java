package com.harshal.dsa.two_pointers_sliding_window;

import java.util.*;

//https://leetcode.com/problems/3sum/description/
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                twoSum(nums, i, ans);
            }
        }
        return ans;
    }

    public static void twoSum(int[] arr, int x, List<List<Integer>> ans) {
        int i = x + 1;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j] + arr[x];
            if (sum > 0) {
                --j;
            } else if (sum < 0) {
                ++i;
            } else {
                ans.add(Arrays.asList(arr[i], arr[j], arr[x]));
                ++i;
                --j;
                while (i < j && arr[i] == arr[i - 1]) ++i;
            }
        }
    }

}
