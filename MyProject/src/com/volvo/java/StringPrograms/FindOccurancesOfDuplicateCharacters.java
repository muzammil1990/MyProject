package com.volvo.java.StringPrograms;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FindOccurancesOfDuplicateCharacters {

    public static void getDuplicateChar(String s) {

        ConcurrentHashMap<Character, Integer> duplicateChar = new ConcurrentHashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (duplicateChar.containsKey(s.charAt(i))) { // map is empty at first, also every single Char is treated as key in map
                duplicateChar.put(s.charAt(i), duplicateChar.get(s.charAt(i)) + 1); //dup key, so map will replace the old key and value pair
            } else {
                duplicateChar.put(s.charAt(i), 1);
            }
        }
        
        System.out.println(duplicateChar);
      
      //Declaration: public Set<Map.Entry<K,V>> entrySet()
        for (Map.Entry<Character, Integer> entry : duplicateChar.entrySet()) { // to traverse in map, use entrySet()=converts into set
            if (entry.getValue() == 1) {
                duplicateChar.remove(entry.getKey()); //performing two operation concurrently/simultaneously/parallely/at the same time when getting the key and removing it
            }                       //that's why we get ConcurrentModicifcationException
        }                           //to remove this we need to use ConcurrentHashMap Class instead of LinkedHashMap    
        System.out.println(duplicateChar);

    }

    public static void main(String[] args) {
        getDuplicateChar("tatanagar");
    }

}
