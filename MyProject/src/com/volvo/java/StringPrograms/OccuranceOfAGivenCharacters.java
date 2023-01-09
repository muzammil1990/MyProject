package com.volvo.java.StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfAGivenCharacters {

    public static void main(String[] args) {

        String s = "My name is oomuzammil";

        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {

            if (charCount.containsKey(s.charAt(i))) {
                charCount.put(s.charAt(i), charCount.get(s.charAt(i)) + 1);
            } else {
                charCount.put(s.charAt(i), 1);
            }
        }

        System.out.println(charCount);

        LinkedHashMap<Character, Integer> vowelCount = new LinkedHashMap<Character, Integer>();

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {

            if (entry.getKey().equals('a') || entry.getKey().equals('e') || entry.getKey().equals('i') || entry.getKey().equals('o')
                    || entry.getKey().equals('u')) {
                vowelCount.put(entry.getKey(), entry.getValue());
            }

        }

        System.out.println(vowelCount);
    }
}
