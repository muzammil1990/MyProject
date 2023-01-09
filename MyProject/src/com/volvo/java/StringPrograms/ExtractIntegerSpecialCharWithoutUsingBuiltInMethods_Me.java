package com.volvo.java.StringPrograms;

public class ExtractIntegerSpecialCharWithoutUsingBuiltInMethods_Me {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String Str = "I am good at java# and i have been using this from 2009$ and I rate myself as 9 !";

        String result1 = "", result2 = "", result3 = "";

        for (char ch : Str.toCharArray()) {

            if (ch >= 'A' && ch <= 'Z') {
                result1 = result1 + ch;
            }

            else if (ch >= 'a' && ch <= 'z') {
                result1 = result1 + ch;
            }

            else if (ch >= '0' && ch <= '9') {
//                String i = String.valueOf(ch); // again converting char to string so that i can add it result2=which is string
//            			     Character.toString(ch)
            	
                result2 = result2 + ch;  // String + char = String
            }

            else {
                result3 = result3.trim() + ch;
            }
        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
