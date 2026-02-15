package com.harshal.dsa.stack_queue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//https://leetcode.com/problems/next-greater-element-ii/
public class NextGreaterElementTwo {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1}; //[120,11,120,120,123,123,-1,100,100,100]
        System.out.println(Arrays.toString(nextGreaterElements2(arr)));

    }

    public static int[] nextGreaterElements2(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        result[result.length - 1] = -1;
        stack.push(nums[nums.length - 1]);
        int n = nums.length;
        for (int i = (n * 2) - 2; i >= 0; i--) {
            int nge = -1;
            if (nums[i % n] < stack.peek()) {
                nge = stack.peek();
            } else {
                while (!stack.isEmpty() && nums[i % n] >= stack.peek()) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    nge = stack.peek();
                }
            }
            stack.push(nums[i % n]);
            result[i % n] = nge;
        }
        return result;
    }

    public static int[] nextGreaterElements(int[] nums) {
        int[] nums2 = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
            nums2[i + nums.length] = nums[i];
        }
        int[] result = new int[nums.length * 2];
        Stack<Integer> stack = new Stack<>();
        result[result.length - 1] = -1;
        stack.push(nums2[nums2.length - 1]);

        for (int i = nums2.length - 2; i >= 0; i--) {
            int nge = -1;
            if(nums2[i]  < stack.peek()){
                nge = stack.peek();
            } else {
                while (!stack.isEmpty() && nums2[i] >= stack.peek()){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    nge = stack.peek();
                }
            }
            stack.push(nums2[i]);
            result[i] = nge;
        }
        return Arrays.copyOfRange(result, 0, nums.length);
    }
}
