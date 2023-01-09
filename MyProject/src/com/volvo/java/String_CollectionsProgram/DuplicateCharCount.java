package com.volvo.java.String_CollectionsProgram;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DuplicateCharCount {

    public static void main(String[] args) {

        String s = "tatanagar";

        ConcurrentHashMap<Character, Integer> l = new ConcurrentHashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (l.containsKey(ch)) {

                l.put(ch, l.get(ch) + 1);
            } else {
                l.put(ch, 1);
            }

        }

        System.out.println(l);

        for (Map.Entry<Character, Integer> entry : l.entrySet()) {
            
            if(entry.getValue() == 1){
                l.remove(entry.getKey());
            }

        }
        System.out.println(l);
        
    }

}
