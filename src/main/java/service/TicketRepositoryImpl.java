package service;

import model.Ticket;

import java.util.HashMap;

public class TicketRepositoryImpl implements  TickerRepository {

    HashMap<Integer, Ticket> tickets = new HashMap<>();
    @Override
    public Ticket save(Ticket ticket) {
        // Implementation to save a ticket
        tickets.put(ticket.getId(), ticket);
        return ticket;
    }
}
