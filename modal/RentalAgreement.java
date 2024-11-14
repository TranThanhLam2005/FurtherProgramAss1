package modal;

import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class RentalAgreement {
    private String Aid;
    private String OwnerID;
    private String mainTenantID;
    private String propertyLeasedID;
    private String period; // (daily, weekly, fortnightly, monthly, etc.)
    private Date contractDate;
    private double rentingFee;
    private String status; // (New, Active, Completed)

    public RentalAgreement(String aid,String OwnerID, String mainTenantID, String propertyLeasedID, String period, Date contractDate, double rentingFee, String status) {
        this.Aid = aid;
        this.OwnerID = OwnerID;
        this.mainTenantID = mainTenantID;
        this.propertyLeasedID = propertyLeasedID;
        this.period = period;
        this.contractDate = contractDate;
        this.rentingFee = rentingFee;
        this.status = status;
    }

    public String getAid() {
        return Aid;
    }

    public String getOwnerID() {
        return OwnerID;
    }

    public String getMainTenantID() {
        return mainTenantID;
    }

    public String getPeriod() {
        return period;
    }

    public String getPropertyLeasedID() {
        return propertyLeasedID;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public double getRentingFee() {
        return rentingFee;
    }

    public String getStatus() {
        return status;
    }


    // Getters, setters and other methods
}
