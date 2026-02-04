package com.harshal.dsa.strings;

import java.util.HashMap;
import java.util.Set;

//https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/description/
public class MaxFreqSum {
    public static void main(String[] args) {
        var s = "successes";
        System.out.println(maxFreqSum(s));
    }

    /*public static int maxFreqSum(String s) {
        int vowel = 0;
        int consonant = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        Set<Character> vowels = Set.of('a','e','i','o','u');
        for(var entry : map.entrySet()){
            if(vowels.contains(entry.getKey())){
                vowel = Math.max(entry.getValue(), vowel);
            } else {
                consonant = Math.max(entry.getValue(), consonant);
            }
        }
        return vowel + consonant;
    }*/

    public static int maxFreqSum(String s) {
        int maxC = 0, maxV = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);

        for (var ch : map.keySet()){
            var val = map.get(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                maxC = Math.max(val, maxC);
            } else {
                maxV = Math.max(val, maxV);
            }
        }
        return maxC+maxV;
    }
}
