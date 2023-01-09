package com.volvo.java;

public class SumOfFirstN {
    int newSum=0;
    int sum = 0; // instance variable since inside class outside method; memory allocated during runtime when
                 // object is created or instance is created. hence called instance variable

    int getSumofFirstTenNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    int getSumofNext10(int num) {

        float newNum = num + 10;
        for (int i = num; i <= newNum; ++i) {
            newSum=newSum+i;
            //sum=sum+i;
        }
        return newSum;
    }
}
