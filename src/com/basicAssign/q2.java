package com.basicAssign;

//Write a program to check if a given number is odd or even.
//If Statement

public class q2 {
    public static void main(String[] args) {
        int n = 256;
        findOddorEven(n);
    }

    public static void findOddorEven(int n) {
        if (n%2 == 0) {
            System.out.println("n is even");
        }  else {
            System.out.println("n is odd");
        }
    }
}
