package model;

import java.util.Date;

public class Ticket {
    private String ticketId;
    private String vehicleId;
    private String parkingSlotId;
    private Date entryTime;
    private Gate entryGate;
    private Operator entryOperator;

    // Constructor
    public Ticket(String ticketId, String vehicleId, String parkingSlotId, Date entryTime, Gate entryGate, Operator entryOperator) {
        this.ticketId = ticketId;
        this.vehicleId = vehicleId;
        this.parkingSlotId = parkingSlotId;
        this.entryTime = entryTime;
        this.entryGate = entryGate;
        this.entryOperator = entryOperator;
    }
    // Getters
    public String getTicketId() {
        return ticketId;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public String getParkingSlotId() {
        return parkingSlotId;
    }
    public Date getEntryTime() {
        return entryTime;
    }
    public Gate getEntryGate() {
        return entryGate;
    }
    public Operator getEntryOperator() {
        return entryOperator;
    }
}
