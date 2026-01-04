package com.harshal.dsa.searching_sorting;

import java.util.Arrays;

//https://leetcode.com/problems/sort-an-array/description/
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int m = left.length;
        int n = right.length;
        int[] result = new int[m + n];
        int l = 0;
        int r = 0;
        for (int i = 0; i < result.length; i++) {
            if (r >= n || (l < m && left[l] < right[r])) {
                result[i] = left[l++];
            } else {
                result[i] = right[r++];
            }
        }
        return result;
    }
}
