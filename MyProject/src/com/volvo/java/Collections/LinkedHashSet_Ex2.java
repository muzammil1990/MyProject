package com.volvo.java.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSet_Ex2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedHashSet<Object> lhs= new LinkedHashSet<>();
        
        lhs.add("arjun");  // used add() method of HashSet class
        lhs.add("vijay");
        lhs.add("muzammil");
        lhs.add("asha");
        lhs.add("arjun");  //duplicate
        lhs.add(null);
        lhs.add(null);  //used add() method of set interface
        
        for(Object s: lhs){
            System.out.println(s);
        }
        
//        System.out.println(lhs);
    }

}
