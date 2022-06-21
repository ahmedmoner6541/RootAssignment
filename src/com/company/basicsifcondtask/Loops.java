package com.company.basicsifcondtask;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
/*
        getNumbersDivisibleByFive();    // Result :  0 5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95
        getAscendingOrder();            // Result : 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99
        getDescendingOrder();           // Result : 100 99 98 97 96 95 94 93 92 91 90 89 88 87 86 85 84 83 82 81 80 79 78 77 76 75 74 73 72 71 70 69 68 67 66 65 64 63 62 61 60 59 58 57 56 55 54 53 52 51 50 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2
        getPower(2, 5);                 // Result : 32
        getFactorial(4);                // Result : 24
        getSequenceOfNumbers();         // Result : 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        getSequenceOfNumbersTwo();      // Result : 1 2 4 8 16 32 64 128 256 512
        getOddIntegersFromOneToFifteen();//Result: 49
        getTheAverageCollectionOfNumber();
        sumOfDigit();
        getManyDigitInthisNumber();
        howManyTimesCanWeDivideItByTweo(50);
        numbersAreDivisableByFiveOrSix();
  */
    }


    private static void getNumbersDivisibleByFive() {
        for (int i = 0; i < 100; i += 5) {
            System.out.print(i + " ");
        }
    }

    private static void getAscendingOrder() {
        for (int i = 1; i < 100; i++) {
            System.out.print(i + " ");
        }
    }

    private static void getDescendingOrder() {
        for (int i = 100; i > 1; i--) {
            System.out.print(i + " ");
        }
    }

    private static void getPower(int base, int power) {
        int resu = 1;
        for (int i = 1; i < power + 1; i++) {
            resu = resu * base;
        }
        System.out.println(resu);
    }

    private static void getFactorial(int factorial) {
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        System.out.println(result);
    }

    private static void getSequenceOfNumbers() {
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
    }

    private static void getSequenceOfNumbersTwo() {
        int result = 1;
        System.out.print(result);
        for (int i = 1; i < 10; i++) {
            result *= 2;
            System.out.print(" " + result);
        }

    }

    private static void getOddIntegersFromOneToFifteen() {
        int result = 0;
        for (int i = 1; i < 15; i++) {
            if (i % 2 == 1) {
                result += i;
            }
        }
        System.out.println(result);
    }

    private static void getTheAverageCollectionOfNumber() {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int i;
        int sumWithoutNigativeNumber = 0;
        for (i = 0; number >= 0; i++) {
            sumWithoutNigativeNumber = sum;
            number = input.nextInt();
            sum += number;
        }
        System.out.println("sum all number = " + sumWithoutNigativeNumber);
        System.out.println("average = " + sumWithoutNigativeNumber / (i - 1));
        //A group of numbers and then divide the result by the number of those numbers

    }

    private static void sumOfDigit() {
//        System.out.println(123%10 + "||"+123/10);//for sum <-// 3 || 12 ->for condition
//        System.out.println(12%10 + "||"+12/10);              // 2 || 1
//        System.out.println(1%10 + "||"+1/10);                // 1 || 0
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any  number: ");
        int number = input.nextInt();
        for (sum = 0; number != 0; number /= 10) {
            sum += number % 10;
        }
        System.out.println("sum numers is : " + sum);
    }

    private static void getManyDigitInthisNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any  number: ");
        int number = input.nextInt();
        int sum;
        for (sum = 0; number != 0; number /= 10) {
            sum++;
        }
        System.out.println(sum);
    }

    private static void howManyTimesCanWeDivideItByTweo(int number) {
        int sum = 0;
        int i = 1;
        for (i = number; i > 0; i--) {
            i /= 2.0;
            sum++;
            System.out.println("divide number " + sum + " = " + i);
        }
        System.out.println("sum of divide is = " + sum);

    }

    private static void numbersAreDivisableByFiveOrSix() {

        for (int i = 100; i < 200; i++) {
            if (i % 6 == 0 && i % 5 != 0 || i % 5 == 0 && i % 6 != 0) {
                System.out.println(i);
            }
        }
    }
}
