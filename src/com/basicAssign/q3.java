package com.basicAssign;

import java.util.Scanner;

public class q3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean values = args.length > 0;

            do {
                System.out.println("Press Enter data  or type 'exit' to quit:");
                String userInput = sc.nextLine();
                if (userInput.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the program.");
                    break;
                }else
                if (values) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < args.length; i++) {
                        sb.append(args[i]);
                        if (i < args.length - 1) {
                            sb.append(",");
                        }
                    }
                    System.out.println(sb.toString());
                } else {
                    System.out.println("No values");
                }
            } while (true);
            sc.close();
        }
    }
