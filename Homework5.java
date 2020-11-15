package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.*;
import java.util.stream.Stream;

public class Homework5 {
    static Scanner scan = new Scanner(System.in);

    public static void printImageA() {
        for (int i = 0; i < 7; i++) {
            System.out.println();
            for (int j = 6; j > 0; j--) {
                if (i < j) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.print(" * ");
            for (int j = 0; j < 6; j++) {
                if (i <= j) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                if (i >= j) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.print(" * ");
            for (int j = 6; j > 0; j--) {
                if ((i + 1) < j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printImageB() {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > 0; j--) {
                if (i < j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < 10; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 10; j > 0; j--) {
                if ((i + 1) < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] arr) {
        int n = arr.length;
        int[][] newArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newArr[i][j] = arr[j][i];
            }
        }
        return newArr;
    }

    public static int[][] initArray(int num, int n) {
        Random rand = new Random();
        int[][] arr = new int[num][num];
        for (int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                arr[i][j] = rand.nextInt(n);
            }
        }
        return arr;
    }


    public static boolean checkRows(int[][] arr, int num) {
        for (int i=0; i<num; i++){
            boolean sameNumbers = true;
            for(int j=0; j<num-1; j++){
                if(arr[i][j] != arr[i][j+1]){
                    sameNumbers = false;
                    break;
                }
            }
            if (sameNumbers) { return true;}
        }
        return false;
    }

    public static boolean checkColumns(int[][] arr, int num) {
        for (int j=0; j<num; j++){
            boolean sameNumbers = true;
            for(int i=0; i<num-1; i++){
                if(arr[i][j] != arr[i+1][j]){
                    sameNumbers = false;
                    break;
                }
            }
            if (sameNumbers) {return true;}
        }
        return false;
    }

    public static boolean checkMajorDiagonal(int[][] arr, int num) {
        for(int i=0; i<num-1; i++) {
            if (arr[i][i] != arr[i + 1][i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSubDiagonal(int[][] arr, int num) {
        for(int i=0; i<num-1; i++) {
            if (arr[i][num-1-i] != arr[i + 1][num - 2 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int[][] sumArrays(int num, int[][] arr1, int[][] arr2) {
        int[][] arr = new int[num][num];
        for (int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        printImageA();
        printImageB();
        int[][] trArr = {{3, 4}, {2, 1}};
        System.out.println(Arrays.deepToString(transposeMatrix(trArr)));

        int num;
        do {
            System.out.println("Input a matrix dimension (not less than 1)");
            num = scan.nextInt();
        } while (num < 1 );
        int[][] arr = initArray(num, 2);

        System.out.println("Generated array");
        System.out.println(Arrays.deepToString(arr));
        if(checkRows(arr, num)) {
            System.out.println("There are same numbers on a row");
        } else {
            System.out.println("No same numbers on a row");
        }
        if(checkColumns(arr, num)) {
            System.out.println("There are same numbers on a column");
        } else {
            System.out.println("No same numbers on a column");
        }
        if (checkMajorDiagonal(arr, num)) {
            System.out.println("There are same numbers on the major diagonal");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }
        if(checkSubDiagonal(arr, num)) {
            System.out.println("There are same numbers on the sub-diagonal");
        } else {
            System.out.println("No same numbers on the sub-diagonal");
        }

        do {
            System.out.println("Input a matrix dimension (not less than 1)");
            num = scan.nextInt();
        } while (num < 1);

        int[][] arr1 = initArray(num,100);
        System.out.println("First Array");
        System.out.println(Arrays.deepToString(arr1));

        int[][] arr2 = initArray(num,100);
        System.out.println("Second Array");
        System.out.println(Arrays.deepToString(arr2));

        int[][] arr3 = sumArrays(num, arr1, arr2);
        System.out.println("New array");
        System.out.println(Arrays.deepToString(arr3));

    }

}
