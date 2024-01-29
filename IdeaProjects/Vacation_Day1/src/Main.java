import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        List<String> mydata = new ArrayList();
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
        switch (choice) {
            case 1:
                System.out.println("You have choosen option1");
                Register();
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

    public static void Register() throws IOException {

        Random random = new Random();
        java.lang.String folderName = "acc_"+random.nextInt(1000);
        System.out.println(folderName);

        // Combine the base path with the folder name
        Path folderPath = Paths.get(folderName);

        try {
            // Create the folder
            Files.createDirectory(folderPath);
            System.out.println("Folder '" + folderName + "' created successfully in Downloads.");
        } catch (IOException e) {
            System.out.println("Error creating folder: " + e.getMessage());
        }
    }
}

