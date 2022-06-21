package com.company;

import java.util.Scanner;

public class Basics {

<<<<<<< HEAD:src/com/company/basicsifcondtask/Basics.java


    public static void main(String[] args) {



=======


    public static void main(String[] args) {
        areaOfCircle();

        /*
>>>>>>> 15f8458 (first):src/com/company/Basics.java
        // question 1
        System.out.println(getNameMonthByNum());

       // question 2
        System.out.println(getSeasonByMonth(6));

        // question 3
        System.out.println(getCharVowel());

        // question 4
        System.out.println(simpleCalculator());

        // question 5
        System.out.println(positiveOrNigative());

        // question 6     terminal operation **
        System.out.println(grade());

        // question 7
        wotermelonn();

        // question 8
        sortingThreeFloatingNumbers();

        // question 9
        sortingThreeFloatingNumbersterminalOperator();

        // question 10
        AssignmentOperaror();

        // question 11
        sumPositiveAndNigative();

        // question 12
        areaOfCircle();
*/

    }

    public static String getNameMonthByNum() {
        System.out.println("enter number of month");
        Scanner inputNumOfMonth = new Scanner(System.in);
        int numberOfMonth = inputNumOfMonth.nextInt();
        String nameOfMonth = "";
        switch (numberOfMonth) {
            case 1:
                nameOfMonth = "January";
                break;
            case 2:
                nameOfMonth = "February";
                break;
            case 3:
                nameOfMonth = "March";
                break;
            case 4:
                nameOfMonth = "April";
                break;
            case 5:
                nameOfMonth = "May";
                break;
            case 6:
                nameOfMonth = "June";
                break;
            case 7:
                nameOfMonth = "July";
                break;
            case 8:
                nameOfMonth = "August";
                break;
            case 9:
                nameOfMonth = "September";
                break;

            case 10:
                nameOfMonth = "October";
                break;
            case 11:
                nameOfMonth = "November";
                break;
            case 12:
                nameOfMonth = "November";
                break;

        }

        return "the month number " + numberOfMonth + " is : " + nameOfMonth;
    }

    public static String getSeasonByMonth(int month) {
        String nameOfSeason = "";
        if (month == 3 || month == 4 || month == 5) {
            nameOfSeason = "spring";
        }
        if (month == 6 || month == 7 || month == 8) {
            nameOfSeason = "summer";
        }
        if (month == 9 || month == 10 || month == 11) {
            nameOfSeason = "autom ";
        }
        if (month == 12 || month == 1 || month == 2) {
            nameOfSeason = "winter ";
        }
        return "the month number " + month + " is " + nameOfSeason;
    }

    public static String getCharVowel() {

        System.out.println("enter any char ");
        Scanner inputChar = new Scanner(System.in);
        char ch = inputChar.next().toLowerCase().charAt(0);
        String result;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            result = "the char is vowl ";
        } else {
            result = "the char is constant ";
        }
        return result;
    }

    public static String simpleCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number : ");
        int firstNum = input.nextInt();
        System.out.println("enter secound number : ");
        int secoundNum = input.nextInt();
        System.out.println("enter operation same as  /  *  -  + ");
        char operation = input.next().charAt(0);
        int resutl = 0;
        switch (operation) {
            case '+':
                resutl = firstNum + secoundNum;
                break;
            case '-':
                resutl = firstNum - secoundNum;
                break;
            case '*':
                resutl = firstNum * secoundNum;
                break;
            case '/':
                resutl = firstNum / secoundNum;
                break;
        }
        return " The result of operation : " + operation + " firstNum  : " + firstNum
                + " and " + " secoundNum : " + secoundNum + " is = " + resutl;
    }

    public static String positiveOrNigative() {

        Scanner input = new Scanner(System.in);
        System.out.println("enter  number : ");
        int number = input.nextInt();
        String resutl ;
        if (number > 0) {
            resutl = "pos";
        } else {
            resutl = "nig";
        }
        return "the number " + number + " is :" + resutl;
    }

    public static String grade() {
        System.out.println("enter your mark");
        Scanner sc = new Scanner(System.in);
        int mark = Integer.parseInt(sc.nextLine());
        String result = "";
        switch ((0 <= mark && mark < 40) ? 0 :
                (40 <= mark && mark < 60) ? 1 :
                        (60 <= mark && mark < 80) ? 2 :
                                (80 <= mark) ? 3 : 4) {
            case 0:
                result = "f";
                break;
            case 1:
                result = "C";
                break;
            case 2:
                result = "B";
                break;
            case 3:
                result = "A";
                break;
            case 4:
                result = "invalid grade";
                break;
        }
        return result;

    }

//7//
 public static void wotermelonn() {
        System.out.println("enter your watermelon kilos");
        Scanner sc = new Scanner(System.in);
        int kilo = sc.nextInt();
        System.out.println("watermelon is " + kilo + " kilo");


        if (kilo % 2 == 0) {
            System.out.println("Yes, it can be divided and the result is : " + kilo / 2 + " Each one");
        } else {
            System.out.println("no , The number is not an even number");
            System.out.println("Division will result in a decimal number " + kilo / 2.0);
        }


    }

    public static void sortingThreeFloatingNumbers() {
        float num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first num ");
        num1 = input.nextFloat();

        System.out.println("enter secound num ");
        num2 = input.nextInt();

        System.out.println("enter third num ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("the bigger num is : " + num1);
            if (num2 > num3) {
                System.out.println("the middle num  is : " + num2);
                System.out.println("the smaller num  is : " + num3);
            } else if (num3 > num2) {
                System.out.println("the middle num  is : " + num3);
                System.out.println("the smaller num  is : " + num2);
            }

        } else if (num2 > num3 && num2 > num1) {
            System.out.println("the bigger is : " + num2);
            if (num1 > num3) {
                System.out.println("the middle num  is : " + num1);
                System.out.println("the smaller num  is : " + num3);
            } else if (num3 > num1) {
                System.out.println("the middle num  is : " + num3);
                System.out.println("the smaller num  is : " + num1);
            }
        } else {
            System.out.println("the bigger is : " + num3);
            if (num1 > num2) {
                System.out.println("the middle num  is : " + num1);
                System.out.println("the smaller num  is : " + num2);
            } else if (num2 > num1) {
                System.out.println("the middle num  is : " + num2);
                System.out.println("the smaller num  is : " + num1);
            }

        }

    }

    public static void sortingThreeFloatingNumbersterminalOperator() {

        float num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first num ");
        num1 = input.nextFloat();

        System.out.println("enter secound num ");
        num2 = input.nextInt();

        System.out.println("enter third num ");
        num3 = input.nextInt();

        String bigger = (num1 > num2 && num1 > num3) ? bigger = " the bigger num is : " : (num2 > num3) ? bigger = " the bigger num is : " + num2 : " the bigger num is : " + num3;

        System.out.println(bigger);

    }

    public static void AssignmentOperaror() {
        int x = 3;
        int y = 2;
        int z = x++;
        int w = ++y;
        System.out.println("x =" + x);

        System.out.println("y =" + y);

        System.out.println("z =" + z);

        System.out.println("w =" + w);

    }

    public static void sumPositiveAndNigative() {
        int sumnegative = 0;
        int sumpositive = 0;
        int[] arr = new int[]{1, 3, 6, -1, -3, -6};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                sumnegative = sumnegative + arr[i];

            if (arr[i] > 0)
                sumpositive = sumpositive + arr[i];
        }
        System.out.println("sumpositive = " + sumpositive);
        System.out.println("sumnegative = " + sumnegative);

  /*  public static void areaOfCircle(){

    }*/
    }

    public static void areaOfCircle() {
        double pi = 3.142, area;
        System.out.println("enter Area of a Circle");
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();
        area = pi * radius * radius;

        System.out.println("Area of circle is :" + area);


    }

}
