package com.harshal.dsa.strings;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static void main(String[] args) {
        var s = "0P";
        System.out.println(isPalindrome1(s));
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
