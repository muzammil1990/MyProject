package com.volvo.java.ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayInDescendingOrder {

    public static void main(String[] args) {

        Integer[] arr = { 10, 9, 13, 11, 7, 8 }; // public final class Integer extends Number implements Comparable<Integer>
        Arrays.sort(arr, Collections.reverseOrder()); // it reverses the order  descending only bcoz reverseOrder() return type is comparator
                                                    //// public static <T> Comparator<T> reverseOrder()   and
                                                    // sort() method accepts only array and comparator as an argument.
                                                    //public static <T> void sort(T[] a, Comparator<? super T> c)
                                                    
        System.out.println(Arrays.toString(arr));
    }

}
