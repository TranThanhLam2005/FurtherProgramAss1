package view;
import modal.*;

import java.io.IOException;
import java.util.ArrayList;


public class View {
    public static void viewAllTenants() throws IOException {
        ArrayList<Tenant> tenants = FileManager.loadTenants("tenant.txt");
        System.out.println("All Tenants: ");
        int i = 1;
        for (Tenant tenant : tenants) {
            System.out.println("Tenant " + i++ + ":");
            System.out.println(tenant);
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
        System.out.println("View All Owners");
        ArrayList<Owner> owners = FileManager.loadOwners("owner.txt");
        int i = 1;
        for (Owner owner : owners) {
            System.out.println("Owner " + i++ + ":");
            System.out.println(owner);
        }
    }
    public static void viewAllResidentialProperties() {
        System.out.println("View All Residential Properties");

    }
    public static void viewAllCommercialProperties() {
        System.out.println("View All Commercial Properties");
    }
}
