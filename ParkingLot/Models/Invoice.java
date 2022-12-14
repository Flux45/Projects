package Projects.ParkingLot.Models;

import java.util.Date;
import java.util.List;

public class Invoice extends BaseModel {

    private Ticket ticket;
    private double amount;
    private Operator operator;
    private Date exitTime;
    private InvoicePaidStatus invoicePaidStatus;
    private List<Payment> payments;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public InvoicePaidStatus getInvoicePaidStatus() {
        return invoicePaidStatus;
    }

    public void setInvoicePaidStatus(InvoicePaidStatus invoicePaidStatus) {
        this.invoicePaidStatus = invoicePaidStatus;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
