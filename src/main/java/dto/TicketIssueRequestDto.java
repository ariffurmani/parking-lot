package dto;

import model.VehicleType;

import java.util.Date;

public class TicketIssueRequestDto {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String entryGateId;
    private Date entryTime;
    private String operatorId;

    public TicketIssueRequestDto(String vehicleNumber, VehicleType vehicleType, String entryGateId, Date entryTime, String operatorId) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.entryGateId = entryGateId;
        this.entryTime = entryTime;
        this.operatorId = operatorId;
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

}
