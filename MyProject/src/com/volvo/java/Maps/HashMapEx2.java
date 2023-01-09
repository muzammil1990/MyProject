/**
 * 
 */
package com.volvo.java.Maps;

import java.util.HashMap;
import java.util.Map;

import com.volvo.java.SysoExample1;

/**
 * 
 */
public class HashMapEx2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Mango"); // Put elements in Map
        hm.put(2, "Apple");
        hm.put(3, "Banana");
        hm.put(4, "Grapes");
        System.out.println(hm.containsKey(3));
        System.out.println(hm.containsValue("rahul"));

        System.out.println("no of elements in hashmap object  " + hm.size());

        System.out.println(hm);

         System.out.println("Iterating Hashmap...");
         for (Map.Entry i : hm.entrySet()) {                //Decalration: public Set<Map.Entry<K,V>> entrySet()
             System.out.println(i.getValue());
         System.out.println(i.getKey() + " " + i.getValue());  //throws illegalStateException when implemnetation is not given properly
         }
    }

}
