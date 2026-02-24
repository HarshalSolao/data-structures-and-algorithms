package com.harshal.dsa.two_pointers_sliding_window;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if(map.containsKey(val) && i != map.get(val)){
                ans[0] = i;
                ans[1] = map.get(val);
                break;
            }
        }
        return ans;
    }
}
