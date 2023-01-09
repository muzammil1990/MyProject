package com.volvo.java.StringMethods;

//compareTo() method which compares values lexicographically and returns an integer values
public class StringObject_Equals_Ex3 {
    
    public static void main(String args[]){  
        String s1="Sachin";  
        String s2="Sachin";  
        String s3="Tata"; 
//        System.out.println(s1.compareTo(s2));//0  
        System.out.println(s1.compareTo(s3));//1(because s1>s3)  
//        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
      }  

}
