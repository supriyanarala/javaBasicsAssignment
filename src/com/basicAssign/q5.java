package com.basicAssign;
/*
Intialize a character variable in a program and if the value is alphabet then print
"Alphabet" if it’s a number then print "Digit" and for other characters print "Special
Character"
If Statement
 */
public class q5 {
    public static void main(String[] args) {
        char ch = 'u';


        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
