
package com.volvo.java.Collections;

import java.util.ArrayList;

/**
 * isempty(); contains(); remove(); addAll()
 */

public class ArraylistEx4 {

    public static void main(String[] args) {
        
        ArrayList a= new ArrayList<>();
        a.add(10);
        a.add("Raj");
        a.add(null);
        
      //to check list is empty or not 
        System.out.println(a.isEmpty());
        
        //to check list has specfic element or not
       System.out.println( a.contains(10));
      
       // to remove an element
       a.remove(1);
       for(Object o: a){
           System.out.println(o);
       }
        
       
       
       
        ArrayList a1= new ArrayList<>();
        a1.add(33);
        a1.add("solar");
        
        a.addAll(a1);
       System.out.println(); 
       
        for(Object o: a){
            System.out.println(o);
        }
       
        
    }
}
