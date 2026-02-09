package com.harshal.dsa.strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/description/
public class IsomorphicString {
    public static void main(String[] args) {
        var s = "badc";
        var t = "bate";
        System.out.println(isIsomorphic(s,t));
    }


    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (!mapST.containsKey(cs) && !mapTS.containsKey(ct)) {
                mapST.put(cs, ct);
                mapTS.put(ct, cs);
            } else {
                if (!(mapST.containsKey(cs) && ct == mapST.get(cs)) || !(mapTS.containsKey(ct) && cs == mapTS.get(ct)))
                    return false;
            }
        }
        return true;
    }
}
