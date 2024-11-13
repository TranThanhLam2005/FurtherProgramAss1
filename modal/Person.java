package modal;
import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */
abstract class Person {
    private String Uid;
    private String fullName;
    private Date dateOfBirth;
    private String contactInfor;

    public Person(String uid, String fullName, Date dateOfBirth, String contactInfor) {
        this.Uid = uid;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contactInfor = contactInfor;
    }

    public String getUid() {
        return Uid;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContactInfor() {
        return contactInfor;
    }
}
