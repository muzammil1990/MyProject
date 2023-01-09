package com.volvo.java.StringPrograms;

import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {

		String str = "John Doe";

		char ch[] = str.toCharArray();

		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for (char temp : ch) {
			
			if (!lhs.add(temp)) {
				System.out.println(temp);
			}
		}
		
		
		
		
		String s1 = "This is a test program is is program";

        String[] s2 = s1.split(" ");

        LinkedHashMap<String, Integer> wordCountMap = new LinkedHashMap<String, Integer>();

        for (int i = 0; i < s2.length; i++) {
            if (wordCountMap.containsKey(s2[i])) {
                wordCountMap.put(s2[i], wordCountMap.get(s2[i]) + 1);
            } else {
                wordCountMap.put(s2[i], 1);
            }

        }
       System.out.println(wordCountMap);

        LinkedHashMap<String, Integer> duplicateWords = new LinkedHashMap<String, Integer>();

        // using advance loop for iteration over Map.entrySet()
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateWords.put(entry.getKey(), entry.getValue());
            } 
        }
        

        System.out.println(duplicateWords.keySet());
	}
}
