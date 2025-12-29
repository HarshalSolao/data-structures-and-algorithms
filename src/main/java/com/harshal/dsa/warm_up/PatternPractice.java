package com.harshal.dsa.warm_up;

public class PatternPractice {
    public static void main(String[] args) {
        printInvertedStarTriangle();
        System.out.println("----------------------");
        printDescendingNumberTriangle();
        System.out.println("----------------------");
        printAscendingNumberTriangle();
    }

    public static void printInvertedStarTriangle(){
        int n = 5;
        for (int i = 0; i < n; i++) {
            String row = "";
            for (int j = 0; j < (n - i); j++) {
                row = row + "* ";
            }
            System.out.println(row);
        }
    }

    public static void printDescendingNumberTriangle(){
        int n = 5;
        for (int i = 0; i < n; i++) {
            String row = "";
            for (int j = 0; j < (n - i); j++) {
                row = row + (j + 1) + " ";
            }
            System.out.println(row);
        }
    }

    public static void printAscendingNumberTriangle(){
        int n = 5;
        for (int i = 0; i < n; i++) {
            String row = "";
            for (int j = 0; j <= i; j++) {
                row = row + (j + 1) + " ";
            }
            System.out.println(row);
        }
    }
}
