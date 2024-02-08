package com.basicAssign;
import java.util.Scanner;

/*
Write a program to print the color name, based on color code. If color code in not valid
then print "Invalid Code".
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
 */

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter color code");
        String input = sc.nextLine();
        switch (input){
            case "R":
                System.out.println("Red");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "B":
                System.out.println("Blue");
                break;
            case "O":
                System.out.println("Orange");
                break;
            case "Y":
                System.out.println("yellow");
                break;
            case "W":
                System.out.println("White");
                break;
            default :
                System.out.println("Invalid Code");
                break;
        }
        sc.close();
    }
}
