package com.volvo.java.ArrayPrograms;

import java.util.Arrays;

//o/p:- When merge two arrays then o/p {10,20,30,40,50,60}

//rules:
//to print the array using advance for loop throws error. Have to use traditional for loop or Arrays.toString to print the array

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] a = { 10, 20, 30 };
        int[] b = { 40, 50, 60 };

        // we know array size does not increase in runtime so next step- logic to increase the size of array

        int[] c = new int[a.length + b.length];

        int k = 0; // for index or position of array's element

        for (int i : a) {
            c[k++] = i;   // k=0,1,2,3
        }

        for (int i : b) {
            c[k++] = i;  // k=3,4,5,6
        }
        System.out.println(Arrays.toString(c)); // to print the array without using for loop and converts the array in string
    }

}
