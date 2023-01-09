package com.volvo.java.NumberProgram;

import java.util.Scanner;

public class ReverseANumberSecondWay_Me {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the 5 digit number");
        int num = scn.nextInt();

        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = num % 10;
            num = num / 10;
        }
        
        System.out.println("Reversed no is:- ");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]);
        }
    }

}
