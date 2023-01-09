package com.volvo.java.Collections;

import java.util.Iterator;
import java.util.TreeSet;

//pg to notice null, duplicate, and ascending order of TreeSet class
//accepts only homogenours data or else throws classcast exception like priorityqueue class
public class TreeClassEx1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        TreeSet<Object> ts= new TreeSet<>();
        
        ts.add("r");
  //      ts.add(null);  // cannot add null values as it throws null pointer exception.
        ts.add("s");
        ts.add("m");
        ts.add("r");  //duplicate not allowed in Set Interface hence not allowed in TreeSet
        ts.add("c");
        ts.add("g");
        ts.add("C");
        ts.add("M");
//        ts.add(10); // must have homogenous data i.e same type of data. eg only string data, or only integer data but not both. ClassCastException
        
//        Data Retriveing or printing the data
        
//        System.out.println(ts);
        
        // output: prints in ascending order
        // as per ASCII value , Capital letter/Strings are printed first.
        // ASCII value of A startswith= 65 to Z= 65+25=90
        // ASCII value of a startswith = 97 to z= 97+25=122
        
       /* for(Object s: ts){
            System.out.println(s);
        }
        */
        
        // travesing the elements in ascending order in TreeSet Class
        Iterator<Object> itr= ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
