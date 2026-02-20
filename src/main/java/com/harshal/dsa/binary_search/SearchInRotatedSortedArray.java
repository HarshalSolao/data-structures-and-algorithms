package com.harshal.dsa.binary_search;

import java.util.Arrays;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1};
        System.out.println(search(arr, 1));
    }

    public static int search(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] >= arr[l]) { //Left Sorted
                if (target < arr[mid] && target >= arr[l]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }

        return -1;
    }
}
