package com.harshal.dsa.strings;

//https://leetcode.com/problems/length-of-last-word/description/
public class LastWord {
    public static void main(String[] args) {
        var input = " hello the     world   muye ";
        System.out.println(lengthOfLastWord(input));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        int length = s.length() - 1;
        while (length >= 0) {
            if (s.charAt(length) != ' ') {
                ++count;
            } else if (s.charAt(length) == ' ' && count > 0) {
                break;
            }
            --length;
        }
        return count;
    }

//    public static int lengthOfLastWord(String input) {
//        int count = 0;
//        int length = input.length() - 1;
//        while (length >= 0 && input.charAt(length) == ' ') {
//            --length;
//        }
//
//        while (length >= 0 && input.charAt(length) != ' ') {
//            --length;
//            ++count;
//        }
//        return count;
//    }

//    public static String lengthOfLastWord(String input){
//        var trimmed = input.trim().split(" ");
//        return trimmed[trimmed.length - 1];
//    }

}
