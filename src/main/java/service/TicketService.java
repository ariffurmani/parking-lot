package service;

import dto.TicketIssueResponseDto;
import model.VehicleType;

import java.util.Date;

public interface TicketService {
    public TicketIssueResponseDto issueTicket(String vehicleNumber, VehicleType vehicleType, String entryGateId, Date entryTime, String operatorId);
}
