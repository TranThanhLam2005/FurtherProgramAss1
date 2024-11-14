package modal;
import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */
public class Payment {
    private String paymentId;
    private String tenantId;
    private double amount;
    private Date date;
    private String paymentMethod;

    public Payment(String paymentId, String tenantId, double amount, Date date, String paymentMethod) {
        this.paymentId = paymentId;
        this.tenantId = tenantId;
        this.amount = amount;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "Payment ID: " + paymentId + "\n" +
                "Amount: " + amount + "\n" +
                "Date: " + date + "\n" +
                "Payment Method: " + paymentMethod;
    }
}
