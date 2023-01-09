package com.volvo.java.ArrayPrograms;
//rules:
//to print the array using advance for loop throws error. Have to use traditional for loop or Arrays.toString to print the array

public class ArrayProgram {

    public static void printsubArrays(int givenArray[], int sum) {
        int arrayLength = givenArray.length;

        for (int i = 0; i < arrayLength; i++) {
            int firstElement = givenArray[i];

            for (int j = i + 1; j < arrayLength; j++) {
                int secondElement = givenArray[j];

                if ((firstElement + secondElement) == sum) {

                    System.out.println("(" + firstElement + ", " + secondElement + ")");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        int givenArray[] = {1,2,5,5,6,3,8};
        int sum = 10;
        
        ArrayProgram.printsubArrays(givenArray, sum); //static method call
        System.out.println();
//        printsubArrays(givenArray, sum);  //static method call- 2nd way
        
    }
    

}
