package com.harshal.dsa.strings;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/jewels-and-stones/
public class JewelsInStones {
    public static void main(String[] args) {
        var jewels = "aA";
        var stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        var count = 0;
        for (Character c : jewels.toCharArray()){
            set.add(c);
        }
        for (Character c: stones.toCharArray()){
            if(set.contains(c)){
            ++count;
            }
        }
        return count;
    }

    /*public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c : stones.toCharArray()){
            if(jewels.indexOf(c) != -1){
                count++;
            }
        }

        return count;
    }*/

}
