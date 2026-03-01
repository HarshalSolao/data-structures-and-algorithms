package com.harshal.dsa.two_pointers_sliding_window;

import java.util.*;

//https://leetcode.com/problems/sliding-window-maximum/description/
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {7,2,4};
        var k = 2;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();
        int i = 0, j = 0;
        while (j < arr.length) {
            while (!q.isEmpty() && arr[j] > q.peekLast()) {
                q.pollLast();
            }
            q.offerLast(arr[j]);

            if (j >= k - 1) {
                res.add(q.peekFirst());
                if (arr[i] == q.peekFirst()) q.pollFirst();
                i++;
            }
            j++;
        }
        return res.stream().mapToInt(x -> x.intValue()).toArray();
    }
}
