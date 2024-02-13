package com.basicAssign;
import java.sql.SQLOutput;
import java.util.Scanner;


//13 Write a program to print  if given is prime or not
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "N";
        do {
            System.out.println("Enter number");
            int n = sc.nextInt();
            boolean value = prime(n);
            System.out.println(n);
            if (value) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
            System.out.println("Press Y to continue else enter any other key");
            s = sc.next();
        }while(s.equalsIgnoreCase("Y"));
    }

    private static boolean prime(int n) {
        if(n==1 || n==0 || n<0){
            System.out.println("Not a prime nor composite. Invalid");
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}