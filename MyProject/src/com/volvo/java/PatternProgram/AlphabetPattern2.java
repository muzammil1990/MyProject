package com.volvo.java.PatternProgram;

/* A
   B B
   C C C
   D D D D
   E E E E E
   F F F F F F
*/
public class AlphabetPattern2 {

    public static void main(String[] args) {
        
        int uppercase=65, lowercase=97;
        
        for(int i=0; i<=5 ; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)uppercase + " "); //typecasting int to char
            }
            uppercase++;
            System.out.println();
        }
        
        System.out.println();
        
        for(int i=0; i<=5 ; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)lowercase + " ");
            }
            lowercase++;
            System.out.println();
        }
    }
}
