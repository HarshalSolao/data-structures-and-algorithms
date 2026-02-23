package com.harshal.dsa.binary_search;

//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class SingleElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        if(arr.length == 1) return arr[0];
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m > 0 && arr[m] == arr[m - 1]) {
                int leftCount = (m - 1) - l;
                if (leftCount % 2 == 1) {
                    r = m - 2;
                } else {
                    l = m + 1;
                }
            } else if (m< r && arr[m] == arr[m+1]) {
                int rightCount = r - (m-1);
                if(rightCount % 2 == 1){
                    l = m + 2;
                } else {
                    r = m -1;
                }

            } else {
                return arr[m];
            }
        }
        return arr[l];
    }
}
