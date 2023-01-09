package com.volvo.java.Maps;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx1 {

    public static void main(String[] args) {
        TreeMap t1 = new TreeMap();

        t1.put("name", "Tarkeshwar");
        t1.put("company", "Volvo");
        t1.put("profile", "QA");
//        t1.put(null, "Hero");  // null is not allowed
        t1.put("z", null);

        // System.out.println(t1);
        
        // System.out.println(t1.get("name")); //output= print only value but not key

        Set s = t1.entrySet();  //converting treemap into set
                                   // sorts result on the basis of key not value
        Iterator i= s.iterator();
        
        while(i.hasNext()){
           System.out.println(i.next()); 
        }

    }

}
