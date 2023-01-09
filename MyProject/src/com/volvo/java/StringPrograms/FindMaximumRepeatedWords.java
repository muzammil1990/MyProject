package com.volvo.java.StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

/*approach: 1. find no of words 
            2. then find the word repeated max number of times */

public class FindMaximumRepeatedWords {

    public static void main(String[] args) {

        String s1 = "ram sia ram jai ram jai jai ram";

        String[] s2 = s1.split(" ");// check this words are present in maps or not
        // and in maps this words will be treated as key since everything in maps are key, value pair

        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<String, Integer>();  //insertion order is preserve

        for (String s : s2) {
            if (map1.containsKey(s)) {  // map is empty at first, also every single string/word is treated as key in map
                map1.put(s, map1.get(s) + 1); //dup key, so map will replace the old key and value pair with new one
            } else {
                map1.put(s, 1);
            }
        }  // output= ( key , value ) pair
       
        System.out.println(map1); //no. of words
        
        
//to find word which repeats max times      
        String maxKey = "";
        int maxValue = 0;
        
      //Declaration: public Set<Map.Entry<K,V>> entrySet()
        for(Map.Entry<String, Integer> entry : map1.entrySet()){ // to traverse in map, use entrySet()=converts into set; It returns both keys and values
                                                               // in set we can use iterator(), then finally while printing value 
                                                               //need to use another interface map.entry= gives getKey() n getValue()
          
            //logic to print max value  
            if(entry.getValue() > maxValue){   // need to extract value only, so getValue()
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<String, Integer>(); //we can use hashmap here since only key and value will be present as max value and key
        map2.put(maxKey, maxValue);
        System.out.println(map2);
        
    }

}
