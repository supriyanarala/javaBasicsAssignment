package com.basicAssign;
/*
Write a program to check if a given number is prime or not
 */
public class q12 {
    public static void main(String[] args) {
        int num = 141;
        System.out.println(isPrime(num));
    }

//   Write a program to check if a given number is prime or not - For loop
//    private static String isPrime(int num) {
//        String result = "";
//        int i = 2;
//        if (num == 0 || num == 1) {
//            result = "Neither prime nor composite";
//        }
//
//        for (int j = 2; j < num / 2 + 1; j++) {
//            if (num == j) {
//                result = "prime";
//            }
//            if (num / j == 0) {
//                result = "not prime";
//            } else {
//                result = "prime";
//            }
//        }
//        return result;
//    }
//  Write a program to check if a given number is prime or not - while loop
    private static String isPrime(int num) {
        String result = "";
        int i = 2;
        if (num == 0 || num == 1) {
            result = "Neither prime nor composite";
        }
        while(i<=num/2) {
            if (num == i) {
                result = "Prime";
            }
            if (num / i == 0) {
                result = "not prime";
            } else {
                result = "prime";
                i++;
            }
        }
        return result;
    }//end of method



}//end of class



