package com.harshal.dsa.two_pointers_sliding_window;

//https://leetcode.com/problems/is-subsequence/description/
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "axcahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i >= s.length();
    }
}
