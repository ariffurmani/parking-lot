package service;

import dto.TicketIssueResponseDto;
import model.Gate;
import model.ResponseStatus;
import model.Vehicle;
import model.VehicleType;
import repository.GateRepository;
import repository.GateRepositoryImpl;
import repository.VehicleRepository;
import repository.VehicleRepositoryImpl;

import java.util.Date;
import java.util.Optional;

public class TicketServiceImpl implements TicketService {

    GateRepository gateRepository = new GateRepositoryImpl();
    VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
    FindSlotStrategy findSlotStrategy = new FindSlotStrategyImpl();

    @Override
    public TicketIssueResponseDto issueTicket(String vehicleNumber, VehicleType vehicleType, String entryGateId, Date entryTime, String operatorId) {
        // Logic to issue a ticket
        TicketIssueResponseDto response = new TicketIssueResponseDto("TICKET123", "SLOT456", "FLOOR789", ResponseStatus.SUCCESS);

        // fetch Gate details using entryGateId
        Optional<Gate> gateOptional = gateRepository.findById(entryGateId);

        Vehicle vehicle = new Vehicle(vehicleNumber, vehicleType, null); // Assuming ticket is null for now

        vehicleRepository.save(vehicle);




        return response;
    }
}
