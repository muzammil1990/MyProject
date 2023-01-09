package com.volvo.java.Maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

//insertion order is preserved(maintains insetion order)
public class LinkedHashMapEx1 {

    public static void main(String[] args) {

        LinkedHashMap l1 = new LinkedHashMap();

        l1.put("name", "Tarkeshwar");
        l1.put("company", "Volvo");
        l1.put("profile", "QA");
        l1.put("name", "Muzi");
        l1.put(null, null);
        l1.put(null, null);

        System.out.println(l1);
        System.out.println();

        System.out.println(l1.get("name"));  //get() method takes only key and prints only value
        System.out.println();

        Set s1 = l1.keySet(); // Gives only key in the output
        Iterator i1 = s1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());

        }

        System.out.println();
        
        Set s2 = l1.entrySet(); // Gives key and value both in the output
        Iterator i2 = s2.iterator();
        while (i2.hasNext()) {
            System.out.println(i2.next());

        }

    }

}
