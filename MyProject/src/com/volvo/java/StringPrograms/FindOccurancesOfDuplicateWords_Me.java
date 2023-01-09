package com.volvo.java.StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindOccurancesOfDuplicateWords_Me {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
        

        System.out.println(duplicateWords);
        
        System.out.println(duplicateWords.keySet());
    }

}
