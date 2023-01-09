package com.volvo.java.Maps;

import java.util.HashMap;
import java.util.Hashtable;

// random order(insertion order is not maintained)
public class HashMapEx1 {

    public static void main(String[] args) {
        HashMap h1 = new HashMap();
        
        Hashtable ht= new Hashtable();
        
        h1.put("name", "muzammil");
        h1.put("company", "Volvo");
        h1.put("profile", "QA");
        h1.put(null, null);
        h1.put(null, null);
        h1.put(2, null);
        h1.put(50, null);
        h1.put(2, 80);
        h1.put(3, null);
        h1.put("newProfile", "QA");
        System.out.println(h1.containsKey(50));
        System.out.println(h1.containsValue("rahul"));
        
//        System.out.println("total element in hashmap class " + h1.size() + "\n");
//
        System.out.println(h1 + "\n"); // proves all the hashmap properties

        System.out.println(h1.get("name"));
    }

}
