package com.harshal.dsa.two_pointers_sliding_window;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-repeating-character-replacement/description/
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        var s = "ABAB";
        System.out.println(characterReplacement(s, 2));
    }

    public static int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int i = 0, j = 0, maxWindow = 0;
        map[s.charAt(0) - 'A'] = 1;
        while(j < s.length()) {
            if(isWindowValid(map, k)) {
                maxWindow = Math.max(maxWindow, j - i + 1);
                ++j;
                if(j < s.length()) map[s.charAt(j) - 'A']++;
            } else {
                map[s.charAt(i) - 'A']--;
                ++i;
            }
        }
        return maxWindow;
    }

    private static boolean isWindowValid(int[] map, int k) {
        int totalCount = 0, maxCount = 0;
        for(int count : map) {
            totalCount += count;
            maxCount = Math.max(maxCount, count);
        }
        return (totalCount - maxCount <= k);
    }
}
