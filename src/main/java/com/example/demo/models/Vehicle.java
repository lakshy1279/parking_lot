package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicle extends BaseModels {
    private String VehicleNo;
    private VehicleType vehicleType;
}
