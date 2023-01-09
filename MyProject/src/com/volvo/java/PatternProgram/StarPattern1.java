/**
 * 
 */
package com.volvo.java.PatternProgram;

/**
 * approach; the col should always be less or equal to row then only print star
 * row is always fixed and will keep increasing
 * 
 * column is dependent of row value
     *
     **
     ***
     ****
     *****
  
 */
public class StarPattern1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub5

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }

    }

}
