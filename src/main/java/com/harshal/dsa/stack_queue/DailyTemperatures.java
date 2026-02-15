package com.harshal.dsa.stack_queue;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/
public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temp = new int[]{89,62,70,58,47,47,46,76,100,70}; //Output: [8,1,5,4,1,2,1,1,0,0]
        System.out.println(Arrays.toString(dailyTemperatures(temp)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        result[result.length-1] = 0;
        stack.push(temperatures.length-1);
        for (int i = temperatures.length - 2; i >=0 ; i--) {
            int top = temperatures[stack.peek()];
            if(temperatures[i] < top){
                result[i] = stack.peek() - i;
            } else {
                while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                    stack.pop();
                }
                if(!stack.isEmpty()) {
                    result[i] = stack.peek() - i;
                }else {
                    result[i] = 0;
                }
            }
            stack.push(i);
        }
        return result;
    }
}
