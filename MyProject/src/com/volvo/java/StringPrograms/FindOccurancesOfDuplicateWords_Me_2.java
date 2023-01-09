package com.volvo.java.StringPrograms;

import java.util.LinkedHashSet;

//using set: same as program FindDuplicateElementsUsingSet= Array Pg
public class FindOccurancesOfDuplicateWords_Me_2 {

    public static void main(String[] args) {
        String s1 = "This is a test program is program";

        String[] s2 = s1.split(" ");  //    str.split("\\s");

        LinkedHashSet<String> st = new LinkedHashSet<String>();

        for (String temp : s2) {
            if (!st.add(temp)) {
                System.out.println("dup words: " + temp);
            }
        }
    }
}
