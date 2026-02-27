package com.harshal.dsa.two_pointers_sliding_window;

import java.util.Arrays;
import java.util.Map;

//https://leetcode.com/problems/trapping-rain-water/description/
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(arr));
    }

    public static int trap(int[] height) {
        int ans = 0;
        int[] maxL = new int[height.length];
        maxL[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            maxL[i] = Math.max(height[i], maxL[i - 1]);
        }

        int[] maxR = new int[height.length];
        maxR[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            maxR[i] = Math.max(height[i], maxR[i + 1]);
        }

        for (int i = 0; i < maxL.length; i++) {
            ans = ans + Math.min(maxL[i], maxR[i]) - height[i];
        }

        return ans;
    }
}
