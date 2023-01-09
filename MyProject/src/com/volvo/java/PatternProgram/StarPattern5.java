/**
 * 
 */
package com.volvo.java.PatternProgram;

/**
 *  ----*
 *  ---**
 *  --***       // adding space in front of * we get pyramid pattern which is the below pattern
 *  -****
 *  *****
 *  
 *  
 *      *
 *  ---* *
 *  --* * *
 *  -* * * *
 *  * * * * *
 *  
 */
public class StarPattern5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for(int i=1; i<=5; i++){
            
            for(int j=4; j>=i ; j--){
                System.out.print(" ");
            }
            
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            
            System.out.println();
        }
    }

}
