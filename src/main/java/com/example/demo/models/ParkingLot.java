package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class ParkingLot extends BaseModels {
    private String name;
    private String address;
    private List<ParkingFloor> floors;
    private List<Gate>entryGates;
    private List<Gate>exitGates;
    private Map<VehicleType, Integer> perHourFees;
}
