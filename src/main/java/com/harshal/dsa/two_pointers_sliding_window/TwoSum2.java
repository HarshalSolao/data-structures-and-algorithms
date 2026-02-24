package com.harshal.dsa.two_pointers_sliding_window;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        System.out.println(Arrays.toString(twoSum(arr, -1)));
    }

    public static int[] twoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return new int[]{i+1, j+1};
            } else if(sum > target){
                j--;
            } else {
                i++;
            }
        }
        return new int[2];
    }
}
