package model;

import java.util.Date;

public class Bill {
    private String billId;
    private String vehicleId;
    private String ticketId;
    private String paymentId;
    private double amount;
    private Date exitTime;

    public Bill(String billId, String vehicleId, String ticketId, String paymentId, double amount, Date exitTime) {
        this.billId = billId;
        this.vehicleId = vehicleId;
        this.ticketId = ticketId;
        this.paymentId = paymentId;
        this.amount = amount;
        this.exitTime = exitTime;
    }

    // Getters and Setters
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }
}
