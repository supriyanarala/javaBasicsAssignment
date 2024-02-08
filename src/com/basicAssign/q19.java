package com.basicAssign;

// Write a program to print first 5 values which are divisible by 2, 3, and 5.
// While Loop
public class q19 {
    public static void main(String[] args) {
        int count = 0;
        int[] result = new int[5];

        // Use while loop until you find 5 numbers
        while (count < 5) {
            for (int i = 1; ; i++) {
                // Check if i is divisible by 2, 3, and 5
                if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                    result[count] = i;
                    System.out.println("Value " + (count+1) + ": " + result[count]);
                    count++;
                    // Break out of the loop if count reaches 5
                    if (count == 5) {
                        break;
                    }
                }
            }
        }
    }
}
