package com.example.demo.exceptions;

public class TicketNullException extends Exception {
    public TicketNullException() {
        super("Ticket is null");
    }
}
