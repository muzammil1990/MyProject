package com.volvo.java.NumberProgram;

/* APPROACH
 *1. Find total no of element/digits
  2. Find the sum of all elements using the total formula: //(n+1) * (n+2)/2
  3. From sum - each digit= missing no.
*/

public class FindMissingNo {

    public static void main(String[] args) {

        int a = 12456;
        int b = a;

        //1.find the total no. of elements or digits
        int count = 0;
        while (a != 0) {
            a = a / 10;
            ++count;
        }

        // Below follows logic of finding the missing no. in an array
        int sum = (count + 1) * (count + 2) / 2;    //(n+1) * (n+2)/2
        System.out.println(sum);

  // 3. From sum - each digit= missing no.
        while (b != 0) {
            int digit = b % 10;  // when we divide a num with mod, the last digit of no. will be remainder always
            sum = sum - digit;
            b = b / 10;
        }
        System.out.println(sum);
    }

}
