package com.company;

import com.company.oop.assignmentOne.Movie;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 3, 5, 9, 2};
        int[] arr2 = {1, 2, 3, 4, 5, 13, 88, 99, 778};

        //
        getArraySortedByBuubleSort(arr);
       // System.out.println(linearSearch(arr2, 88));
        /*
            getArraySortedBySelectionSort();

          getSortsArray();
         System.out.println(getSummition(arr));
      System.out.println(getNumOfElements(arr));
      System.out.println(getMax(arr));
      System.out.println(getMin(arr));
      System.out.println(getCalculateEvenNumbers(arr));
      System.out.println(count2(arr));;
      countGeneral();
 getSortsArray();

     // binary search   selection sort  binary search and linear search
*/
    }


    private static int getSummition(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int getNumOfElements(int[] arr) {
        return arr.length;
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int getMin(int[] arr) {
        int min = arr[0];//It is not possible to set a initial value of int min by zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {//if value of int min by zero , He only came here for him
                min = arr[i];
            }
        }
        return min;
    }

    private static String getCalculateEvenNumbers(int[] arr) {
        int sum = 0;
        int sumEvenNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
                sumEvenNumber++;
            }
        }
        System.out.println("even number is = " + sumEvenNumber + " numbers ");
        return "sum even numbers is = " + sum;
    }

    private static int count2(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                counter++;
            }
        }
        return counter;
    }

    private static void countGeneral() {
        int[] arr = {1, 2, 3, 1, 3, 6};
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            boolean exist = false;
            for (int j = 0; j < i; j++) { //if item exist before in before index in array?
                if (arr[i] == arr[j]) {
                    exist = true;
                }
            }
            if (exist == true) continue; // skip item and dont continue code , else contienue code
            for (int j = 0; j < arr.length; j++) {//compared one item with all items
                if (arr[j] == arr[i]) { //if one item equal any items
                    counter++;
                }
            }
            System.out.println(arr[i] + " ---> " + counter);
        }
    }

    private static void getArraySortedBySelectionSort(int[] arr) {
///int[] arr = {2, 4, 6, 1, 3, 5, 9, 2};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            // ال i+1  لكي يتجاهل كل قيمه في اول المصفوفه والتي رتبها من قبل فلا يحتاج  فحصها مجددا
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { //لو القيمه اللوب الداخليه arr[j] اقل من  باقي اللوب الخارجيه arr[i]
                    temp = arr[i];  //  اجعل اقل عنصر(temp )  تساوي العنصر الحالي وهو الاقل
                    arr[i] = arr[j];//بدل العنصصر الجديد والاقل بالعنصر الحالي
                    arr[j] = temp; //  واجل الحالي والاقل  هو البدايه والتي تزيد كل مره في السطر(107)
                }
            }
        }
        //print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    private static void getArraySortedByBuubleSort(int[] arr) {
//  {2, 4, 6, 1, 3, 5, 9, 2};
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    swipe(arr, i, i + 1);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return 1;
    }


    public static void swipe(int[] arr, int old, int neW) {
        int temp = arr[old]; //  احفظ قيمه القديمه
        arr[old] = arr[neW]; // ضيف القيمه الجديده مكان القديمه
        arr[neW] = temp;     //  ضيف القيمه القديمه مكان الجديده
    }



}







