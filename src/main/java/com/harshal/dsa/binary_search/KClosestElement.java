package com.harshal.dsa.binary_search;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-k-closest-elements/description/
public class KClosestElement {
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,3,3,4,7,7,8};
        System.out.println(findClosestElements(arr, 3,5));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - k;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (x - arr[m] > arr[m + k] - x)
                l = m + 1;
            else
                r = m;
        }
        List res = new ArrayList<>();
        for (int i = l; i < l + k; i++)
            res.add(arr[i]);
        return res;
    }
}
