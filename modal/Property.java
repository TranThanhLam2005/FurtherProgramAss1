package modal;
import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class Property {
    private String propertyId;
    private String address;
    private double pricing;
    private String status; // (Available, Rented, Under Maintenance)
    private Owner owner;
    private ArrayList<Host> hostList;

    public Property(String propertyId, String address, double pricing, String status, Owner owner, ArrayList<Host> hostList) {
        this.propertyId = propertyId;
        this.address = address;
        this.pricing = pricing;
        this.status = status;
        this.owner = owner;
        this.hostList = hostList;
    }

    // Getters, setters and other methods
}
