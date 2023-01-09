package com.volvo.java.StringMethods;

public class StringSplit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s1 = "Java is ocean. TLeraning java from JavaTpoint";

        String temp = s1.split("e")[1];
        System.out.println(temp);
        
        String s2 = s1.split(" ")[2];
        System.out.println(s2);

        String s3 = s2.split("e")[1];
        System.out.println(s3);

        // String words[] = s1.split("\\s");
        String words[] = s1.split("Ler");

        System.out.println("Length of words array =  " + words.length);
        for (String s : words) {

            System.out.println(s);
        }

    }
}
