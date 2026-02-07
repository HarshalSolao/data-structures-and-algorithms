package com.harshal.dsa.strings;

//https://leetcode.com/problems/reverse-string-ii/description/
public class ReverseString2 {
    public static void main(String[] args) {
        var s = "abcdefghij";
        System.out.println(reverseStr(s, 2));
    }


    public static String reverseStr(String s, int k) {
        var arr = s.toCharArray();
        for (int i = 0; i < arr.length; i = i + (2 * k)) {
            int mid = k / 2;
            for (int j = 0; j < mid; j++) {
                var temp = arr[i + j];
                arr[i + j] = arr[i + k - i - 1];
                arr[i + k - i - 1] = temp;
            }
        }
        return String.valueOf(arr);
    }
}
