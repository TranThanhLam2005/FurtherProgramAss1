package modal;
import java.io.*;
import java.util.*;


/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class ResidentialProperty extends Property{
    private int numberOfBedrooms;
    private boolean gardenAvailability;
    private boolean petFriendliness;

    public ResidentialProperty(String propertyId, String address, double pricing, String status, Owner owner, ArrayList<Host> hostList, int numberOfBedrooms, boolean gardenAvailability, boolean petFriendliness) {
        super(propertyId, address, pricing, status, owner, hostList);
        this.numberOfBedrooms = numberOfBedrooms;
        this.gardenAvailability = gardenAvailability;
        this.petFriendliness = petFriendliness;
    }
}