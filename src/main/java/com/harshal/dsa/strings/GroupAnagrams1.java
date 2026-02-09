package com.harshal.dsa.strings;

import java.sql.Array;
import java.util.*;

//https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams1 {
    public static void main(String[] args) {
        var strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (var str : strs) {
            var arr = str.toCharArray();
            Arrays.sort(arr);
            var key = Arrays.toString(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
