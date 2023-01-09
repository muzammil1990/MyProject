/**
 * 
 */
package com.volvo.java.NumberProgram;

import java.util.Scanner;

/**
 * Second way: sum of given no.
 * LEARN SECOND WAY approach: 
 *                          first- convert given no into array 
 *                          Second- find the sum of elements in an array
 */
public class CountSumOfAGivenNumber_Me {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("enter 5 digit number or less");
        int num = scn.nextInt();

        // int num = 123;
        int a[] = new int[5];

        // converting a integer number into integer array
        for (int i = 0; i < a.length; i++) {
            if (num != 0) {
                a[i] = num % 10;
                num = num / 10;
            }
        }

     // converting a integer number into integer array
//        int i = 0;
//        while (num != 0) {
//            a[i] = num % 10;
//            num = num / 10;
//            i++;
//        }

        // now finding the sum of elements in arrays
        int sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum = sum + a[j];
        }
        System.out.print(sum);

    }
}
