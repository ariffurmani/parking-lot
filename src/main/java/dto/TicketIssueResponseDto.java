package dto;

import model.ParkingFloor;
import model.ParkingSlot;
import model.ResponseStatus;
import model.Ticket;

public class TicketIssueResponseDto {
    private Ticket ticket;
    private ParkingSlot parkingSlot;
    private ParkingFloor parkingFloor;
    private ResponseStatus status;
    private String message;

    // Constructor
    public TicketIssueResponseDto(Ticket ticket, ParkingSlot parkingSlot, ParkingFloor parkingFloor, ResponseStatus status, String message) {
        this.ticket = ticket;
        this.parkingSlot = parkingSlot;
        this.parkingFloor = parkingFloor;
        this.status = status;
    }

    public TicketIssueResponseDto() {

    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
