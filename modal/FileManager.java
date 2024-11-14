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

    //Method to load owners from file
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

    // Method to load ResidentialProperties from file
    public static ArrayList<ResidentialProperty> loadReProperties(String fileName) throws IOException {
    ArrayList<ResidentialProperty> properties = new ArrayList<>();

    // Use getResourceAsStream with an absolute path
    try (InputStream inputStream = FileManager.class.getResourceAsStream("/data/" + fileName);
         BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

        if (inputStream == null) {
            throw new FileNotFoundException("File not found: " + fileName);
        }

        String line;
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split(",\\s*");
            if (tokens.length == 8) {
                String propertyId = tokens[0];
                String ownerId = tokens[1];
                String address = tokens[2];
                double rent = Double.parseDouble(tokens[3]);
                String status = tokens[4];
                int bedrooms = Integer.parseInt(tokens[5]);
                boolean hasGarage = Boolean.parseBoolean(tokens[6]);
                boolean hasGarden = Boolean.parseBoolean(tokens[7]);

                ResidentialProperty property = new ResidentialProperty(propertyId, address, rent, status, ownerId, bedrooms, hasGarage, hasGarden);
                properties.add(property);
            } else {
                System.err.println("Skipping malformed line: " + line);
            }
        }
    } catch (NullPointerException e) {
        System.err.println("File not found: " + fileName);
    }

    return properties;
}

    // Method to load CommercialProperties from file
    public static ArrayList<CommercialProperty> loadCoProperties(String fileName) throws IOException {
        ArrayList<CommercialProperty> properties = new ArrayList<>();

        // Use getResourceAsStream with an absolute path
        try (InputStream inputStream = FileManager.class.getResourceAsStream("/data/" + fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            if (inputStream == null) {
                throw new FileNotFoundException("File not found: " + fileName);
            }

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",\\s*");
                if (tokens.length == 8) {
                    String propertyId = tokens[0];
                    String ownerId = tokens[1];
                    String address = tokens[2];
                    double rent = Double.parseDouble(tokens[3]);
                    String status = tokens[4];
                    String type = tokens[5];
                    int parkingSpaces = Integer.parseInt(tokens[6]);
                    double squareFootage = Double.parseDouble(tokens[7]);

                    CommercialProperty property = new CommercialProperty(propertyId, address, rent, status, ownerId, type, parkingSpaces, squareFootage);
                    properties.add(property);
                } else {
                    System.err.println("Skipping malformed line: " + line);
                }
            }
        } catch (NullPointerException e) {
            System.err.println("File not found: " + fileName);
        }

        return properties;
    }

    // Method to load rental agreements from file
    public static ArrayList<RentalAgreement> loadRentalAgreement(String fileName) throws IOException {
        ArrayList<RentalAgreement> agreements = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Use getResourceAsStream with an absolute path
        try (InputStream inputStream = FileManager.class.getResourceAsStream("/data/" + fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            if (inputStream == null) {
                throw new FileNotFoundException("File not found: " + fileName);
            }

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",\\s*");
                if (tokens.length == 8) {
                    String AgreementID = tokens[0];
                    String ownerId = tokens[1];
                    String tenantID = tokens[2];
                    String propertyID = tokens[3];
                    String period = tokens[4];
                    Date date = dateFormat.parse(tokens[5]);
                    double fee = Double.parseDouble(tokens[6]);
                    String status = tokens[7];
                    RentalAgreement agreement = new RentalAgreement(AgreementID, ownerId, tenantID, propertyID, period,date, fee, status);
                    agreements.add(agreement);
                } else {
                    System.err.println("Skipping malformed line: " + line);
                }
            }
        } catch (NullPointerException e) {
            System.err.println("File not found: " + fileName);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return agreements;
    }

    //Load payments from file
    public static ArrayList<Payment> loadPayments(String fileName) throws IOException {
        ArrayList<Payment> payments = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Use getResourceAsStream with an absolute path
        try (InputStream inputStream = FileManager.class.getResourceAsStream("/data/" + fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            if (inputStream == null) {
                throw new FileNotFoundException("File not found: " + fileName);
            }

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",\\s*");
                if (tokens.length == 5) {
                    String paymentID = tokens[0];
                    String tenantID = tokens[1];
                    double amount = Double.parseDouble(tokens[2]);
                    Date date = dateFormat.parse(tokens[3]);
                    String paymentMethod = tokens[4];
                    Payment payment = new Payment(paymentID, tenantID, amount, date, paymentMethod);
                    payments.add(payment);
                } else {
                    System.err.println("Skipping malformed line: " + line);
                }
            }
        } catch (NullPointerException e) {
            System.err.println("File not found: " + fileName);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return payments;
    }
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
