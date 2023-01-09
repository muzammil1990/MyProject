package com.volvo.java.StringPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateWordsFromSentence { //unique words

    public static void main(String[] args) {
        String s1 = "This was a test program was was program to ";

        String[] strArr = s1.split(" ");   //  s1.split("\\s");

        LinkedHashSet<String> set = new LinkedHashSet<String>();

        for (String s : strArr) {
            set.add(s);
        }

        
 //to print the characters/String in set use advance for loop or use iterator()
        
        for (String temp : set) {
            
            System.out.print(temp + " " );
        }
        
        
     // Iterator<String> it = set.iterator();
       
        // while (it.hasNext()) {
        		// System.out.print(it.next()+ " ");
        // }

    }

}
