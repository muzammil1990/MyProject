package com.volvo.java.PatternProgram;

public class Test {

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
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
