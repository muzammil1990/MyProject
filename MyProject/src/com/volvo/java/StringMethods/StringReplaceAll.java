package com.volvo.java.StringMethods;

public class StringReplaceAll {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s1="javatpoint is a very good website";  
        String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
        System.out.println(replaceString);  
        
        //second pg: example to replace all the occurrences of single word or set of words.
        
        String s2="My name is Khan. My name is Bob. My name is Sonoo.";  
        String replaceString2=s2.replaceAll("is","was");//replaces all occurrences of "is" to "was"  
        System.out.println(replaceString2);  
        
        
//3rd pg: example to remove all the occurrences of white spaces.
        String s3="My name is Khan. My name is Bob. My name is Sonoo.";  
        String replaceString3=s3.replaceAll("\\s","");  
        System.out.println(replaceString3);  

    }

}
