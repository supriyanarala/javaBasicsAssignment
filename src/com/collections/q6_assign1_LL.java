package com.collections;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class q6_assign1_LL {
    public static void main(String[] args) throws IOException {
        String[] userData = new String[10];
        Random random = new Random();
        String folderName = "acc_" + random.nextInt(1000);

        List<String> mydata = new LinkedList<>();
        mydata.add("1.Register");
        mydata.add("2.Book Vacation");
        mydata.add("3.Display all vacations");
        mydata.add("4.Generate Bill");
        mydata.add("5.Thank you");
        for (int i = 0; i < mydata.size(); i++) {
            System.out.println(mydata.get(i));
        }
        System.out.println("Please select your option");
        Scanner scanner = new Scanner(System.in);
        // Read the user's choice
        int choice = scanner.nextInt();
        System.out.println(choice);

        List<String> userDetails = new ArrayList();

        // Prompt user for information
        System.out.print("Please enter datails ");
        String name1 = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Vacation Bookings: ");
        String vacation = scanner.nextLine();

        // Create JSON object
        JSONObject accountData = new JSONObject();
        accountData.put("name", name);
        accountData.put("email", email);
        accountData.put("phonenumber", phoneNumber);
        accountData.put("address", address);
        accountData.put("vacationbookings", vacation);

        switch (choice) {
            case 1:
                System.out.println("You have choosen option1");
                Register(folderName);
                WriteToFile(accountData, folderName);
                break;
            case 2:
                System.out.println("You have choosen option2");
                break;
            case 3:
                System.out.println("You have choosen option3");
                break;
            case 4:
                System.out.println("You have choosen option4");
                break;
            case 5:
                System.out.println("You have choosen option5");
                break;
            default:
                System.out.println("You haven't choosen from given options");
                break;
        }
        scanner.close();
    }

    private static void WriteToFile(JSONObject accountData, String folderName) throws IOException, JSONException {
        Path filePath = Paths.get(folderName, folderName + ".json");
        Files.createFile(filePath);
        //Write data to file
        try (FileWriter fileWriter = new FileWriter(String.valueOf(filePath))) {
            fileWriter.write(accountData.toString());
            System.out.println("Data has been written to " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static void Register(String folderName) throws IOException {

        // Combine the base path with the folder name
        Path folderPath = Paths.get(folderName);
        try {
            // Create the folder
            Files.createDirectory(folderPath);
            System.out.println("Folder '" + folderName + "' created successfully in Downloads." + folderPath.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error creating folder: " + e.getMessage());
        }
    }
}

