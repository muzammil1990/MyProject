package com.volvo.java.StringPrograms;

//logic:
//compare each char with space 
//when each char converted to string is not equal to space then add the single string(char) with empty string.
//space will not be added to empty string and hence space will be removed

public class RemoveSpacesFromSentence1 {

    public static void main(String[] args) {
        String s1 = "Java is essential for learning Selenium";
        String empStr = "";

        for (int i = 0; i < s1.length(); i++) {
            
            char ch = s1.charAt(i);
            String s2 = Character.toString(ch); // to convert char to String. why?
            
//          String s3 = String.valueOf(ch); //to convert char to String; 
            
//so that space(which is string) can be compared with another string; 
//String cannot be compared with char thats why need to convert char to string
            
            if (!s2.equals(" ")) {    //str.charAt(i) != 'i'  ; character is not equals to, this is how we write
                empStr = empStr + s2; 
            }

       }
        System.out.println(empStr);
    }

}
