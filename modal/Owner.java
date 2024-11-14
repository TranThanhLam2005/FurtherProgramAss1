package modal;
import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class Owner extends Person{
//    private ArrayList<Property> propertyList = new ArrayList<Property>();
//    private ArrayList<Host> hostList = new ArrayList<Host>();
//    private ArrayList<RentalAgreement> rentalAgreementList = new ArrayList<RentalAgreement>();
//
//    public Owner(String uid, String fullName, Date dateOfBirth, String contactInfor, ArrayList<Property> propertyList, ArrayList<Host> hostList, ArrayList<RentalAgreement> rentalAgreementList) {
//        super(uid, fullName, dateOfBirth, contactInfor);
//        this.propertyList = propertyList;
//        this.hostList = hostList;
//        this.rentalAgreementList = rentalAgreementList;
//    }
    public Owner(String uid, String fullName, Date dateOfBirth, String contactInfor) {
        super(uid, fullName, dateOfBirth, contactInfor);
    }
    @Override
    public String toString() {
        return "Owner ID: " + getUid() + "\n" + // Assuming getId() is from Person
                "Full Name: " + getFullName() + "\n" + // Assuming getFullName() is from Person
                "Date of Birth: " + getDateOfBirth() + "\n" +
                "Contact Information: " + getContactInfor() + "\n";
    }
}
