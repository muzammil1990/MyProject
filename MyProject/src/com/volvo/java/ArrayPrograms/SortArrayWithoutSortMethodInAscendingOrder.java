package com.volvo.java.ArrayPrograms;

import java.util.Arrays;

// smaller to bigger
public class SortArrayWithoutSortMethodInAscendingOrder {

    public static void main(String[] args) {
        int[] a = { 10, 9, 13, 11, 8, 7 };
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < a[i]) { // swaping logic ; if second element is smaller than first element than swap
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length - 2]); // second highest element
    }

}
