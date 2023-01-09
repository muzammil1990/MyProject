package com.volvo.java.PatternProgram;

//I have develped on my own
public class HelloPattern1 {

    public static void main(String[] args) {

        String s = "hello";
        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {  //i = row

            for (int j = 0; j <= i; j++) {  // j= col
//                if (i == j) {
//                    System.out.print(ch[i]);
//                }
//                else{
//                    System.out.print("  ");
//                }
                
                System.out.print(ch[i]);
            }
            System.out.println();
        }
    }
}
