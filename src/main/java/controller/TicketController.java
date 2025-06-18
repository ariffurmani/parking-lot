package controller;

import dto.TicketIssueRequestDto;
import dto.TicketIssueResponseDto;
import service.TicketService;

public class TicketController {

    // This class will handle ticket-related operations such as issuing tickets, validating tickets, etc.
    // It will interact with the TicketService to perform these operations.

    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketIssueResponseDto issueTicket(TicketIssueRequestDto ticketIssueRequestDto) {
        return ticketService.issueTicket(ticketIssueRequestDto.getVehicleNumber(),
                ticketIssueRequestDto.getVehicleType(),
                ticketIssueRequestDto.getEntryGateId(),
                ticketIssueRequestDto.getEntryTime(),
                ticketIssueRequestDto.getOperatorId());

    }

}
