package com.volvo.java.StringPrograms;

import java.util.LinkedHashMap;

public class FindOccurancesOfWords {

    public static void main(String[] args) {

        String s1 = "I am going to Learn Selenium to get a Automation Test Engineer Job";

        String[] s2 = s1.split(" "); // check this words are present in maps or not
        // and in maps this words will be treated as key since everything in maps are key, value pair


        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<String, Integer>();

        for (int i = 0; i < s2.length; i++) {
            if (wordCount.containsKey(s2[i])) {  // map is empty at first, also every single string/word is treated as key in map
                wordCount.put(s2[i], wordCount.get(s2[i]) + 1); //dup key, so map will replace the old key and value pair with new one
            } else {
                wordCount.put(s2[i], 1);
            }

        }
        System.out.println(wordCount);

    }

}
