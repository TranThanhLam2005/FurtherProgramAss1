package modal;
import java.io.*;
import java.util.*;

/**
 * @author <Tran Thanh Lam - s4038329>
 */
abstract class Person {
    private String Uid;
    private String fullName;
    private String dateOfBirth;
    private String contactInfor;

    public Person(String uid, String fullName, String dateOfBirth, String contactInfor) {
        this.Uid = uid;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contactInfor = contactInfor;
    }
}
