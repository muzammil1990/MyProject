package com.volvo.java.StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharsFromSentence {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s1 = "this was a test program was was program to ";

        char[] ch = s1.toCharArray();

        LinkedHashSet<Character> st = new LinkedHashSet<Character>();
        for (char c : ch) {
            st.add(c);
        }

        
        //to print the characters in set use advance for loop or use iterator()
        for (char c : st) {
            System.out.print(c + " ");
        }

    }

}
