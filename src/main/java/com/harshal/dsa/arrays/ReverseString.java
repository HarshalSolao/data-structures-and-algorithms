package com.harshal.dsa.arrays;

//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        System.out.println(reverseString(s));
    }

    public static char[] reverseString(char[] s){

        for (int i = 0; i < s.length/2 ; i++){
            char temp = s[i];
            s[i] = s [s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        return s;
    }

}
