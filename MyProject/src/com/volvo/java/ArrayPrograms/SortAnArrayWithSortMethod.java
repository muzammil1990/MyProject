package com.volvo.java.ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArrayWithSortMethod {

    public static void main(String[] args) {

        Integer[] a = { 10, 9, 13, 11, 7, 8 };
        System.out.println(a.length);
//        int b[] = { 10, 9, 13, 0, 11, 7, 8, -2, 30 }; this data type can also be sorted without using wrapper class.

//         Arrays.sort(a); //by default sorts in ascending order
         Arrays.sort(a, 0, a.length / 2);

        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b)); 
    }

}
