package com.company;
import java.util.Scanner;

public class Homework2 {

    static Scanner scanner = new Scanner(System.in);


    public static void averageOfThreeNumbers(){
        System.out.println("Enter first number ");
        double n1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double n2 = scanner.nextDouble();
        System.out.println("Enter third number");
        double n3 = scanner.nextDouble();
        double average = (n1+n2+n3)/3;
        System.out.println("the average of three numbers = " + average);
    }

    public static void integerPositiveOrNegative(){
        System.out.println("Enter a number ");
        double num = scanner.nextDouble();
        if (num > 0) {
            System.out.println("Number is positive");
        } else if(num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Zero is unsigned");
        }
    }

    public static void integerEvenOrOdd(){
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (num%2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }

    public static double perimeterOfRectangle(double l, double h){
            return 2*(l+h);
    }
    public static double areaOfRectangle(double l, double h){
        return l*h;
    }

    public static double areaOfCircle(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double lengthOfCircle(double r){
        return  2 * Math.PI * r;
    }

    public static void quadraticRoot() {
        System.out.println("Enter 'a' number of quadratic ");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Error 'a' can't be zero");
        } else {
            System.out.println("Enter 'b' number of quadratic ");
            double b = scanner.nextDouble();
            System.out.println("Enter 'd' number of quadratic ");
            double c = scanner.nextDouble();

            double root1;
            double root2;
            double det = b * b - 4 * a * c;

            if (det > 0) {
                root1 = (-b + Math.sqrt(det)) / (2 * a);
                root2 = (-b - Math.sqrt(det)) / (2 * a);
                System.out.format("root1 = " + root1 + ", root2 = " + root2);
            } else if (det == 0) {
                root1 = root2 = -b / (2 * a);
                System.out.format("root1 = root2 = " + root1);
            } else {
                System.out.println("The equation has no real roots.");
            }

        }
    }


    public static String weekDay(int n){
        switch (n) {
            case 1:
                return "Day of the week is Sunday";
            case 2:
                return "Day of the week is Monday";
            case 3:
                return "Day of the week is Tuesday";
            case 4:
                return "Day of the week is Wednesday";
            case 5:
                return "Day of the week is Thursdays";
            case 6:
                return "Day of the week is Friday";
            case 7:
                return "Day of the week is Saturday";
            default:
                return "There is no such day of the week";
        }
    }

    public static String isPrime(int num){
        if(num == 2 || num == 3){
            return "Number is not prime";
        } else if (num < 2){
            return "Number is not prime";
        } else {
            int k = (int) (Math.sqrt(num) + 1);
            for (int i = 2; i <= k; i++) {
                if (num % i == 0) {
                    return "Number is not prime";
                }
            }
            return "Number is prime";
        }

    }

    public static void main(String[] args) {
//        1. Write a Java method to compute the average of three numbers.
        averageOfThreeNumbers();

//        2. Write a Java method to check whether the given integer is positive or negative.
        integerPositiveOrNegative();

//        3. Write a method that displays a message indicating whether the integer is even or odd.
        integerEvenOrOdd();

//        4. Write two functions that both given two numbers: length and width, the first one computes the perimeter of
//           rectangle and the second one the area of rectangle and return results accordingly.
        System.out.println("Enter length of rectangle");
        double recLength = scanner.nextDouble();
        System.out.println("Enter height of rectangle");
        double recHeight = scanner.nextDouble();

        System.out.println("Perimeter of rectangle = " + perimeterOfRectangle(recLength,recHeight));
        System.out.println("Area of rectangle = " + areaOfRectangle(recLength, recHeight));
//
//        5. Write two functions that both given the radius of a circle, the first one computes the area of the circle
//           and the second one the length of the circle and return results accordingly.
        System.out.println("Enter radius of circle");
        double circleRadius = scanner.nextDouble();

        System.out.println("Area of the circle = " + areaOfCircle(circleRadius));
        System.out.println("Length of the circle = " + lengthOfCircle(circleRadius));

//        6.  Write a method that solves quadratic equation using the quadratic formula. It should have three numbers a, b and c.
//        It should print error messages if a is zero, or if the roots are complex. Otherwise, it should print the two/one root.
       quadraticRoot();

//        7. Write a method that given a number displays the name of the weekday. If the number is outside the appropriate range, print an error message.
        System.out.println("Enter number of weekday");
        int weekdayNumber = scanner.nextInt();
        System.out.println(weekDay(weekdayNumber));

//        8. Write a method that displays a message indicating whether the integer is prime or not.
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        System.out.println(isPrime(num));
    }
}
