package com.volvo.java.String_CollectionsProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfCharacters {

    public static void main(String[] args) {

        String s1 = "seleniumsmu"; // check this char are present in maps or not
                                  // and in maps this char will be treated as key since everything in maps are key, value pair

        LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }
        System.out.println(map1);
        
//        for (Map.Entry<Character, Integer> me : lm.entrySet()) {  //converting map into Set. 
//            System.out.println(me.getKey() + "  " + me.getValue());
//        }
    }

}
