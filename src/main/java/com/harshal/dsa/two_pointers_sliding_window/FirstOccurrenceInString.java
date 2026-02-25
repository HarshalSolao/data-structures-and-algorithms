package com.harshal.dsa.two_pointers_sliding_window;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class FirstOccurrenceInString {
    public static void main(String[] args) {
        var haystack = "a";
        var needle = "a";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        for (int i = 0; i <= h-n; i++) {
            int j = 0;
            for (; j < n; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
            }
            if(j==n){
                return i;
            }
        }
        return -1;
    }
}
