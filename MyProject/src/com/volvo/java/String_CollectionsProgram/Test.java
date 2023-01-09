package com.volvo.java.String_CollectionsProgram;

import java.util.LinkedHashMap;

public class Test {

    public static void main(String[] args) {
        
        LinkedHashMap l = new LinkedHashMap<>();
        
        l.put("rollno", 1);
        l.put("rollno", 5);
        System.out.println(l);
    }
    
}
