package com.volvo.java.NumberProgram;

import java.util.Scanner;

/*
To prove whether a number is a prime number, first try dividing it by 2, 
and see if you get a whole number. If you do, it can't be a prime number.
*/
public class PrimeNumberCheck {

   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int count=0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                ++count;
            }
        }
        
        if(count==0){
            System.out.println("prime");
        }
        
        else{
            System.out.println("not a prime");
        }
    }
}
