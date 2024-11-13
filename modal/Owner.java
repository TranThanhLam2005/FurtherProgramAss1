package modal;
import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class Owner extends Person{
    private ArrayList<Property> propertyList;
    private ArrayList<Host> hostList;
    private ArrayList<RentalAgreement> rentalAgreementList;

    public Owner(String uid, String fullName, String dateOfBirth, String contactInfor, ArrayList<Property> propertyList, ArrayList<Host> hostList, ArrayList<RentalAgreement> rentalAgreementList) {
        super(uid, fullName, dateOfBirth, contactInfor);
        this.propertyList = propertyList;
        this.hostList = hostList;
        this.rentalAgreementList = rentalAgreementList;
    }
}
