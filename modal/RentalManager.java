package modal;
import java.io.*;
import java.util.*;


/**
 * @author <Tran Thanh Lam - s4038329>
 */
interface RentalManager {
    void addRentalAgreement(RentalAgreement rentalAgreement);
    void updateRentalAgreement(String agreementId, RentalAgreement updatedAgreement);
    void deleteRentalAgreement(String agreementId);
    RentalAgreement getRentalAgreement(String agreementId);

    ArrayList<RentalAgreement> getAllRentalAgreements();
    ArrayList<RentalAgreement> getRentalAgreementsByOwnerName(String ownerName);
    ArrayList<RentalAgreement> getRentalAgreementsByPropertyAddress(String propertyAddress);
    ArrayList<RentalAgreement> getRentalAgreementsByStatus(String status);
}
