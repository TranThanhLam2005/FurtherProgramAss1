package modal;
import java.io.*;
import java.util.*;


/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class Tenant extends Person{
    private ArrayList<RentalAgreement> agreementList = new ArrayList<RentalAgreement>();
    private ArrayList<Payment> paymentList = new ArrayList<Payment>();
    private ArrayList<Property> propertyRentList = new ArrayList<Property>();


    public Tenant(String uid, String fullName, Date dateOfBirth, String contactInfor, ArrayList<RentalAgreement> agreementList, ArrayList<Payment> paymentList, ArrayList<Property> propertyRentList) {
        super(uid, fullName, dateOfBirth, contactInfor);
        this.agreementList = agreementList;
        this.paymentList = paymentList;
        this.propertyRentList = propertyRentList;
    }
    public Tenant(String uid, String fullName, Date dateOfBirth, String contactInfor) {
        super(uid, fullName, dateOfBirth, contactInfor);
    }
    @Override
    public String toString() {
        return "Tenant ID: " + getUid() + "\n" + // Assuming getId() is from Person
                "Full Name: " + getFullName() + "\n" + // Assuming getFullName() is from Person
                "Date of Birth: " + getDateOfBirth() + "\n" +
                "Contact Information: " + getContactInfor() + "\n";
    }
}
