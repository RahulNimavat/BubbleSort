/*
     Title: Bubble Sort

     Author: Rahul Nimavat

     Date: 07/07/2018

     Time: 22:05 pm

 */
// <============================== ABOUT BUBBLE SORT =======================================================================================>
// In Bubble Sort each element is compared with it's adjacent element and swaps them, if they are in the wrong order.
// It has WorstCase Complexity and AverageCase Complexity, both of O(N2).
//Stable Sorting Algorithm.
// It is an In-place Algorithm -> It does need any additional Memory.

import  java.util.Scanner;

public class BubbleSort {

    public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);


            System.out.println("Enter The Size of an ARRAY");
            int sizeOfArray = sc.nextInt();


            int mArray[] = new int[sizeOfArray+1];

            System.out.println("<===============================================================================================================================================================================>");


             System.out.println("Enter the Elements in the Array");

            for(int i =0;i<mArray.length-1;i++){
                    mArray[i] = sc.nextInt();
            }

            int[] SortedArray = BubbleSortFunc(mArray);


            System.out.println("Elements in the Array After Sorting");

            System.out.println("<===============================================================================================================================================================================>");

        //System.out.println(SortedArray[]);
            printArray(SortedArray);

        System.out.println("<===============================================================================================================================================================================>");

        System.out.println(" \u00a9 " + " Rahul Nimavat ");

    }

                public static int[] BubbleSortFunc(int[] mArray) {

                            int[] swapfunc = {};

                            for (int i = 0; i <mArray.length - 1; i++) {

                                    for (int j = i + 1; j <=mArray.length - 1-1; j++) {

                                            swapfunc = Swap(mArray, i, j);

                                    }

                            }
                            return swapfunc;

                }

                public static int[] Swap(int[] mArray, int i, int j) {


                            if (mArray[i] > mArray[j]) {

                                   int temp = mArray[i];

                                    mArray[i] = mArray[j];

                                    mArray[j] = temp;

                             }

                            return mArray;


                }

                public  static void printArray(int[] SortedArray){

                        for (int i = 0;i<SortedArray.length-1;i++){

                            System.out.println(SortedArray[i]);
                        }

                }


}
