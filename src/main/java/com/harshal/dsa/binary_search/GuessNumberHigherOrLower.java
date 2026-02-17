package com.harshal.dsa.binary_search;

//https://leetcode.com/problems/guess-number-higher-or-lower/description/
public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        int n = 10;
    }

    public static int guessNumber(int n) {
        var l = 1;
        var r = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = guess(m);
            if (res == 0) {
                return m;
            } else if (res < 0) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    //Will be provided by leetcode
    private static int guess(int m) {
        int pick = 6;
        if (m > pick) return -1;
        if (m < pick) return 1;
        return 0;
    }

}
