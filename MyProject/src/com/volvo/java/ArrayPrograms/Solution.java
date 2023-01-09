
/*
 Q: Write a function:
    Class Solution{ Public int solution(int A[]);}

that given an array A of N integers, returns the smallest positve integer(greater than 0)
that does not occur  in A
For example  
case 1:       given A= { 1, 3, 6, 4, 1, 2 }, the function should return 5
case 2:       given A={-1, -3} should return 1
case 3:       given A={1,2,3}

*/

package com.volvo.java.ArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public int solution() {

        int arr[] = { -1, -3 };
        int num = 1;

        Arrays.sort(arr);

        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        // o/p: hs = 1 2 3 4 6

        // saving HashSet elements after removing duplicates if any in arr2
        int arr2[] = new int[hs.size()]; // new array size will be same as hashset size

        int index = 0;
        for (int i : hs) {
            arr2[index] = i;
            index++;
        }

        // printing new array elements
        System.out.println(Arrays.toString(arr2)); // test cases:{-1, -2, 1,-3}

        // iterating in new array
        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] >= 1) {
                if (num != arr2[i]) {
                    return num;
                }
                num++;
            }

        }

        return num;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution();
        System.out.println(result);
    }
}
