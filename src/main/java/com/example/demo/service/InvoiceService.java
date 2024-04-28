package com.example.demo.service;

import com.example.demo.exceptions.GateNullException;
import com.example.demo.exceptions.TicketNullException;
import com.example.demo.models.Gate;
import com.example.demo.models.Invoice;
import com.example.demo.models.ParkingLot;
import com.example.demo.models.Ticket;
import com.example.demo.repositories.GateRepository;
import com.example.demo.repositories.ParkingLotRepositiory;
import com.example.demo.repositories.TicketRepository;
import com.example.demo.strategies.spotAssisgnmentStrategies.feeCalculationStrategy.FeeCalculationStrategy;

import java.util.Date;
import java.util.Optional;

public class InvoiceService {

    TicketRepository ticketRepository;
    GateRepository gateRepository;
    FeeCalculationStrategy feeCalculationStrategy;
    ParkingLotRepositiory parkingLotRepository;
    public InvoiceService(ParkingLotRepositiory parkingLotRepository, FeeCalculationStrategy feeCalculationStrategy,
                          TicketRepository ticketRepository,
                          GateRepository gateRepository) {
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
        this.feeCalculationStrategy = feeCalculationStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }
    public Invoice generateInvoice(Long ticketId, Long gateId) throws GateNullException, TicketNullException {

        Optional<Ticket> optionalTicket = ticketRepository.getTicketById(ticketId);
        Ticket ticket;
        if(optionalTicket.isEmpty())
        {
            throw new TicketNullException();
        }
        else
            ticket = optionalTicket.get();
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);
        Gate gate;
        if(optionalGate.isEmpty())
        {
            throw new GateNullException();
        }
        else
            gate = optionalGate.get();
        ParkingLot parkingLot = parkingLotRepository.getParkingLotOfGate(gate);
        Date exitTime = new Date();
        Integer amount = feeCalculationStrategy.getParkingFee(ticket, exitTime, parkingLot);
        Invoice invoice = new Invoice();
        invoice.setAmount(amount);
        invoice.setTicket(ticket);
        invoice.setExitGate(gate);
        invoice.setExitTime(exitTime);
        return invoice;
    }
}
