package model;

import java.util.Date;

public class Ticket extends BaseModel {
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private Date entryTime;
    private Gate entryGate;
    private Operator entryOperator;

    // Constructor
    public Ticket(String id, Vehicle vehicle, ParkingSlot parkingSlot, Date entryTime, Gate entryGate, Operator entryOperator) {
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.entryTime = entryTime;
        this.entryGate = entryGate;
        this.entryOperator = entryOperator;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Operator getEntryOperator() {
        return entryOperator;
    }

    public void setEntryOperator(Operator entryOperator) {
        this.entryOperator = entryOperator;
    }
}
