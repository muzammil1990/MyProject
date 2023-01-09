package com.volvo.java.Collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public class ArraylistEx1 { 

    public static void main(String[] args) {

//public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable        
       
        ArrayList<String> al = new ArrayList<String>();  //homogenous data= String type //

        al.add("ravi");
        al.add("teja");
        al.add("10");
        al.add("ravi");
        al.add("ravi");
       
        System.out.println(al.size());
     
     //using normal for loop   
        for(int i=0; i< al.size(); i++){
            String s= al.get(i);
            System.out.println(s);
        }
        
        System.out.println();
     
//        using advanced for loop
        for(String s:al){
            System.out.print(s+ "  ");
            
        }
        System.out.println("\n");
        
//fetch data using iterator
        Iterator itr = al.iterator();  // public Iterator iterator(); iterator() method belongs to Iterable interface

        while (itr.hasNext()) {
            System.out.println(itr.next()); //next() actually returns the next element and moves the cursor pointer to the next element
        }

    }
 }

//LIST PROPERTIES:(ArrayList class implements List interface so , the sub class must  implement to all it.)
/*
* 1. It is index based. 
* 2. It can store duplicate items. 
* 3. Null is also allowed 
* 4. Insertion order remains same in list
* 5. To retrieve the data from the list:- get().
* 6. Not synchronised= Two threads can access the same method/AL at the same time.Not good practice
* 7.In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed in b/w from the array list
* 8. When there is dynamic array, we should use arraylist, bcoz at run time we can increase its size
* 
*/
