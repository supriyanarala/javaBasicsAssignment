package com.basicAssign;

//1 Write a program to check if a given number is Positive, Negative, or Zero.
//If Statement
public class class1 {
    public static void main(String[] args) {
        int n= -0;
        findNumberType(n);
    }
    public static void findNumberType(int n) {
        if(n>0){
            System.out.println("n is positive");
        }
        else if(n<0){
            System.out.println("n is -ve");
        }
        else{
            System.out.println("n is 0");
        }
    }

}
