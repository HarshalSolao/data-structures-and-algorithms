package com.harshal.dsa.stack_queue;

import java.util.Stack;

//http://leetcode.com/problems/min-stack/description/
public class MinStack {
    Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()){
            stack.add(new Pair(val, val));
        } else {
            int min = Math.min(val, stack.peek().extra);
            stack.add(new Pair(val, min));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().extra;
    }

    static  class Pair {
        int value;
        int extra;

        Pair(int value, int extra) {
            this.value = value;
            this.extra = extra;
        }
    }
}

