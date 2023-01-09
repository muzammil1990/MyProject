/**
 * 
 */
package com.volvo.java.Scanner;

import java.util.Scanner;

/**
 * 1. scanner is final class; used for user input at runtime 
 * 2. Resides inside java.util package. Import is mandatory 
 * 3. Scanner class has multiple methods for diff datatypes
 * 4. BufferedReader class is same as Scanner class for strings 
 */
public class ScannerEx1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("enter a num");
        int n = scn.nextInt();
        System.out.println(n);

        System.out.println("enter a String- one word");
        String s1 = scn.next();
        System.out.println(s1);

        

        System.out.println("enter a decimal value");
        double d = scn.nextDouble();
        System.out.println(d);

        //special case: nextLine()
        System.out.println("enter a String- line");
        scn.nextLine(); // consumes the new line character.
        String s2 = scn.nextLine();
        System.out.println(s2);
        
        System.out.println("enter a boolean value");
        boolean b = scn.nextBoolean();
        System.out.println(b);

        System.out.println("enter a char");
        String s = scn.next();
        
        System.out.println(s.charAt(0));
        
          /*  
            byte= nextByte();
            short= nextShort();
            BigDecimal = nextBigDecimal();
            BigInteger = nextBigInteger();
            float= nextFloat();
            long= nextLong();
            
            
            Note:  
            String input can quickly be taken from the user if the buffer is free,i.e., there is only string input
            at the very start of the code. But what if not? If there is any other method before the string method
            that could be nextInt() or nextFloat() or any nextXxx() method, then nextLine() would be skipped.
            
            also to understand better
            
            If you use the nextLine() method immediately following the nextInt() method, 
            rememeber nextInt() reads integer tokens; and sc.nextLine() is skipped
            That’s because the sc.nextInt() method does not read the newline character in your input created by hitting “Enter,” 
            and so the call to sc.nextLine() returns after reading that newline.
            
            It is the major drawback of Scanner Class. It is not the case in the BufferedReader class. 
            It’s the significant difference in bufferreader vs. scanner class in java
            
         */
        
        /*
        The BufferedReader class is meant to read stream or text data, 
        while the Scanner class is intended to both read and parse the test data into primitive types
        */
        
        
    }
}
