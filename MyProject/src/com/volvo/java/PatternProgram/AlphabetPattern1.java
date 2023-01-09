/**
 * 
 */
package com.volvo.java.PatternProgram;

/**      solve using star1 logic and ascii value i.e column is dependent of row value
 *  A
 *  A B
 *  A B C
 *  A B C D
 *  A B C D E
 *  A B C D E F
 */
public class AlphabetPattern1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       
        int uppercase = 65;
        for(int i=0; i<=5; i++){
            
            for(int j=0; j<=i; j++){
                System.out.print((char)(uppercase+j)+ " ");  //typecasting ( int -> char = overflow or narrowing?? )
            }
            System.out.println();
        }
        
        System.out.println();
        
        int lowercase = 97;
        for(int i=0; i<=5; i++){
            
            for(int j=0; j<=i; j++){
                System.out.print((char)(lowercase+j)+ " ");  //typecasting ( int -> char = overflow or narrowing?? )
            }
            
            System.out.println();
        }
        
    }

}
