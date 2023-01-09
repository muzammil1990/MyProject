package com.volvo.java.StringMethods;

//The insert() method inserts the given string into existing string at the given position.
//pg to show insert method of StringBuffer class
public class StringBufferInsert {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StringBuffer sb = new StringBuffer("Java");  //sb points to normal heap memory(non pool area)
        sb.insert(4, "Python");
        System.out.println(sb);
        
        sb.insert(4, "Python");
        System.out.println(sb);
        System.out.println(sb.length());
        
        sb.insert(16, "Java");
        System.out.println(sb);
        
        sb.insert(1, "Hi");
        System.out.println(sb);
        
    }

}
