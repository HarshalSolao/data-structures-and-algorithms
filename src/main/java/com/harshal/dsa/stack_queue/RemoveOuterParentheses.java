package com.harshal.dsa.stack_queue;

import java.util.Stack;

//https://leetcode.com/problems/remove-outermost-parentheses/
public class RemoveOuterParentheses {
    public static void main(String[] args) {
        var s = "(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

    //My own solution without any reference
    public static String removeOuterParentheses1(String s) {
        Stack<Character> stack = new Stack<>();
        var arr = s.toCharArray();
        int start = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '('){
                if(stack.isEmpty()){
                    start = i;
                }
                stack.add(arr[i]);
            } else {
                if(stack.peek() != ')'){
                    stack.pop();
                }
                if(stack.isEmpty()){
                   arr[i] = 'a';
                   arr[start] = 'a';
                }
            }
        }
        return String.valueOf(arr).replace("a", "");
    }

    public static String removeOuterParentheses2(String s) {
        Stack<Character> stack = new Stack<>();
        var ans = new StringBuilder();
        for (char c : s.toCharArray()){
            if(c == '('){
                stack.add(c);
                if(stack.size() > 1){
                    ans.append(c);
                }
            } else {
                if(stack.size() > 1){
                    ans.append(c);
                }
                stack.pop();
            }

        }
        return ans.toString();
    }

//Without stack
    public static String removeOuterParentheses(String s) {
        var ans = new StringBuilder();
        int level = 0;
        for (char c : s.toCharArray()){
            if(c == '('){
                level++;
                if(level > 1){
                    ans.append(c);
                }
            } else {
                if(level > 1){
                    ans.append(c);
                }
                level--;
            }
        }
        return ans.toString();
    }
}
