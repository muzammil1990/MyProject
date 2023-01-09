package com.volvo.java.StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindMaximumRepeatedCharacters {

    public static void main(String[] args) {

        String s1 = "malayalam  malayalam";  // check this char are present in maps or not
        // and in maps this char will be treated as key since everything in maps are key, value pair

        LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (map1.containsKey(ch)) {  // map is empty at first, also every single string/word is treated as key in map
                map1.put(ch, map1.get(ch) + 1);  //dup key, so map will replace the old key and value pair with new one
            } else {
                map1.put(ch, 1);
            }
        }
        System.out.println(map1);

        int maxValue = 0;
        char maxKey = ' ';

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) { // to traverse in map, use entrySet()=converts into set
                                                                        // in set we can use iterator(), then finally while printing value 
                                                                      //need to use another interface map.entry= gives getKey() n getValue()
           
            if (entry.getValue() > maxValue) { // need to extract value only, so getValue()
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<Character, Integer>();
        map2.put(maxKey, maxValue);
        System.out.println(map2);

    }

}
