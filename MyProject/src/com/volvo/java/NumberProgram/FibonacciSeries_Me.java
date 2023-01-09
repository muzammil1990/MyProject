/**
 * 
 */
package com.volvo.java.NumberProgram;

/**
 * seocond way: pg to show fibonacci series; LEARN SECOND WAY
 * 
 * 0 1 1 2 3 5 8 13 21 34 .........
 */
public class FibonacciSeries_Me {

    public static void main(String[] args) {

        int num = 6, a = 0, b = 1, c = 0;

        for (int i = 0; i < num; i++) {

            System.out.print(a + "  "); // print only first no.
            c = a + b;
            a = b;
            b = c; // logic; result has to become 2nd no; and 2nd no. has to become 1st no.

        }
    }

}
