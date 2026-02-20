package com.harshal.dsa.binary_search;

//https://leetcode.com/problems/find-peak-element/description/
public class FindPeekElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1};
        System.out.println(findPeakElement(arr));
    }

    public static int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r){
            int mid = l + (r-l)/2;
            if(nums[mid] < nums[mid+1]){
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
