package com.basicAssign;

import java.util.Scanner;

//Write a program to reverse a given number and print Eg1) I/P: 1234 O/P:4321 Eg2)
//I/P:1004 O/P:4001
public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("please enter number to be reversed");
            int num = sc.nextInt();
            System.out.println("Entered number is "+num);
            int reverse = reverseNum(num);
            System.out.println("Reversed Num is "+reverse);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close();
        }
    }

    private static int reverseNum(int num)
    {
        int rev = 0;
        try {
            rev = 0;
            while (num>0){
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rev;
    }
}
