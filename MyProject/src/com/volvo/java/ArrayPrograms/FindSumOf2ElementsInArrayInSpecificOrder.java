package com.volvo.java.ArrayPrograms;

//Q:Given an array arr[] of integers, find out the maximum difference between any two elements
//such that larger element appears after the smaller number. 

/*Input : arr = {2, 3, 10, 6, 4, 8, 1}
Output : 8
Explanation : The maximum difference is between 10 and 2*/

public class FindSumOf2ElementsInArrayInSpecificOrder {

    public static void main(String[] args) {

        int[] arr = { 2, 1, 3, 10, 6, 4, 8 };
    	
//    	int [] arr = {2, 3, 10, 6, 4, 8, 1};
    	
        int max = Integer.MIN_VALUE;
        int diff = 0, smallNo = 0, bigNo = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                
                if (arr[i] < arr[j]) { // arr[j] has to be larger no than arr[i] as per question or else 10 - 1= 9 the max difference which in wrong as per question.
                    diff = arr[j] - arr[i];
                    
                    if (diff > max) {
                        max = diff;
                        smallNo = arr[i]; //capture this moments arr[i] and arr[j] as they keep changing as per loop
                        bigNo = arr[j];
                    }
                }
            }
        }

        System.out.println("Diff between small no " + smallNo + "  and big no " + bigNo + " is: " + max);

    }
}
