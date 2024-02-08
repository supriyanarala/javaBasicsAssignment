package com.basicAssign;

import java.util.Scanner;

/*
Write a program to print * in Floyds format (using for and while loop) *
 */
public class q16 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number of rows for Floyd's triangle: ");
                int numRows = scanner.nextInt();

                int num = 1;

                for (int i = 1; i <= numRows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                        //num++;
                    }
                    System.out.println();
                }

                scanner.close();
            }
        }
