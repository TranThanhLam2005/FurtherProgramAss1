import modal.*;
import view.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // ANSI escape codes for colours
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Declare variables
    static Scanner scanner = new Scanner(System.in);

    public static void printIntroduction() {
        System.out.println(BLUE + "\t \t FURTHER PROGRAMMING \t \t" + RESET);
        System.out.println(RED + "Rental Property Management System" + RESET);
        System.out.println(GREEN + "Instructor: Dr.Vu Thanh Minh" + RESET);
        System.out.println(YELLOW + "-------------------------------" + RESET);
        System.out.println(PURPLE + "s4038329 - Tran Thanh Lam" + RESET);
    }
    public static void PauseAndClearScreen() {
        System.out.println("Press Enter to continue...");
        scanner.nextLine(); // Wait for the user to press Enter

        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                // For Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // For Unix/Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error clearing console: " + e.getMessage());
        }
    }
    public static void coordinate() throws IOException {
        System.out.println(GREEN + "\t\t Welcome To Rental Property Management System" + RESET);
        System.out.println(YELLOW + "1. View all tenants" + RESET);
        System.out.println(YELLOW + "2. View all hosts" + RESET);
        System.out.println(YELLOW + "3. View all owners" + RESET);
        System.out.println(YELLOW + "4. View all residential properties" + RESET);
        System.out.println(YELLOW + "5. View all commercial properties" + RESET);
        System.out.println(YELLOW + "6. Manage Rental Agreement" + RESET);
        System.out.println(YELLOW + "0. Save and Exit" + RESET);
        System.out.println(PURPLE + "Enter your choice: " + RESET);
        char choice = scanner.next().charAt(0);
        scanner.nextLine(); // Consume the newline character left by next().
        switch (choice) {
            case '1':
                System.out.println("View all tenants");
                View.viewAllTenants();
                break;
            case '2':
                System.out.println("View all hosts");
                View.viewAllHosts();
                break;
            case '3':
                System.out.println("View all owners");
                View.viewAllOwners();
                break;
            case '4':
                System.out.println("View all residential properties");
                //viewAllResidentialProperties();
                break;
            case '5':
                System.out.println("View all commercial properties");
                //viewAllCommercialProperties();
                break;
            case '6':
                System.out.println("Manage Rental Agreement");
                manageRentalAgreement();
                break;
            case '0':
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                break;
        }
    }
    public static void manageRentalAgreement() {
        System.out.println("Manage Rental Agreement");
        System.out.println("1. Add Rental Agreement");
        System.out.println("2. Update Rental Agreement");
        System.out.println("3. Delete Rental Agreement");
        System.out.println("4. View Rental Agreement");
        System.out.println("0. Back to main menu");
        System.out.println("Enter your choice: ");
        char choice = scanner.next().charAt(0);
        scanner.nextLine(); // Consume the newline character left by next().
        switch (choice) {
            case '1':
                System.out.println("Create Rental Agreement");
                //createRentalAgreement();
                break;
            case '2':
                System.out.println("Update Rental Agreement");
                //updateRentalAgreement();
                break;
            case '3':
                System.out.println("Delete Rental Agreement");
                //deleteRentalAgreement();
                break;
            case '4':
                System.out.println("View Rental Agreement");
                //viewRentalAgreement();
                break;
            case '0':
                System.out.println("Back to main menu");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                break;
        }
        scanner.close();
    }
    public static void main(String[] args) throws IOException {
        printIntroduction();
        PauseAndClearScreen();
        while (true) {
            coordinate();
        }
    }
}

