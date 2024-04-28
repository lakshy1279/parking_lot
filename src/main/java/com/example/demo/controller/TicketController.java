package com.example.demo.controller;

import com.example.demo.dtos.GenerateTicketResponseDto;
import com.example.demo.dtos.GenerateTicketRequest;
import com.example.demo.exceptions.GateNullException;
import com.example.demo.exceptions.NoAvailableSpotExecption;
import com.example.demo.models.Ticket;
import com.example.demo.models.VehicleType;
import com.example.demo.service.GenerateTicketArgumentsBuilder;
import com.example.demo.service.TicketService;

public class TicketController {

    TicketService ticketService;
    public GenerateTicketResponseDto generateTicket(GenerateTicketRequest request) throws NoAvailableSpotExecption, GateNullException {
        String vehicleNo = request.getVehicleNo();
        VehicleType vehicleType = request.getVehicleType();
        Long gateId = request.getGateId();
        GenerateTicketArgumentsBuilder generateTicketArgumentsBuilder = GenerateTicketArgumentsBuilder.builder().gateId(gateId).vehicleNo(vehicleNo).vehicleType(vehicleType).build();
        Ticket ticket = ticketService.generateTicket(generateTicketArgumentsBuilder);
        GenerateTicketResponseDto response = new GenerateTicketResponseDto();
        response.setTicketId(ticket.getId());
        response.setSpotNumber(ticket.getSpot().getSpotNo());
        response.setOperatorName(ticket.getAttendent().getName());
        return response;
    }

}
