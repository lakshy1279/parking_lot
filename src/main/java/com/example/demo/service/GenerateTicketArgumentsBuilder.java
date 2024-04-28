package com.example.demo.service;

import com.example.demo.models.VehicleType;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class GenerateTicketArgumentsBuilder {
    private String vehicleNo;
    private Long gateId;
    private VehicleType vehicleType;

}
