package view;

import modal.*;

import java.io.IOException;
import java.util.ArrayList;

public class displayOwnerUtils {
    // Method to display all personal information of the selected owner
    public static void displayPersonalInformation(Owner owner) {
        System.out.println("Personal Information:");
        System.out.println(owner);
    }
    //Method to display all property addresses of the selected owner
    public static void displayPropertyAddresses(Owner owner) throws IOException {
        int i = 1;
        ArrayList<ResidentialProperty> loadResidentialProperties = FileManager.loadReProperties("residentialProperty.txt");
        ArrayList<CommercialProperty> loadCommercialProperties = FileManager.loadCoProperties("commercialProperty.txt");
        for(ResidentialProperty residentialProperty : loadResidentialProperties){
            if(residentialProperty.getOwnerID().equals(owner.getUid())){
                System.out.println("Property Address: " + i++ + residentialProperty.getAddress());
            }
        }
        for(CommercialProperty commercialProperty : loadCommercialProperties){
            if(commercialProperty.getOwnerID().equals(owner.getUid())){
                System.out.println("Property Address: " + i++ + commercialProperty.getAddress());
            }
        }
    }
//
//    // Method to display the name of the list host of the selected owner
//    public static void displayNameOfListHost(Owner owner) {
//        System.out.println("List Host Name: " + owner.getListHostName());
//    }
//
    // Method to display all rental agreements of the selected owner
    public static void displayRentalAgreementsID(Owner owner) throws IOException {
        ArrayList<RentalAgreement> agreements = FileManager.loadRentalAgreement("rentalAgreement.txt");
        int i = 1;
        for (RentalAgreement agreement : agreements) {
            if (agreement.getOwnerID().equals(owner.getUid())) {
                System.out.println("Rental Agreement " + i++ + ": " + agreement.getAid());
            }
        }
    }
}
