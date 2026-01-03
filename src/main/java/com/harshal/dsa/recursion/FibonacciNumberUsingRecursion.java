package com.harshal.dsa.recursion;

//https://leetcode.com/problems/fibonacci-number/description/
public class FibonacciNumberUsingRecursion {
    public static void main(String[] args) {
        System.out.println(fib(50));
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
