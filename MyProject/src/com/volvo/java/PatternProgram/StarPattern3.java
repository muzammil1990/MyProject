/**
 * 
 */
package com.volvo.java.PatternProgram;

/**
 * Combine the logic1 and logic 2 of star1 and star2 pattern respectively and we get
 * 
 *      *
 *      **
 *      ***
 *      ****
 *      *****
 *      ****
 *      ***
 *      **
 *      *
 */
public class StarPattern3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= 5; i++) { // if we observe the pattern carefully in second half, row is printed 4 time only so i can i<=4 also
            for (int j = 4; j >= i; j--) { //col is run 4 times only i.e. 4, 3, 2, 1  - i=1
                System.out.print("*");     //                             4, 3, 2     - i=2
            }
            System.out.println();
        }

    }

}
