package com.volvo.java.PatternProgram;

//need more work here
public class HelloPattern2 {

    public static void main(String[] args) {
        

        String s = "hello";
        char ch[] = s.toCharArray();

      //i = row
        for (int i = 5; i > 0; i--) {  
            
            // j= col
            for (int j = 0; j < 5; j++) { 
                if (i == j) {
                    System.out.print(ch[j]);
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
