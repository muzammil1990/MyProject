package com.volvo.java.ArrayPrograms;

import java.util.Arrays;

//bigger to smaller
public class SortArrayWithoutSortMethodInDescendingOrder{

    public static void main(String[] args) {
        int[] a = { 10, 9, 13, 11, 7, 8 };
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[j] > a[i]) { // if second element is bigger than the first element than swap; descending order
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length-2]); //second smallest element
    }

}
