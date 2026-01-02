package com.harshal.dsa.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

//https://leetcode.com/problems/single-number/description/
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 4, 2, 3, 2};
        System.out.println(singleNumber_1(nums));
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber_1(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    public static int singleNumber(int[] nums) {
        AtomicInteger keys = new AtomicInteger();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        map.forEach((key, value) -> {
            if (value == 1) {
                keys.set(key);
            }
        });
        return keys.get();
    }
}
