package org.example;

import controller.TicketController;
import dto.TicketIssueRequestDto;
import dto.TicketIssueResponseDto;
import model.VehicleType;
import service.TicketServiceImpl;

import java.util.Date;

public class ParkingLotApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Parking Lot Management System!");

        TicketController controller = new TicketController(new TicketServiceImpl());
        // Example usage of the controller to issue a ticket
         TicketIssueRequestDto requestDto = new TicketIssueRequestDto("ABC123", VehicleType.FOUR_WHEELER, "GATE1", new Date(), "OPERATOR1", "001");
         TicketIssueResponseDto responseDto = controller.issueTicket(requestDto);
         System.out.println("Ticket issued: " + responseDto.getTicketId());

    }
}
