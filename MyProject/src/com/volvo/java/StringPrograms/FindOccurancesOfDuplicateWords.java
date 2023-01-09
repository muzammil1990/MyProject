package com.volvo.java.StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FindOccurancesOfDuplicateWords {
    public static void main(String[] args) {

        String s1 = "This is a test program is is program";

        String[] s2 = s1.split(" ");

//        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<String, Integer>();
        ConcurrentHashMap<String, Integer> wordCountMap =  new ConcurrentHashMap<String, Integer>();

        for (int i = 0; i < s2.length; i++) {
            if (wordCountMap.containsKey(s2[i])) {
                wordCountMap.put(s2[i], wordCountMap.get(s2[i]) + 1);
            } else {
                wordCountMap.put(s2[i], 1);
            }

        }
        System.out.println(wordCountMap);
        
//      LinkedHashMap<String, Integer> wordCount2 = new LinkedHashMap<String, Integer>();
//      wordCount2.putAll(wordCountMap);
        
         // using advance loop for iteration over Map.entrySet() 
        for (Map.Entry<String,Integer> entry : wordCountMap.entrySet()) { 
            if(entry.getValue() == 1){
                wordCountMap.remove(entry.getKey()) ;  //performing two operation concurrently/simultaneously/parallely/at the same time when getting the key and removing it
            }                        //that's why we get ConcurrentModicifcationException
        }                           //to remove this we need to use ConcurrentHashMap Class instead of LinkedHashMap
        
        System.out.println(wordCountMap);
    } 

    }


