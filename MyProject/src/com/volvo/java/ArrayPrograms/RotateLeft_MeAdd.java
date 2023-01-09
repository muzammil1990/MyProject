/**
 * 
 */
package com.volvo.java.ArrayPrograms;

import java.util.Arrays;

/**
 * In the left rotation, each element of the array will be shifted to its left by one position and the first element 
 * of the array will be added to end of the list. This process will be followed for a specified number of times
 */
public class RotateLeft_MeAdd {

    public static void main(String[] args) {
        
        int a[] = { 10, 20, 30, 40, 50 };

        System.out.println("orignal array:-");
        System.out.println(Arrays.toString(a));

        int n = 2; // rotate array # times
        for (int i = 0; i < n; i++) {

            int first, j;
            first = a[0]; // storing first element of array; then think first location of array a[0] i.e. empty now

            for (j = 0; j < a.length - 1; j++) { // bcoz rest of the element is only four so need to shift only those four elements

                a[j] = a[j + 1]; // when we do this step, then second index of array a[1] is empty, so need to shift 3rd index 
                                 // element into 2nd index and so on
            }

            a[j] = first;
        }
        System.out.println("\n");
        System.out.println("post rotation array is:- ");
        for (int temp : a) {
            System.out.print(temp + " ");
        }

    }
}
