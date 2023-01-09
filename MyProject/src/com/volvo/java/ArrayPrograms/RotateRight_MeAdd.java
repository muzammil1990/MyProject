package com.volvo.java.ArrayPrograms;

import java.util.Arrays;

public class RotateRight_MeAdd {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 }; // 5,1,2,3,4
        
        System.out.println("orignal array:-");
        System.out.println(Arrays.toString(a));

        int n = 1;

        for (int i = 0; i < n; i++) {
            
            int last = a[a.length - 1];
            int j; // 4,3,2,1
            
            for (j = a.length - 1; j > 0; j--) {  // 0>0 ,  = no loop fails at last index which is 0
                a[j] = a[j - 1];
            }
            a[j] = last;
        }
        
        System.out.println("\n");
        System.out.println("post rotation array is:- ");

        System.out.println(Arrays.toString(a));
    }
}
