package com.harshal.dsa.two_pointers_sliding_window;

import java.util.Arrays;

//https://leetcode.com/problems/permutation-in-string/description/
public class PermutationInString {
    public static void main(String[] args) {
        var s1 = "ab";
        var s2 = "eidbaooo";
        System.out.println(checkInclusion_New(s1, s2));
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

    public static boolean checkInclusion_New(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] hashS = new int[26];
        int[] hashW = new int[26];
        int windowLength = s1.length();

        for (int i = 0; i < windowLength; i++) {
            hashS[s1.charAt(i) - 'a']++;
            hashW[s2.charAt(i) - 'a']++;
        }
        int i = 0, j = windowLength - 1;
        while (j < s2.length()) {
            if (isHashSame(hashS, hashW)) return true;
            hashW[s2.charAt(i) - 'a']--;
            i++;
            j++;
            if (j < s2.length())
                hashW[s2.charAt(j) - 'a']++;
        }
        return false;
    }

    private static boolean isHashSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
