package com.harshal.dsa.strings;

//https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        var strs = new String[]{""};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int index = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            index = i;
            var c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                int length = strs[j].length() - 1;
                if (length < 0 || i > length || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, index);
                }
            }
        }
        return strs[0].isEmpty() ? "" : strs[0].substring(0, index + 1);
    }
}
