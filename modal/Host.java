package modal;
import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */


public class Host extends Person{
    private ArrayList<Property> managePropertyList;
    private ArrayList<Owner> cooperateOwnerList;
    private ArrayList<RentalAgreement> rentalAgreementList;

    public Host(String uid, String fullName, String dateOfBirth, String contactInfor, ArrayList<Property> managePropertyList, ArrayList<Owner> cooperateOwnerList, ArrayList<RentalAgreement> rentalAgreementList) {
        super(uid, fullName, dateOfBirth, contactInfor);
        this.managePropertyList = managePropertyList;
        this.cooperateOwnerList = cooperateOwnerList;
        this.rentalAgreementList = rentalAgreementList;
    }

}
