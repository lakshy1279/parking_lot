package com.example.demo.dtos;

import com.example.demo.models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateTicketRequest {
    private String VehicleNo;
    private VehicleType vehicleType;
    private Long gateId;

}
