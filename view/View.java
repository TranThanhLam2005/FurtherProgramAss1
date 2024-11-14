package view;
import modal.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class View {
    public static void viewAllTenants() throws IOException {
        ArrayList<Tenant> tenants = FileManager.loadTenants("tenant.txt");
        int i = 1;
        for (Tenant tenant : tenants) {
            System.out.println("Tenant " + i++ + ": " + tenant.getFullName());
        }
        // Prompt user to enter an index
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the tenant you want to know more about: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by next().
        if (index > 0 && index <= tenants.size()) {
            Tenant selectedTenant = tenants.get(index - 1);

            // Display options
            System.out.println("Options:");
            System.out.println("1. Show personal information");
            System.out.println("2. Show all list of rental agreements ID made by the tenant");
            System.out.println("3. Show all list of payment transactions information of the tenant");

            char option = scanner.next().charAt(0);
            scanner.nextLine(); // Consume the newline character left by next().
            switch (option) {
                case '1':
                    displayTenantUtils.displayPersonalInformation(selectedTenant);
                    break;
                case '2':
                    displayTenantUtils.displayRentalAgreementsID(selectedTenant);
                    break;
                case '3':
                    displayTenantUtils.displayPaymentTransactions(selectedTenant);
                    break;

                default:
                    System.out.println("Invalid option. Please select 1, 2, or 3.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }
    public static void viewAllHosts() throws IOException {
        ArrayList<Host> hosts = FileManager.loadHosts("host.txt");
        System.out.println("View All Hosts");
        int i = 1;
        for (Host host : hosts) {
            System.out.println("Host " + i++ + ":");
            System.out.println(host);
        }
    }
    public static void viewAllOwners() throws IOException {
        ArrayList<Owner> owners = FileManager.loadOwners("owner.txt");
        int i = 1;
        for (Owner owner : owners) {
            System.out.println("Owner " + i++ + ": " + owner.getFullName());
        }
        // Prompt user to enter an index
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the owner you want to know more about: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by next().
        if (index > 0 && index <= owners.size()) {
            Owner selectedOwner = owners.get(index - 1);

            // Display options
            System.out.println("Options:");
            System.out.println("1. Show personal information");
            System.out.println("2. Show all property addresses of the owner");
            System.out.println("3. Show name of list host managed property of the owner");
            System.out.println("4. Show all rental agreements id of the owner");

            char option = scanner.next().charAt(0);
            scanner.nextLine(); // Consume the newline character left by next().
            switch (option) {
                case '1':
                    displayOwnerUtils.displayPersonalInformation(selectedOwner);
                    break;
                case '2':
                    displayOwnerUtils.displayPropertyAddresses(selectedOwner);
                    break;
//                case '3':
//                    displayOwnerUtils.displayNameOfListHost(selectedOwner);
//                    break;
                case '4':
                    displayOwnerUtils.displayRentalAgreementsID(selectedOwner);
                    break;
                default:
                    System.out.println("Invalid option. Please select 1, 2, or 3.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }
    public static void viewAllResidentialProperties() {
        System.out.println("View All Residential Properties");

    }
    public static void viewAllCommercialProperties() {
        System.out.println("View All Commercial Properties");
    }
}
