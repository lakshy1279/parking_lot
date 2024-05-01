package com.example.demo.controller;

import com.example.demo.models.ParkingFloor;
import com.example.demo.service.ParkingFloorService;

public class ParkingFloorController {
    ParkingFloorService parkingFloorService;
    ParkingFloorController(ParkingFloorService parkingFloorService)
    {
        this.parkingFloorService = parkingFloorService;
    }
    public ParkingFloor createParkingFloor(int floorNo) {
        return parkingFloorService.createParkingFloor(floorNo);
    }
}
