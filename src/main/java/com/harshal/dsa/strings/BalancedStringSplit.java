package com.harshal.dsa.strings;

//https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class BalancedStringSplit {
    public static void main(String[] args) {
        var s = "RLRRRLLRLL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int l = 0;
        int r = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                l++;
            } else r++;
            if (l == r) {
                count++;
                l = 0;
                r = 0;
            }
        }
        return count;
    }
}
