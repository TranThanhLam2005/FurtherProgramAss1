package modal;
import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class CommercialProperty extends Property{
    private String businessType;
    private double parkingSpaces;
    private double squareFootage;

    public CommercialProperty(String propertyId, String address, double pricing, String status, Owner owner, ArrayList<Host> hostList, String businessType, double parkingSpaces, double squareFootage) {
        super(propertyId, address, pricing, status, owner, hostList);
        this.businessType = businessType;
        this.parkingSpaces = parkingSpaces;
        this.squareFootage = squareFootage;
    }
}
