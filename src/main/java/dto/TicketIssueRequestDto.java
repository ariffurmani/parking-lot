package dto;

import model.VehicleType;

import java.util.Date;

public class TicketIssueRequestDto {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String entryGateId;
    private Date entryTime;
    private String operatorId;
    private String parkingLotId;

    public TicketIssueRequestDto(String vehicleNumber, VehicleType vehicleType, String entryGateId, Date entryTime, String operatorId, String parkingLotId) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.entryGateId = entryGateId;
        this.entryTime = entryTime;
        this.operatorId = operatorId;
        this.parkingLotId = parkingLotId;
    }

    // Getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public String getEntryGateId() {
        return entryGateId;
    }
    public Date getEntryTime() {
        return entryTime;
    }
    public String getOperatorId() {
        return operatorId;
    }
    public String getParkingLotId() {
        return parkingLotId;
    }
}
