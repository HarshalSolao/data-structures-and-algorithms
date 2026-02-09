package com.harshal.dsa.strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/valid-anagram/description/
public class ValidAnagram {
    public static void main(String[] args) {
        var s = "harshal";
        var t = "shharal";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) > 1) {
                    map.put(c,map.get(c) - 1);
                } else {
                    map.remove(c);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

}
