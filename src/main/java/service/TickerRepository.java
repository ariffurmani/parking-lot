package service;

import model.Ticket;

public interface TickerRepository {
    public Ticket save(Ticket ticket);
}
