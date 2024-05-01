package com.example.demo.controller;

import com.example.demo.models.Spot;
import com.example.demo.models.VehicleType;
import com.example.demo.service.ParkingSpotService;

public class ParkingSpotController {
    ParkingSpotService parkingSpotService;
    ParkingSpotController(ParkingSpotService parkingSpotService)
    {
        this.parkingSpotService = parkingSpotService;
    }
    public Spot createParkingSpot(int spotNo, int floorNumber, VehicleType vehicleType)
    {
       return parkingSpotService.createParkingSpot(spotNo, floorNumber, vehicleType);
    }
}
