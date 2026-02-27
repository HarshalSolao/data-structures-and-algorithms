package com.harshal.dsa.two_pointers_sliding_window;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstring {
    public static void main(String[] args) {
        var s = "pwwkewrt";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int i = 0, j = 0;
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i) {
                i = map.get(s.charAt(j)) + 1;
            }
            map.put(s.charAt(j), j);
            j++;
            max = Math.max(max, j - i);
        }
        return max;
    }
}
