package com.basicAssign;

import java.util.Scanner;

/*
Write a program to add all the values in a given number and print. Ex: 1234->10
For Loop
 */
public class q15 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                int sum = calculateDigitSum(number);

                System.out.println("Sum of the digits: " + sum);

                scanner.close();
            }

            private static int calculateDigitSum(int num) {
                int sum = 0;

                // Loop through each digit in the number
                for (; num != 0; num /= 10) {
                    int digit = num % 10;
                    sum += digit;
                }
                return sum;
            }
        }
