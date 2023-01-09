/**
 * 
 */
package com.volvo.java.PatternProgram;

/**
 *  ----*
 *  ---**
 *  --***
 *  -****
 *  *****
 */
public class StarPattern4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){
            
            for(int j=4; j>=i; j-- ){ // in first row have to print 4 spaces so j is 4 
                System.out.print(" ");
            }
            
            for(int k=1; k<=i; k++){ // in the same first row have to print one star then in second row two star and so on
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

}
