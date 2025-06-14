package model;

import java.util.Date;

public class Ticket {
    private String ticketId;
    private String vehicleId;
    private String parkingSlotId;
    private Date entryTime;

    // Constructor
    public Ticket(String ticketId, String vehicleId, String parkingSlotId, Date entryTime) {
        this.ticketId = ticketId;
        this.vehicleId = vehicleId;
        this.parkingSlotId = parkingSlotId;
        this.entryTime = entryTime;
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
}
