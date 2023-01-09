package com.volvo.java.StringPrograms;

public class RemoveMultipleSpacesFromSentence {

    //logic of removing space from sentences will also work to remove multiple space from sentence
    public static void main(String[] args) {
       String s1 = "      This is    a          test  program          ";
       String s2 = s1.trim().replaceAll(" +", "");
       System.out.println(s2);

    }

}
