package model;

import java.util.Date;

public class Bill extends BaseModel {
    private Vehicle vehicle;
    private Ticket ticket;
    private Payment payment;
    private double amount;
    private Date exitTime;

    public Bill(Vehicle vehicle, Ticket ticket, Payment payment, double amount, Date exitTime) {
        this.vehicle = vehicle;
        this.ticket = ticket;
        this.payment = payment;
        this.amount = amount;
        this.exitTime = exitTime;
    }

    // Getters and Setters
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
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
