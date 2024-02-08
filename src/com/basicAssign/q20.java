package com.basicAssign;

//Write a program that displays a menu with options
// 1. Add
// 2. Sub
// Based on the options chosen, read 2 numbers and perform the relevant operation.
// After performing the operation, the program should ask the user if he wants to continue.
// If the user presses y or Y,
// then the program should continue displaying the menu
// else
// the program should terminate. [ Note: Use Scanner class, you can take help from the trainer regarding the same ]
//Do While


import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        int result;
        String opinion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please select your option. 1.Add 2.Sub");
            int num = sc.nextInt();
            System.out.println("Please enter numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("num1 =" + num1 + " num2 = " + num2);
            if (num == 1) {
                result = add(num1, num2);
                System.out.println(result);
            } else if (num == 2) {
                result = sub(num1, num2);
                System.out.println(result);
            } else {
                System.out.println("Invalid option");
            }
            System.out.println("Do you want to continue?? If yes press Y");
             opinion = sc.next();
        }while(opinion.equalsIgnoreCase("y"));
    }

    public static int sub(int num1, int num2) {
        return num1-num2;
    }

    public static int add(int num1, int num2) {
        return num1+num2;
    }
}
