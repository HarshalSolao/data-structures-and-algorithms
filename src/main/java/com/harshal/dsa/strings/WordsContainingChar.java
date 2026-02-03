package com.harshal.dsa.strings;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-words-containing-character/
public class WordsContainingChar {
    public static void main(String[] args) {
        String s = "hello world see yuu soon";
        System.out.println(findWordsContaining(s.split(" "), 'o'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int l = words[i].length() - 1;
            while (l >= 0){
                if(words[i].charAt(l) == x){
                    result.add(i);
                    break;
                }
                --l;
            }
        }
        return result;
    }
}
