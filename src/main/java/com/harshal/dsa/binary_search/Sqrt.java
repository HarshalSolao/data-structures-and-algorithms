package com.harshal.dsa.binary_search;

//https://leetcode.com/problems/sqrtx/description/
public class Sqrt {
    public static void main(String[] args) {
        int num = 2147395599;
        System.out.println(mySqrt(num));
    }

    //When you calculate square root of any number then it never goes beyond half of that if it's greater than 2
    //So I have to search from 2 to (x/2)
    public static int mySqrt(int x) {
        if(x < 2) return x;
            int left = 2;
            int right = x/2;
            while (left <= right){
                int mid = left +(right - left)/ 2;
                long sq = (long)mid * mid; //If I don't use long casting calculation not working for high values
                if(sq == x){
                    return mid;
                } else if (x < sq){
                    right = mid - 1;
                } else if (x > sq) {
                    left = mid + 1;
                }
            }
        return right;
    }
}
