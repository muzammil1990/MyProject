package com.volvo.java.StringPrograms;

import java.util.Arrays;

/* The logic to achieve anagrams is-
   1. sort both the string
   2. compare the sorted strings
*/
public class CheckingAnagrams_Sentence {

    public static void main(String[] args) {

        String s1 = "He is Silent";
        String s2 = "Is he Listen";

        //reinitialize
        s1 = s1.trim().replace(" ", "").toLowerCase();
        s2 = s2.trim().replace(" ", "").toLowerCase();

        char[] a = s1.toCharArray();      //converting into array bcoz Arrays class provides sorting method
        char[] b = s2.toCharArray();       

        Arrays.sort(a);  //sorts the char as per ASCII value. //ascending order
        Arrays.sort(b);
        
        /* 
        Returns true if the two specified arrays of chars are equal to one another. 
        
        In other words, two arrays are equal if they contain the same elements in the same order.
        Also, two array references are considered equal if both are null*/
        boolean result = Arrays.equals(a, b);

        if (result == true) {     //if (result.equals(true))
            
            System.out.println("Sentences are anagrams");
        } else {
            System.out.println("Sentences are not anagrams");
        }
    }

}
