package com.volvo.java.StringPrograms;

import java.util.Arrays;
/* The logic to achieve anagrams is-
   1. sort both the string in asc order. So that both strings can be compared and find out if anagram or not
   2. compare the sorted strings
*/
public class CheckingAnagrams_String {

    public static void main(String[] args) {

        String s1  = "silent";
        String s2 = "listen";
        
        char[] a = s1.toCharArray(); //converting into array bcoz Arrays class provides sorting method
        char[] b = s2.toCharArray();
        
        Arrays.sort(a);  //sorts the char as per ASCII value. //ascending order
        Arrays.sort(b);
        /* 
        Returns true if the two specified arrays of chars are equal to one another. 
        
        In other words, two arrays are equal if they contain the same elements in the same order.
        Also, two array references/address are considered equal, if both are null*/
     
        boolean result = Arrays.equals(a, b);
        
       /*The Boolean class wraps a value of the primitive type boolean in an object. 
         * An object of type Boolean contains a single field whose type is boolean. 
        In addition, this class provides many methods for converting a boolean to a String and a String to a boolean,
        as well as other constants and methods useful when dealing with a boolean.
*/
        
        if(result == true){
            System.out.println("Strings are anagrams");
        }else{
            System.out.println("Strings are not anagrams");
        }
    }

}
