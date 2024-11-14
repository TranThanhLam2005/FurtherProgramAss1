package modal;
import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class CommercialProperty extends Property{
    private String businessType;
    private int parkingSpaces;
    private double squareFootage;

    public CommercialProperty(String propertyId, String address, double pricing, String status, String ownerID, String businessType, int parkingSpaces, double squareFootage) {
        super(propertyId, address, pricing, status, ownerID);
        this.businessType = businessType;
        this.parkingSpaces = parkingSpaces;
        this.squareFootage = squareFootage;
    }
}
