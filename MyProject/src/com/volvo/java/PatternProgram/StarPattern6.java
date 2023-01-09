package com.volvo.java.PatternProgram;

// solved by me only.

// approach is same as star pattern 3; Combine the logic of Star4 and Star5 

public class StarPattern6 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= 5; i++) {
            
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");   // add space first and then print 4 stars with space
            }
            
            for (int j = 4; j >= i; j--) {
                System.out.print(" *");
            }
            
            
            System.out.println();
        }
        
    }
}
