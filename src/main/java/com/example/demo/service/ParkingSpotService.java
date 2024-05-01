package com.example.demo.service;

import com.example.demo.models.Spot;
import com.example.demo.models.SpotType;
import com.example.demo.models.VehicleType;
import com.example.demo.repositories.ParkingSpotRepositiory;

public class ParkingSpotService {
    ParkingSpotRepositiory parkingSpotRepositiory;
    ParkingSpotService(ParkingSpotRepositiory parkingSpotRepositiory)
    {
        this.parkingSpotRepositiory = parkingSpotRepositiory;
    }
    public Spot createParkingSpot(int spotNo, int floorNo, VehicleType vehicleType)
    {
        Spot spot = new Spot();
        spot.setSpotNo(spotNo);
        spot.setFloorNumber(floorNo);
        spot.setVehicleType(vehicleType);
        spot.setSpotType(SpotType.EMPTY);
        Spot spotResponse = parkingSpotRepositiory.save(spot);
        return spotResponse;
    }
}
