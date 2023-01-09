/**
 * 
 */
package com.volvo.java.ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;

import com.volvo.java.SysoExample1;

/**
 * for odd no of elements
 */
public class SortSingleArrayInAscsendingAndDescendingOrder_OddElement {
    public static void main(String[] args) {

        int[] a = { 10, 60, 50, 40, 25, 35, 80, 55, 34 };
        Integer[] c;

        int n = a.length;

        int[] b = new int[n / 2]; // b[4]
        int k = 0; // for position

        if (n % 2 == 0)
            c = new Integer[n / 2];
        else
            c = new Integer[(n / 2) + 1]; // c[5]
        int l = 0; // for position

        for (int i = 0; i < n / 2; i++) {
            b[k++] = a[i];
        }
        for (int j = n / 2; j < n; j++) {
            c[l++] = a[j];
        }

        System.out.println("both arrays are prepared and are- ");
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        Arrays.sort(b);
        Arrays.sort(c, Collections.reverseOrder());
        System.out.println();

        int[] finalArray = new int[b.length + c.length];
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
