package com.volvo.java.ArrayPrograms;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] a = { 1,2,3,5,6 };

        int arrLen = a.length;
        int sum = (arrLen + 1) * (arrLen + 2) / 2; // to find sum in missing array
                                                   // (n+1) *(n+2)/ 2
        System.out.println(sum);

        //traditional for loop
        for (int i = 0; i < arrLen; i++) {
            sum = sum - a[i];
        }
        System.out.println(sum);                   // find the sum generally in array
                                                  // n *(n+1)/2 
    }

}
