package dto;

import model.ResponseStatus;

public class TicketIssueResponseDto {
    private String ticketId;
    private String parkingSlotId;
    private String parkingFloorId;
    private ResponseStatus status;

    public TicketIssueResponseDto(String ticketId, String parkingSlotId, String parkingFloorId, ResponseStatus status) {
        this.ticketId = ticketId;
        this.parkingSlotId = parkingSlotId;
        this.parkingFloorId = parkingFloorId;
        this.status = status;
    }

    // Getters
    public String getTicketId() {
        return ticketId;
    }

    public String getParkingSlotId() {
        return parkingSlotId;
    }

    public String getParkingFloorId() {
        return parkingFloorId;
    }

    public ResponseStatus getStatus() {
        return status;
    }
}
