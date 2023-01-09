package com.volvo.java.ArrayPrograms;

import java.util.Arrays;

import java.util.Collections;

//rules:
//to print the array using advance for loop throws error. Have to use traditional for loop or Arrays.toString to print the array
/**
 * for odd no of elements and even both
 */
public class SortSingleArrayInHalfAscendingHalfDescending_Me {

    public static void main(String[] args) {

        int[] a = { 5, 4, 3, 2, 10, 20, 30, 40, 50 }; // size=9

        // 1.divide into two arrays
        int b[] = new int[a.length / 2];
        int k = 0;

        Integer c[];
        int l = 0;

        if (a.length % 2 == 0) // odd or even logic
            c = new Integer[a.length / 2]; // size of array c=even no ; //int c[]= new int[4];
        else
            c = new Integer[(a.length / 2) + 1]; // size of array c=odd no ; //int c[]= new int[5];

        for (int i = 0; i < a.length / 2; i++) { // first array; //first half element
            b[k++] = a[i]; // b= 5,4,3,2
        }

        for (int i = a.length / 2; i < a.length; i++) { // second array; //second half elements
            c[l++] = a[i]; // c= 10,20,30,40,50
        }

        System.out.println("both arrays are prepared and are- ");
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        // 2.sort both arrays
        Arrays.sort(b); // by default in ascending order
        Arrays.sort(c, Collections.reverseOrder()); // descending order using built in methods

        // 3.Merge the both arrays
        int finalArray[] = new int[b.length + c.length];
        int z = 0;

        for (int i : b) {
            finalArray[z++] = i;
        }

        for (int i : c) {
            finalArray[z++] = i;
        }

        System.out.println("final array- " + Arrays.toString(finalArray));
    }
}