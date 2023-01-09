package com.volvo.java.NumberProgram;

public class ReverseANumber {

    public static void main(String[] args) {
        int num = 123;
       
        int reverse = 0;

        while (num != 0) {

            int remainder = num % 10;  
            num = num / 10;
            reverse = reverse * 10 + remainder;  //to check for ten's value place

        }
        System.out.println(reverse);

    }

}
