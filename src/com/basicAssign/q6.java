package com.basicAssign;

import java.util.Scanner;

/*
Write a program to accept gender ("Male" or "Female") and age (1-120) from command
line arguments and print the percentage of interest based on the given conditions.
Interest == 8.2% Gender ==> Female Age ==>1 to 58
Interest == 7.6% Gender ==> Female Age ==>59 -120
Interest == 9.2% Gender ==> Male Age ==>1-60
Interest == 8.3% Gender ==> Male Age ==>61-120
If
 */
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Press Y to continue and q to exit");
//        String proceed = sc.nextLine();
        String proceed;
        do {
            System.out.println("Please enter your gender");
            String gender = sc.nextLine();
            System.out.println("Please enter your age");
            int age = Integer.parseInt(sc.nextLine());
            if (gender.equalsIgnoreCase("male")) {
                if (age >= 1 || age <= 60) {
                    System.out.println("Intrest is 9.2%");
                } else if (age >= 61 || age <= 120) {
                    System.out.println("Intrest is 8.3%");
                }
            } else if (gender.equalsIgnoreCase("female")) {
                if (age >= 1 || age <= 58) {
                    System.out.println("Intrest is 8.2%");
                } else if (age >= 59 || age <= 120) {
                    System.out.println("Intrest is 7.6%");
                }
            }
            System.out.println("Press Y to continue and q to exit");
            proceed = sc.nextLine();
        } while(proceed.equalsIgnoreCase("y"));
        sc.close();
    }
}
