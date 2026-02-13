package com.harshal.dsa.stack_queue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//https://namastedev.com/learn/namaste-dsa/next-greater-element
public class NextGreaterElement {
    public static void main(String[] args) {
        var nums1 = new int[]{1,3,5,2,4};
        var nums2 = new int[]{6,5,4,3,2,1,7};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int length = nums2.length - 1;
        map.put(nums2[length], -1);
        stack.push(nums2[length]);
        for (int i = length - 1; i >= 0; i--) {
            int nge = -1;
            if(nums2[i]  < stack.peek()){
               nge = stack.peek();
            } else {
                while (!stack.isEmpty() && nums2[i] > stack.peek()){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    nge = stack.peek();
                }
            }
            stack.push(nums2[i]);
            map.put(nums2[i], nge);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
