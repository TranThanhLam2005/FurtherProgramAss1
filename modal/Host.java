package modal;
import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */


public class Host extends Person{
    private ArrayList<Property> managePropertyList = new ArrayList<Property>();
    private ArrayList<Owner> cooperateOwnerList = new ArrayList<Owner>();
    private ArrayList<RentalAgreement> rentalAgreementList = new ArrayList<RentalAgreement>();

    public Host(String uid, String fullName, Date dateOfBirth, String contactInfor, ArrayList<Property> managePropertyList, ArrayList<Owner> cooperateOwnerList, ArrayList<RentalAgreement> rentalAgreementList) {
        super(uid, fullName, dateOfBirth, contactInfor);
        this.managePropertyList = managePropertyList;
        this.cooperateOwnerList = cooperateOwnerList;
        this.rentalAgreementList = rentalAgreementList;
    }
    public Host(String uid, String fullName, Date dateOfBirth, String contactInfor) {
        super(uid, fullName, dateOfBirth, contactInfor);
    }
    @Override
    public String toString() {
        return "Host ID: " + getUid() + "\n" + // Assuming getId() is from Person
                "Full Name: " + getFullName() + "\n" + // Assuming getFullName() is from Person
                "Date of Birth: " + getDateOfBirth() + "\n" +
                "Contact Information: " + getContactInfor() + "\n";
    }
}
