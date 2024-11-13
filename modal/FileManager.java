package modal;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileManager {

    // Method to load tenants from file
    public static ArrayList<Tenant> loadTenants(String fileName) throws IOException {
        ArrayList<Tenant> tenants = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Use getResourceAsStream with an absolute path
        try (InputStream inputStream = FileManager.class.getResourceAsStream("/data/" + fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            if (inputStream == null) {
                throw new FileNotFoundException("File not found: " + fileName);
            }

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 4) {
                    String id = parts[0];
                    String fullName = parts[1];
                    String dateOfBirthStr = parts[2];
                    String contactInformation = parts[3];

                    try {
                        Date dateOfBirth = dateFormat.parse(dateOfBirthStr);
                        Tenant tenant = new Tenant(id, fullName, dateOfBirth, contactInformation);
                        tenants.add(tenant);
                    } catch (ParseException e) {
                        System.err.println("Invalid date format for tenant: " + fullName);
                    }
                }
            }
        } catch (NullPointerException e) {
            System.err.println("File not found: " + fileName);
        }

        return tenants;
    }



    // Method to load hosts from file
    public static ArrayList<Host> loadHosts(String fileName) throws IOException {
        ArrayList<Host> hosts = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Use getResourceAsStream with an absolute path
        try (InputStream inputStream = FileManager.class.getResourceAsStream("/data/" + fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            if (inputStream == null) {
                throw new FileNotFoundException("File not found: " + fileName);
            }

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 4) {
                    String id = parts[0];
                    String fullName = parts[1];
                    String dateOfBirthStr = parts[2];
                    String contactInformation = parts[3];

                    try {
                        Date dateOfBirth = dateFormat.parse(dateOfBirthStr);
                        Host host = new Host(id, fullName, dateOfBirth, contactInformation);
                        hosts.add(host);
                    } catch (ParseException e) {
                        System.err.println("Invalid date format for tenant: " + fullName);
                    }
                }
            }
        } catch (NullPointerException e) {
            System.err.println("File not found: " + fileName);
        }

        return hosts;
    }
//
//    Method to load owners from file
public static ArrayList<Owner> loadOwners(String fileName) throws IOException {
    ArrayList<Owner> owners = new ArrayList<>();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    //Use getResourceAsStream with an absolute path
    try (InputStream inputStream = FileManager.class.getResourceAsStream("/data/" + fileName);
         BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

        if (inputStream == null) {
            throw new FileNotFoundException("File not found: " + fileName);
        }

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            if (parts.length == 4) {
                String id = parts[0];
                String fullName = parts[1];
                String dateOfBirthStr = parts[2];
                String contactInformation = parts[3];

                try {
                    Date dateOfBirth = dateFormat.parse(dateOfBirthStr);
                    Owner owner = new Owner(id, fullName, dateOfBirth, contactInformation);
                    owners.add(owner);
                } catch (ParseException e) {
                    System.err.println("Invalid date format for tenant: " + fullName);
                }
            }
        }
    } catch (NullPointerException e) {
        System.err.println("File not found: " + fileName);
    }

        return owners;
    }
//
//    // Method to load properties from file
//    public static ArrayList<Property> loadProperties(String fileName) throws IOException {
//
//    }
//
//    // Method to load rental agreements from file
//    public static ArrayList<RentalAgreement> loadRentalAgreements(String fileName) throws IOException {
//
//    }
//
//    // Method to save tenants to file
//    public static void saveTenants(List<Tenant> tenants, String fileName) throws IOException {
//
//    }
//
//    // Method to save hosts to file
//    public static void saveHosts(List<Host> hosts, String fileName) throws IOException {
//
//    }
//
//    // Method to save owners to file
//    public static void saveOwners(List<Owner> owners, String fileName) throws IOException {
//
//    }
//
//    // Method to save properties to file
//    public static void saveProperties(List<Property> properties, String fileName) throws IOException {
//
//    }
//
//    // Method to save rental agreements to file
//    public static void saveRentalAgreements(List<RentalAgreement> agreements, String fileName) throws IOException {
//
//    }
}
