package modal;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class Property {
    private String propertyId;
    private String address;
    private double pricing;
    private String status; // (Available, Rented, Under Maintenance)
    private String ownerID;

    public Property(String propertyId, String address, double pricing, String status, String ownerID) {
        this.propertyId = propertyId;
        this.address = address;
        this.pricing = pricing;
        this.status = status;
        this.ownerID = ownerID;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public String getAddress() {
        return address;
    }

    public double getPricing() {
        return pricing;
    }

    public String getStatus() {
        return status;
    }

    public String getOwnerID() {
        return ownerID;
    }

    // Getters, setters and other methods
}
