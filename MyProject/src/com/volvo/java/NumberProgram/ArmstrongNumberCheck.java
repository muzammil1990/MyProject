package com.volvo.java.NumberProgram;

//An Armstrong number is a number which equals to the sum of the cubes of its individual digits.
public class ArmstrongNumberCheck {

    public static void main(String[] args) {

        int num = 153;
        int temp = num;
        int remainder;
        int cube = 0;

        while (num != 0) {
            remainder = num % 10; // when we divide a num with mod, the last digit of no. will be remainder always
            num = num / 10;
            cube = cube + (remainder * remainder * remainder);
        }
        
        if (temp == cube) {
            System.out.println("armstrong number");
        } else {
            System.out.println("Not a armstrong number");
        }
    }

}
