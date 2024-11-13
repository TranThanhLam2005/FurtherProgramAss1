package modal;

import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class RentalAgreement {
    private String Aid;
    private Tenant mainTenant;
    private ArrayList<Tenant> subTenants = new ArrayList<Tenant>();
    private Property propertyLeased;
    private String period; // (daily, weekly, fortnightly, monthly, etc.)
    private Date contractDate;
    private double rentingFee;
    private String status; // (New, Active, Completed)


    // Getters, setters and other methods
}
