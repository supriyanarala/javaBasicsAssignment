package com.basicAssign;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any letter");
        String input = sc.nextLine();
        char[] input1 = input.toCharArray();
        char[] output = new char[input1.length];
        for(int i=0;i<input1.length;i++) {
            if (Character.isUpperCase(input1[i])) {
                output[i] = Character.toLowerCase(input1[i]);
                System.out.println("old char:"+input1[i]+"  new char: "+output[i]+"\n");
            } else if (Character.isLowerCase(input1[i])) {
                output[i] = Character.toUpperCase(input1[i]);
                System.out.println("old char:"+input1[i]+"  new char: "+output[i]+"\n");
            } else {
                System.out.println("Invalid char");
            }
        }

sc.close();
    }
}
