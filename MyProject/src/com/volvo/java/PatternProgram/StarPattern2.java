package com.volvo.java.PatternProgram;
/*
     *****
     ****
     ***
     **
     *
*/

//approach: Row is always fixed. Row will start with 1 and keep increasing but this time only
// column should decrease from 5 to 1

public class StarPattern2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) { 
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
