package com.basicAssign;
//Write a Java program to find if the given number is palindrome or not
public class q18 {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(CheckPalindrome(n));
    }

    private static String CheckPalindrome(int n) {
        int result = n;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
            if (result == rev) {
                return "Yes";
            }
        }
        return "false";
    }
}
