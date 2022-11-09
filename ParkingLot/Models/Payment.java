package Projects.ParkingLot.Models;

import java.util.Date;

public class Payment extends BaseModel {
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private Invoice invoice;
    private Date timeOfPayment;
    private double amount;
    private String referenceNumber;
}
