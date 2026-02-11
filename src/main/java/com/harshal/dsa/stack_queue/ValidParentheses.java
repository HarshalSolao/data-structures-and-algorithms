package com.harshal.dsa.stack_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/description/
public class ValidParentheses {
    public static void main(String[] args) {
        var s = "[]]";
        System.out.println(isValid1(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty() || (stack.peek() == '{' && s.charAt(i) != '}')
                        || (stack.peek() == '(' && s.charAt(i) != ')')
                        || (stack.peek() == '[' && s.charAt(i) != ']')) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('{','}');map.put('[',']');map.put('(',')');
        for (char c : s.toCharArray()){
            if(map.containsKey(c)){
                stack.push(c);
            } else {
                if (stack.isEmpty() || (map.get(stack.peek()) != c)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
