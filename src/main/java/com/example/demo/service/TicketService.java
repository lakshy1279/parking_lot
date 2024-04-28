package com.example.demo.service;

import com.example.demo.exceptions.GateNullException;
import com.example.demo.exceptions.NoAvailableSpotExecption;
import com.example.demo.models.*;
import com.example.demo.repositories.*;
import com.example.demo.strategies.spotAssisgnmentStrategies.SpotAssisgnmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {


    GateRepository entryGateRepository;
    VehicleRepository vehicleRepository;
    VehicleService vehicleService;
    SpotAssisgnmentStrategy spotAssisgnmentStrategy;
    TicketRepository ticketRepository;
    ParkingLotRepositiory parkingLotRepository;

    public TicketService(EntryGateRepository entryGateRepository, VehicleRepository vehicleRepository,
                         VehicleService vehicleService, SpotAssisgnmentStrategy spotAssisgnmentStrategy,
                         TicketRepository ticketRepository,ParkingLotRepositiory parkingLotRepository ) {
        this.entryGateRepository = entryGateRepository;
        this.vehicleRepository = vehicleRepository;
        this.vehicleService = vehicleService;
        this.spotAssisgnmentStrategy = spotAssisgnmentStrategy;
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket generateTicket(GenerateTicketArgumentsBuilder response) throws GateNullException, NoAvailableSpotExecption {
        Optional<Gate> gateOptional = entryGateRepository.findGateById(response.getGateId());
        if (gateOptional.isEmpty()) {
            throw new GateNullException();
        }
        Gate gate = gateOptional.get();
        Optional<Vehicle> optionalVehicle = vehicleRepository.findVehicleByNo(response.getVehicleNo());
        Vehicle vehicle;
        if (optionalVehicle.isEmpty()) {
            vehicle = vehicleService.createVehicle(response.getVehicleNo(), response.getVehicleType());
        } else
            vehicle = optionalVehicle.get();
        ParkingLot parkingLot = parkingLotRepository.getParkingLotOfGate(gate);
        Optional<Spot> optionalSpot = spotAssisgnmentStrategy.getEmptySpot(vehicle.getVehicleType(), parkingLot, gate);
        Spot spot;
        if(optionalSpot.isEmpty())
        {
            throw new NoAvailableSpotExecption();
        }
        else
            spot = optionalSpot.get();

        Ticket ticket = new Ticket();
        ticket.setAttendent(gate.getParkingAttendent());
        ticket.setSpot(spot);
        ticket.setVehicle(vehicle);
        ticket.setEntryGate(gate);
        ticket.setEntryTime(new Date());
        ticket = ticketRepository.save(ticket);
        return ticket;
    }
}
