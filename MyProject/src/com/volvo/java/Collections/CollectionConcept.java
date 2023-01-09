package com.volvo.java.Collections;

public class CollectionConcept {
/*
 *    Q:    What is Collection in Java?
      Ans:  1.A Collection represents a single unit of objects, i.e., a group.
 *          2.The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
 *          3.Java Collections can achieve all the operations that you perform on a data
 *           such as searching, sorting, insertion, manipulation, and deletion.
 *   
 *     
 *     
 *     Q:    What is a framework in Java
      ANs:   1. It provides readymade architecture.
             2. It represents a set of classes and interfaces.
             3. It is optional.
 * 
 * 
 * 
 * 
       Q:   What is Collection framework?? (Same as above point 2.)
       Ans: The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:

            1. Interfaces and its implementations, i.e., classes
            2.  Algorithm*/
    
    
 /*   Array limitation overcome by collection
    
   1.  array always has or store only homogenous data. 
    eg: int a[]= new int[5]
          int a[]= {1,2,3,4,5};
   
   2.  size is always fixed. size can not be increase in runtime.
    */
/*
   1. collection can have hetrogenous data. eg, int, float, string, double
   2. size can be increased.
  */  
//==================================================================    
    
//    DIFFERENCE BETWEEN ARRAYLIST CLASS AND LINKEDLIST CLASS
    
 /*  1. IN AL memory allocation is continuos
      LL memory allocation "doubly linked list" format
      
   2. AL - intial capacity= 10
       LL - intitial capacity= 0
       
   3. Addition/removal of data in between is slower in AL. Why? In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed in b/w from the array list
   Addition/removal of data in between is faster LL
   
   4. Addition/removal of data at the end is  faster in AL 
   Addition/removal of data at the end is slower LL
======================================================================   
   
   
   DIFFERENCE BETWEEN ARRAYLIST CLASS AND VECTOR CLASS
   
   1. AL introduced in java 1.2
      Vector introduced in java 1.0
      
  2. AL - called as non legacy class
     Vector- legacy class
      
   3. Initial capacity - AL=10
                         vector= 10
                           
   4. AL: Whenever AL reaches its saturation point it increase its size by half of its current size
       
      AL= new capacity= (Old capacity * 3/ 2)+1
   
      nc= (10*3)/2 +1= 16
   
   
   Vector: Whenever vector reaches its saturation point it increases its size by double.
           NC= OC*2
    */
}
