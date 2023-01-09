package com.volvo.java.ArrayPrograms;

//rules:
//to print the array using advance for loop throws error. Have to use traditional for loop or Arrays.toString to print the array

public class FindMaxValue {

    public static void main(String[] args) {
        int[] givenArray = { 10, 20, 22, 25, 24, 20, 100, 110, 100, 125 };

        int max = givenArray[0];

        for (int i : givenArray) {

            if (i > max) { // check if each element is greater than the first element of array???
                max = i;
            }
        }

        System.out.println("Maximum value is: " + max);
    }

}
