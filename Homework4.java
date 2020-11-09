package com.company;

import java.util.Scanner;

public class Homework4 {

    public static int inputNumber(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a positive number.");
            n = scanner.nextInt();
        } while (n < 1);
        return n;
    }

    public static int findFactorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return  fact;
    }

    public static void findFibonacchi(int num){
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2 + " ");
        do {
            n3 = n2 + n1;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        } while((n2+n1) <= num);
        System.out.println();
    }

    public static int ExtractDigits(int n){
        int a,b=0;
        while (n > 0){
            a = n%10;
            n = n/10;
            if (b == 0){
                b += a;
            } else {
                b = (b*10) + a;
            }
        }
        return b;
    }


    public static int sumOfNumbers(int n){
        int sum = 0;
        int i=1;
        do {
            sum += i;
            i++;
        } while(i < n);
        return sum;
    }

    public static int indexOfSmallestElement(int[] arr){
        int min = arr[0];
        int index =0;
        for (int i=0; i<arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void printElementsOfArray(int[] arr){
//        allows to  apply without index
        for (int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();

//        allows you to apply to index
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void isPolidrome(int n){
        int sum = 0, a;
        int temp = n;
        while(n>0)
        {
            a = n % 10;
            sum = (sum*10) + a;
            n = n/10;
        }
        if(temp==sum)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a palindrome");
   }

   public static boolean isContaineGivenNumber(int n, int[] arr){
       for (int el : arr) {
           if ( el == n) {
               return true;
           }
       }
       return false;
   }

    public static void main(String args[]){
        int factNum = inputNumber();
        System.out.println(findFactorial(factNum));

        int fibNum = inputNumber();
        findFibonacchi(fibNum);

        int revNum = inputNumber();
        System.out.println(ExtractDigits(revNum));

        int numOfSum = inputNumber();
        System.out.println(sumOfNumbers(numOfSum));


        int[] arr = {14, 15, 6, 8, 45, 9, 87};
        System.out.println(indexOfSmallestElement(arr));

        printElementsOfArray(arr);

        int intPol = inputNumber();
        isPolidrome(intPol);


        int givNum = inputNumber();

        boolean isContains = isContaineGivenNumber(givNum, arr);
        if (isContains == true){
            System.out.println("Array contains a integer");
        } else {
            System.out.println("Array not contains a integer");
        }

    }
}
