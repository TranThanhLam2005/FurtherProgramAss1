package modal;
import java.io.*;
import java.util.*;


/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class Tenant extends Person{
    private ArrayList<RentalAgreement> agreementList;
    private ArrayList<Payment> paymentList;

    public Tenant(String uid, String fullName, String dateOfBirth, String contactInfor) {
        super(uid, fullName, dateOfBirth, contactInfor);
        this.agreementList = new ArrayList<RentalAgreement>();
        this.paymentList = new ArrayList<Payment>();
    }
}
