package service;

import dto.TicketIssueResponseDto;
import model.*;
import repository.GateRepository;
import repository.GateRepositoryImpl;
import repository.VehicleRepository;
import repository.VehicleRepositoryImpl;

import java.util.Date;
import java.util.Optional;

public class TicketServiceImpl implements TicketService {

    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    FindSlotStrategy findSlotStrategy;
    ParkingLotRepository parkingLotRepository;
    TickerRepository ticketRepository;

    public TicketServiceImpl(GateRepository gateRepository, VehicleRepository vehicleRepository, FindSlotStrategy findSlotStrategy, ParkingLotRepository parkingLotRepository, TickerRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.findSlotStrategy = findSlotStrategy;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public TicketIssueResponseDto issueTicket(String vehicleNumber, VehicleType vehicleType, String entryGateId, Date entryTime, String operatorId) {
        // Logic to issue a ticket
        TicketIssueResponseDto response = new TicketIssueResponseDto();

        // fetch Gate details using entryGateId
        Optional<Gate> gateOptional = gateRepository.findById(entryGateId);
        if (!gateOptional.isPresent()) {
            response.setStatus(ResponseStatus.FAILURE);
            response.setMessage("Invalid entry gate ID");
            return response;
        }

        Vehicle vehicle;
        Optional<Vehicle> existingVehicle = vehicleRepository.findByVehicleNumber(vehicleNumber);
        if (existingVehicle.isPresent()) {
            vehicle = existingVehicle.get();
        } else {
            vehicle = new Vehicle(vehicleNumber, vehicleType, "OWNER001");
            vehicleRepository.save(vehicle);
        }

        Optional<ParkingLot> parkingLot = parkingLotRepository.findById(1);
        if (!parkingLot.isPresent()) {
            response.setStatus(ResponseStatus.FAILURE);
            response.setMessage("Parking lot not found");
            return response;
        }
        if (!parkingLot.get().getStatus().equals(Status.AVAILABLE)) {
            response.setStatus(ResponseStatus.FAILURE);
            response.setMessage("No slots available for vehicle type: " + vehicleType);
            return response;
        }
        ParkingSlot slot = findSlotStrategy.findSlot(vehicleType, parkingLot.get());

        Ticket ticket = new Ticket(vehicle, slot, entryTime, gateOptional.get(), gateOptional.get().getOperator());

        ticketRepository.save(ticket);

        response.setStatus(ResponseStatus.SUCCESS);
        response.setMessage("Ticket issued");
        response.setTicket(ticket);
//        response.set`

        return response;
    }
}
