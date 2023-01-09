/*
 Q: Write a function:
    Class Solution{ Public int solution(int A[]);}

that given an array A of N integers, returns the smallest positve integer(greater than 0)
that does not occur  in A
For example  
case 1:       given A= { 1, 3, 6, 4, 1, 2 }, the function should return 5
case 2:       given A={-1, -3} should return 1

*/

package com.volvo.java.ArrayPrograms;

import java.util.HashSet;

public class Solution2 {

    public int solution() {
        int num = 1;
        int arr[] = { -1, -3 };
        
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        
        System.out.println(hs);
        int arrayLengthAfterDupRemoved = hs.size(); // this size is same as array length
        int sum = (arrayLengthAfterDupRemoved + 1) * (arrayLengthAfterDupRemoved+2)/2;
        
       
        for(int item : hs)
        {
            sum = sum - item;
        }
        
       return sum;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int result = s.solution();
        System.out.println("Missing Number = "+ result);
    }
}
