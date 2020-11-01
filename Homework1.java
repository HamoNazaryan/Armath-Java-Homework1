package com.company;

public class Homework1 {

    public static void main(String[] args) {

        //        1.Write a Java program to print “Hello”on the screen and then print your name on a separate line.
        System.out.println("Hello");
        System.out.println("Hamo\n");


        //        2.Assign values to variables in correct orderand print results.

        byte b = 2;
        short s = 1237;
        int i = 189025;
        long l = 29755L;
        float ff = 29.5f;
        double d = 2.7;
        char c = 'A';
        boolean bool = true;
        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + ff);
        System.out.println("double = " + d);
        System.out.println("char = " + c);
        System.out.println("boolean = " + bool);
        System.out.println();


        //       3. Write a Java program that takes two numbers and prints the sum (addition), multiplication, subtraction, division, and remainder of the two numbers.
        int num1 = 15;
        int num2 = 7;

        System.out.println("sum = " + (num1+num2));
        System.out.println("multipl = " + (num1*num2));
        System.out.println("sub = "+(num1-num2));
        System.out.println("division = " + (num1/num2));
        System.out.println("reminder = " + (num1%num2));
        System.out.println();

        //        4.Writea Java program to find and print the middle digit of a 3-digit number.
        int num = 487;
        int midlleDigite = num/10%10;
        System.out.println(midlleDigite);
        System.out.println();

        //        5.Assume 1kg apple costs 450 AMD and 1kg pear costs 600 AMD. Ara wants to buy 5kg apple and 4kg pear.
        //        Write a Java program that given the number of kgs of apple and pear, computes and displays the total amount of moneyAra should pay.

        int appleCost = 450;
        int pearCost = 600;

        int apple = 5 * appleCost;
        int pear = 4 * pearCost;
        int total = apple + pear;

        System.out.println("total amount of money = " + total);
        System.out.println();

        //        6.Write a Java program that reads a number in centimeters and converts it to meters

        double sm = 150;
        double mtr  = sm/100;
        System.out.println("meter = " + mtr);
        System.out.println();


        //        7.*  Write a Java program that adds all the digits in the 4 digit-integer.

        int number = 2358;
        int sum = 0;

        while (number>0){
            sum += number%10;
            number /=10;
        }

        System.out.println("sum of all digits in the digit-integer = " + sum );
        System.out.println();

//        8.Change the following program to use compound assignments:
//        publicclass ArithmeticDemo {
//                  public static void main (String[] args){
//                          int result = 1 + 2; // result is now 3
//                          System.out.println(result);
//
//                          result = result -1; // result is now 2
//                          System.out.println(result);
//
//                          result = result * 2; // result is now 4
//                          System.out.println(result);
//
//                          result = result / 2; // result is now 2
//                          System.out.println(result);
//
//                          result = result + 8; // result is now 10
//                          result = result % 7; // result is now 3
//                          System.out.println(result);
//                   }
//           }


        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result -= 1; // result is now 2
        System.out.println(result);

        result *= 2; // result is now 4
        System.out.println(result);
        result /= 2; // result is now 2
        System.out.println(result);

        result += 8; // result is now 10
        System.out.println(result);
        result %= 7; // result is now 3
        System.out.println(result);



//       9.In the following program, explain why the value "6" is printed twice in a row


        /* The idea is that ++i increments a and returns that value, while i++ returns a value and then increments a. */


    }
}
