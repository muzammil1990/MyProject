package com.volvo.java.NumberProgram;

public class CountSumOfAGivenNumber_Me2 {

    public static void main(String[] args) {
        int num = 123, sum = 0, digit = 0;

        while (num != 0) {

            digit = num % 10;
            num = num / 10;       //  num/=10
            sum = sum + digit;    //   sum+=digit
        }

        System.out.println(sum);
    }
}
