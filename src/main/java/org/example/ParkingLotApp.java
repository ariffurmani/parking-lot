package org.example;

import controller.TicketController;
import dto.TicketIssueRequestDto;
import dto.TicketIssueResponseDto;
import model.ResponseStatus;
import model.VehicleType;
import repository.*;
import service.*;

import java.util.Date;

public class ParkingLotApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Parking Lot Management System!");

        GateRepository gateRepository = new GateRepositoryImpl(); // Assuming GateRepository is implemented
        VehicleRepository vehicleRepository = new VehicleRepositoryImpl(); // Assuming VehicleRepository is implemented
        FindSlotStrategy findSlotStrategy = new FindSlotStrategyImpl(); // Assuming FindSlotStrategy is implemented
        ParkingLotRepository parkingLotRepository = new ParkingLotRepositoryImpl(); // Assuming ParkingLotRepository is implemented
        TicketRepository ticketRepository = new TicketRepositoryImpl(); // Assuming TickerRepository is implemented

        TicketService ticketService = new TicketServiceImpl(gateRepository, vehicleRepository, findSlotStrategy, parkingLotRepository, ticketRepository);

        TicketController controller = new TicketController(ticketService);
        // Example usage of the controller to issue a ticket
         TicketIssueRequestDto requestDto = new TicketIssueRequestDto("ABC123", VehicleType.FOUR_WHEELER, "gate1", new Date(), "OPERATOR1", "1");
         TicketIssueResponseDto responseDto = controller.issueTicket(requestDto);
         if (responseDto != null && responseDto.getStatus() != null && responseDto.getStatus().equals(ResponseStatus.FAILURE)) {
             System.out.println("Error: " + responseDto.getMessage());
         } else {
                System.out.println("Ticket issued successfully!");
                System.out.println("Slot ID: " + responseDto.getTicket().getParkingSlot().getSlotNumber());
         }

    }
}
