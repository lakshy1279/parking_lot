package com.example.demo.repositories;

import com.example.demo.models.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TicketRepository {
    private Map<Long, Ticket> tickets = new HashMap<Long, Ticket>();
    private Long lastSavedId = 0L;
    public Ticket save(Ticket ticket) {
        ticket.setId(lastSavedId++);
        tickets.put(ticket.getId(), ticket);
        return ticket;
    }

    public Optional<Ticket> getTicketById(Long id) {
        return Optional.of(tickets.get(id));
    }
}
