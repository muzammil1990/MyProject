/**
 * 
 */
package com.volvo.java.NumberProgram;

/**
 * second way of finding the missing no. BUT LEARN THE FIRST WAY
 */
public class FindMissingNo_Me {

    public static void main(String[] args) {

        int num = 12456;
        int a[] = new int[5];

        // convert int num into int array
        for (int i = 0; i < a.length; i++) {
            if (num != 0) {
                a[i] = num % 10;
                num = num / 10;
            }
        }

        // find the missing no in an array pg
        int arrLen = a.length;
        int sum = (arrLen + 1) * (arrLen + 2) / 2;

        for (int i = 0; i < arrLen; i++) {
            sum = sum - a[i];
        }
        System.out.println(sum);
    }
}
