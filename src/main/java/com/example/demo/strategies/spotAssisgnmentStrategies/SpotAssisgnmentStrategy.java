package com.example.demo.strategies.spotAssisgnmentStrategies;

import com.example.demo.models.Gate;
import com.example.demo.models.ParkingLot;
import com.example.demo.models.Spot;
import com.example.demo.models.VehicleType;

import java.util.Optional;

public interface SpotAssisgnmentStrategy {
    Optional<Spot> getEmptySpot(VehicleType vehicleType, ParkingLot parkingLot, Gate gate);
}
