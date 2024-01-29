import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;

public class xxx {

    private static final String BASE_PATH = "C:\\Users\\Supriya Pappula\\Downloads";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Create a Folder in Downloads");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");

        // Read the user's choice
        int choice = scanner.nextInt();

        // Process the user's choice
        switch (choice) {
            case 1:
                createFolder();
                break;
            case 2:
                System.out.println("You selected Option 2. Add your logic for Option 2 here.");
                break;
            case 3:
                System.out.println("You selected Option 3. Add your logic for Option 3 here.");
                break;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
                break;
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    private static void createFolder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the folder name: ");
        String folderName = scanner.next();

        // Combine the base path with the folder name
        Path folderPath = Paths.get(BASE_PATH, folderName);

        try {
            // Create the folder
            Files.createDirectory(folderPath);
            System.out.println("Folder '" + folderName + "' created successfully in Downloads.");
        } catch (IOException e) {
            System.out.println("Error creating folder: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
