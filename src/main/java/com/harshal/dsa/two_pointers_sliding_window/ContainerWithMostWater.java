package com.harshal.dsa.two_pointers_sliding_window;

//https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j){
            int area = (j - i) * Math.min(height[i], height[j]);
            maxArea = Math.max(area, maxArea);
            if(height[i] > height[j]){
                j--;
            } else{
                i++;
            }
        }
        return maxArea;
    }

}
