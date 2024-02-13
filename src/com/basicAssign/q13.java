package com.basicAssign;

import java.util.Scanner;

//13 Write a program to print prime numbers between 10 and 99. - For Loop
//o/p = 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
public class q13 {
    public static void main(String[] args) {
      for(int n=10; n<=99;n++) {
         if(prime(n)) {
             System.out.println(n);
         }
      }
    }

//    private static boolean prime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }


    private static boolean prime(int n) {

     if (n <= 1) {
            return false;
        }
        for(int i=2; i< Math.sqrt(n);i++){
            if(n%i ==0){
               return false;
            }
        }
        return true;
    }
}
