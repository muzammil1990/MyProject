package com.volvo.java.ArrayPrograms;

//rules:
//to print the array using advance for loop throws error. Have to use traditional for loop or Arrays.toString to print the array

public class FindMinimumValue {

    public static void main(String[] args) {
        int[] givenArray = { 10, 10, 9, 9, 20, 22, 25, 24, 20, 100, 110, 100, 125 };

        int min = givenArray[0];
        
        for (int i : givenArray) {
            
            if (i < min) { // check if each element is less than the first element of array???
                min = i;
            }
        }

        System.out.println("Minimum value is: " + min);
    }

}
