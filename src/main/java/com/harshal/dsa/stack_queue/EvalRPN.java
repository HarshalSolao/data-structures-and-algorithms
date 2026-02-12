package com.harshal.dsa.stack_queue;

import java.util.*;
import java.util.function.BiFunction;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class EvalRPN {
    public static void main(String[] args) {
       var arr = new String[]{"1","2","+","3","*","4","-"};
        System.out.println(evalRPN(arr));
    }

    public static int evalRPN(String[] tokens) {
        if(tokens.length == 1) return Integer.parseInt(tokens[0]);
        Map<String, BiFunction<Integer, Integer, Integer>> map = new HashMap<>();
        map.put("+",(a,b) -> b + a);
        map.put("-",(a,b) -> b - a);
        map.put("*",(a,b) -> b * a);
        map.put("/",(a,b) -> b / a);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if(!map.containsKey(tokens[i])){
                stack.add(Integer.parseInt(tokens[i]));
            } else {
                  int val1 = stack.pop();
                  int val2 = stack.pop();
                  var result = map.get(tokens[i]).apply(val1, val2);
                  stack.add(result);
            }
        }
        return stack.pop();
    }

    //Old Approach without MAP
    public static int evalRPN1(String[] tokens) {
        if (tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        Set<String> operators = Set.of("+", "-", "/", "*");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!operators.contains(tokens[i])) {
                stack.add(tokens[i]);
            } else {
                int val2 = Integer.parseInt(stack.pop());
                int val1 = Integer.parseInt(stack.pop());
                var result = calculate(val1, val2, tokens[i]);
                stack.add(String.valueOf(result));
            }
        }
        return Integer.parseInt(stack.peek());
    }

    public static int calculate(int num1, int num2, String operator) {
        if ("+".equals(operator)) {
            return num1 + num2;
        } else if ("-".equals(operator)) {
            return num1 - num2;
        } else if ("*".equals(operator)) {
            return num1 * num2;
        } else if ("/".equals(operator)) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
