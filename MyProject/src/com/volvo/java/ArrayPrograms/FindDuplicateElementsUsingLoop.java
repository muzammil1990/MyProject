package com.volvo.java.ArrayPrograms;

public class FindDuplicateElementsUsingLoop {

    public static void main(String[] args) {

        int[] givenArray = { 10, 20, 22, 10, 25, 24, 20, 100, 110, 100, 125 }; // size=12

        int len = givenArray.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) { // if we take j=1 instead of i+1 then what? ans: we should not

                // Comparing the first element with 2nd, 3rd , 4th till last and then 2nd element(when becomes first element, i=1) with 3rd so on.. only in forward direction not backwards.
                if (givenArray[i] == givenArray[j])
                    System.out.println("Duplicate elements are: " + givenArray[i]);
            }
        }
    }
}
