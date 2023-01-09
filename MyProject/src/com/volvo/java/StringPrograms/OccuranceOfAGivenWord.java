package com.volvo.java.StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfAGivenWord { // any word which is given , have to find out how many times it had repeated itself in string

    public static void main(String[] args) {
        String s1 = "I am learning Java Selenium Because Selenium is required for web automation Selenium Selenium";
        
        String[] s2 = s1.split(" ");
        Map<String, Integer> count = new LinkedHashMap<String, Integer>();
        
        for(String s : s2){
            if(count.containsKey(s)){
                count.put(s, count.get(s)+1);
            }
            else{
                count.put(s, 1);
            }
        }
        System.out.println(count);
        
        Map<String, Integer> finalCount = new LinkedHashMap<String, Integer>();
        
        for(Map.Entry<String, Integer> entry: count.entrySet()){
            if(entry.getKey().equals("Selenium")){
                finalCount.put(entry.getKey(), entry.getValue());
                
            }
        }
        System.out.println(finalCount);

    }

}
