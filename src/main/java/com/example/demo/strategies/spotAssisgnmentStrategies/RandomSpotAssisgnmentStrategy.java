package com.example.demo.strategies.spotAssisgnmentStrategies;

import com.example.demo.models.*;

import java.util.Optional;

public class RandomSpotAssisgnmentStrategy implements SpotAssisgnmentStrategy {
    @Override
    public Optional<Spot> getEmptySpot(VehicleType vehicleType, ParkingLot parkingLot, Gate gate) {
        for( ParkingFloor floor : parkingLot.getFloors())
        {
            for(Spot spot : floor.getSpots())
            {
                if(spot.getSpotType().equals(SpotType.EMPTY) && spot.getVehicleType().equals(vehicleType))
                {
                    return Optional.of(spot);
                }
            }
        }
        return Optional.empty();
    }
}
