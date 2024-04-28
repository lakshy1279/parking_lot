package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Spot {
    private Integer spotNo;
    private Integer floorNumber;
    private VehicleType vehicleType;
    private SpotType spotType;
}
