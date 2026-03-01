package com.harshal.dsa.two_pointers_sliding_window;

import java.util.Arrays;

//https://leetcode.com/problems/permutation-in-string/description/
public class PermutationInString {
    public static void main(String[] args) {
        var s1 = "ab";
        var s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int[] arrS1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            int index = s1.charAt(i) - 'a';
            arrS1[index] = ++arrS1[index];
        }
        int i = 0;
        int j = s1.length()-1;
        while (j < s2.length()){
            int[] arrS2 = new int[26];
            for (int k = i; k <= j; k++) {
                int index = s2.charAt(k) - 'a';
                arrS2[index] = ++arrS2[index];
            }
            if(Arrays.equals(arrS1, arrS2)){
                return true;
            } else {
                i++;
                j++;
            }
        }
        return false;
    }
}
