package com.basicAssign;



import java.util.Objects;
import java.util.Scanner;

//Write a program to check if the program has received command line arguments or not.
//If the program has not received the values then print "No Values", else print all the
//values in a single line separated by ,(comma). Eg1) java Example O/P: No values Eg2)
//java Example Mumbai Bangalore O/P: Mumbai,Bangalore [Note: You can use length
//property of an array to check its length
public class Example {
          public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              StringBuilder sb = new StringBuilder();
              System.out.println("Please enter te value");
              String input = sc.nextLine();



              while (input == "q"){
                  System.out.println("you can add another value also. To exit press q key");
                  sb.append(input).append(",");
                   input = sc.nextLine();
              }
              System.out.println(sb.toString());

sc.close();

        }
    }
