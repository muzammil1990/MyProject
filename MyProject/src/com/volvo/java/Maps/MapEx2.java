package com.volvo.java.Maps;

import java.util.HashMap;
import java.util.Map;

// this class used to print the values in map using: Generic (New Style)
// pg to show- to retrieve the values in map using advance for loop and dedicated method get()
public class MapEx2 {

     
    public static void main(String[] args) {

      //to use entrySet method, map has to accept elements in key(integer) and value(String) pair
        Map<Integer, String> map = new HashMap<Integer, String>(); 
        
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
       System.out.println(map.containsKey(102));
       System.out.println(map.containsValue("rahul"));
       System.out.println(map.containsValue("Rahul"));
        
        // Elements can traverse in any order 
        
       // Converting map to Set: using entrySet()
        
//        entrySet: to use entrySet method, map has to accept elements in key(integer) and value(String) pair
        
        for (Map.Entry me : map.entrySet()) {  //Decalration: public Set<Map.Entry<K,V>> entrySet()

            System.out.println(me.getKey() + " " + me.getValue());
        }
        
//            System.out.println(map);
            
            System.out.println(map.get(101));  // dedicated method to print value of a specific key
    }

}
