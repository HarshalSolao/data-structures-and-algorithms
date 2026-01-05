package com.harshal.dsa.warm_up;

public class PatternPractice {
    public static void main(String[] args) {
        printDiamondPyramid();
        System.out.println("----------------------");
        printStarFullPyramid();
        System.out.println("----------------------");
        printInvertedStarTriangle();
        System.out.println("----------------------");
        printDescendingNumberTriangle();
        System.out.println("----------------------");
        printAscendingNumberTriangle();
    }

    //TODO
    private static void printDiamondPyramid() {
        int n = 3;

        for(int row = 0; row < n*2 - 1; row++){
            int mid = n - 1;
            int i;
            if (row <= mid) {
                i = row;
            } else {
                i = mid - Math.abs(mid - row);
            }

            StringBuilder rowPrint = new StringBuilder();
            for (int j = 0; j < (n - 1 - i); j++) {
                rowPrint.append("  ");
            }
            for (int k = 0; k < (2*i + 1); k++){
                rowPrint.append("* ");
            }
            for (int j = 0; j < (n - 1 - i); j++) {
                rowPrint.append("  ");
            }
            System.out.println(rowPrint);
        }
    }

    private static void printStarFullPyramid() {
        int n = 6;
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < (n - 1 - i); j++) {
                row.append("  ");
            }
            for (int k = 0; k < (2*i + 1); k++){
                row.append("* ");
            }
            for (int j = 0; j < (n - 1 - i); j++) {
                row.append("  ");
            }
            System.out.println(row);
        }

    }

    //Alternative need to explore
    private static void printStarFullPyramid_1() {
        int n = 6;
        for (int i = 0; i < n; i++) {
            String row = "  ".repeat((n - 1 - i)) +
                    "* ".repeat((2 * i + 1)) +
                    "  ".repeat((n - 1 - i));
            System.out.println(row);
        }

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
