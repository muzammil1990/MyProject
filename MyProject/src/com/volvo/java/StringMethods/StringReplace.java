package com.volvo.java.StringMethods;

/*The string replace() method replaces all occurrence of, first sequence of character 
with second sequence of character*/

public class StringReplace {

    public static void main(String[] args) {
        
        String s1="Java is a programming language. Java is a platform. Java is an Island."; 
        String replaceStr=s1.replace("Java", "hero");
        System.out.println(replaceStr);
        
        
        String s2="My name is Khan. My name is Bob. My name is Sonoo.";  
        String replaceString2=s2.replace("is","was");//replaces all occurrences of "is" to "was"  
        System.out.println(replaceString2); 
    }
}
