package com.harshal.dsa.recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(powerOfTwo(n));
    }

    public static boolean powerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else if (n <= 0 || n % 2 != 0) {
            return false;
        }
        return powerOfTwo(n / 2);
    }
}
