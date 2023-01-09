package com.volvo.java.StringPrograms;

import java.util.LinkedHashMap;

public class FindOccurancesOfCharacters {

    public static void main(String[] args) {
        String s1 = "tatanagar tatanagar"; // check this characters are present in maps or not
        // and in maps this characters will be treated as key since everything in maps are key, value pair(entry)

        LinkedHashMap<Character, Integer> countCharacter = new LinkedHashMap<Character, Integer>();

        for(int i = 0; i < s1.length(); i++) {
            
            if (countCharacter.containsKey(s1.charAt(i))) {  // map is empty at first, also every single string/word is treated as key in map
                countCharacter.put(s1.charAt(i), countCharacter.get(s1.charAt(i)) + 1); //dup key, so map will replace the old key and value pair with new one
            } 
            
            else {
                countCharacter.put(s1.charAt(i), 1);
            }
        }
        System.out.println(countCharacter);

    }

}
