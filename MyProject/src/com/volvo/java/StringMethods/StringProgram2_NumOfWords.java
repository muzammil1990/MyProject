package com.volvo.java.StringMethods;

//pg to count no. of words without using split function
public class StringProgram2_NumOfWords {

    public static void main(String[] args) {

        String s = "Sachin is a good person";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            String s1 = Character.toString(ch);
            if(s1.equals(" ")){
                count++;
            }
            
        }
        
        System.out.println("Count of words is: "+(count+1));

    }

}
