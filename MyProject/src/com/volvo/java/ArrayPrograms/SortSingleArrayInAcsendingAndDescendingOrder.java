package com.volvo.java.ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;

/**
 * for even no of elements
 */
public class SortSingleArrayInAcsendingAndDescendingOrder {

    public static void main(String[] args) {

        int a[] = { 10, 9, 6, 2, 30, 25, 15, 1, 11, 4 }; // size=10

        // 1.divide into two arrays
        int[] b = new int[a.length / 2]; // first array; //first half element
        int k = 0;

        for (int i = 0; i < a.length / 2; i++) {
            b[k++] = a[i];
        }

        Integer[] c = new Integer[a.length / 2]; // second array; //second half elements
        int l = 0;

        for (int j = a.length / 2; j < a.length; j++) {
            c[l++] = a[j];
        }
        // 2.sort both arrays
        Arrays.sort(b);
        Arrays.sort(c, Collections.reverseOrder());

        // 3.Merge the both arrays
        int[] finalArray = new int[b.length + c.length];
        int z = 0; // for index or position of finalArray's element

        for (int g : b) {
            finalArray[z++] = g;
        }
//        System.out.println("value of z after first loop:" + z);
        
        for (int f : c) {
            finalArray[z++] = f;
        }

        System.out.println(Arrays.toString(finalArray));
    }

}
