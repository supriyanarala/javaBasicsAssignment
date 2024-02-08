package com.basicAssign;

/*
Initialize two character variables in a program and display the characters in alphabetical
order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
second is e O/P:a,e
 */
public class q4 {
    public static void main(String[] args) {

        arrangeChars('s','e');
        arrangeChars('a','d');
        arrangeChars('k','l');
    }

    private static void arrangeChars(char input1, char input2) {

        //method1
        int n1 = ((int) input1);
        int n2 = ((int) input2);
        if(n1<n2){
            System.out.print(input1+","+input2+"\n");
        }
        if(n1>n2){
            System.out.print(input2+","+input1+"\n");
        }
        if(n1 == n2){
            System.out.print("same characters"+"\n");
        }

        //method 2
        if (input1 > input2) {
            // Swap the characters if they are not in alphabetical order
            char temp = input1;
            input1 = input2;
            input1 = temp;
        }
        System.out.println("Characters in alphabetical order: " + input1 + ", " + input2);
    }
}
