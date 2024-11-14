package view;

import modal.*;
import java.io.IOException;
import java.util.ArrayList;

public class displayTenantUtils {
    public static void displayPersonalInformation(Tenant tenant) {
        System.out.println("Personal Information:");
        System.out.println(tenant);
    }
    public static void displayRentalAgreementsID(Tenant tenant) throws IOException {
        System.out.println("List Of Rental Agreements ID:");
        ArrayList<RentalAgreement> rentalAgreements = FileManager.loadRentalAgreement("rentalAgreement.txt");
        int i = 1;
        for (RentalAgreement rentalAgreement : rentalAgreements) {
            if (rentalAgreement.getMainTenantID().equals(tenant.getUid())) {
                System.out.println("Rental Agreement " + i++ + ": " + rentalAgreement.getAid());
            }
        }
    }
    public static void displayPaymentTransactions(Tenant tenant) throws IOException {
        System.out.println("List Of Payment Transactions:");
        ArrayList<Payment> payments = FileManager.loadPayments("payment.txt");
        int i = 1;
        for (Payment payment : payments) {
            if (payment.getTenantId().equals(tenant.getUid())) {
                System.out.println("Payment " + i++ + ":");
                System.out.println(payment);
            }
        }
    }
}
