package com.harshal.dsa.binary_search;

//https://leetcode.com/problems/first-bad-version/description/
public class FirstBadVersion {
    public static void main(String[] args) {

    }

    public static int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while(l < r){
            int mid = l + (r-l)/2;
            if(isBadVersion(mid)){
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    //Provided by leet code
    private static boolean isBadVersion(int mid) {
        return true;
    }
}
