package com.harshal.dsa.strings;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static void main(String[] args) {
        var s = "har_sa_rah";
        System.out.println(isPalindrome2(s));
    }

    //This is without extra space and TC is O(n)
    public static boolean isPalindrome2(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!Character.isLetterOrDigit(ci)) {
                i++;
            } else if (!Character.isLetterOrDigit(cj)) {
                j--;
            } else if (Character.toLowerCase(ci) == Character.toLowerCase(cj)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }


    public static boolean isPalindrome1(String s) {
        StringBuilder filtered = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                char lower = Character.toLowerCase(c);
                filtered.append(lower);
                rev.insert(0, lower);
            }
        }
        return filtered.toString().equals(rev.toString());

//Below is faster than above approach as it's without any build-in functions

//        if (s.isEmpty())
//            return true;
//        var str = s.toLowerCase();
//        StringBuffer sb = new StringBuffer();
//        for (char c : str.toCharArray()) {
//            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
//                sb.append(c);
//            }
//        }
//        var strNew = sb.toString();
//        int left = 0;
//        int right = strNew.length() - 1;
//        while (left < right) {
//            if (strNew.charAt(left) != strNew.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
    }
}
