package com.volvo.java.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.volvo.java.SysoExample1;

public class Test {

    public static void main(String[] args) {

        String s1 = "ram sia ram jai ram jai jai ram";

        String s2[] = s1.split("\\s");

        LinkedHashMap<String, Integer> lm = new LinkedHashMap<String, Integer>();

        for (String s : s2) {
            if (lm.containsKey(s)) {
                lm.put(s, lm.get(s) + 1);
            }

            else {
                lm.put(s, 1);
            }
        }

        System.out.println(lm); // no of words

        //to find word which repeats max times
        String maxKey = "";
        int maxValue = 0;

        for (Map.Entry<String, Integer> me : lm.entrySet()) {

            if (me.getValue() > maxValue) {
                maxValue = me.getValue();
                maxKey = me.getKey();
            }
        }
        
        LinkedHashMap<String, Integer> lm2= new LinkedHashMap<String, Integer>();
        lm2.put(maxKey, maxValue);
        System.out.println(lm2);

    }
}
