package com.volvo.java.NumberProgram;

import java.util.Scanner;

public class CountNoOfDigits {

    public static void main(String[] args) {
        // int n = 15;

        System.out.println("enter a number");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int count = 0;

        while (num != 0) {
            // num = num / 10;
            num /= 10;
            ++count;
        }
        System.out.println("no of digits are-  " + count);

    }

}
