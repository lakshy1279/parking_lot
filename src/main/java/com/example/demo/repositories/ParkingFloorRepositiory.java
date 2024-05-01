package com.example.demo.repositories;

import com.example.demo.models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepositiory {
    Map<Integer, ParkingFloor> parkingFloors = new HashMap<>();
    private long parkingFloorId = 0;
    public ParkingFloor save(ParkingFloor parkingFloor) {
        parkingFloor.setId(parkingFloorId++);
        parkingFloors.put(parkingFloor.getFloorNumber(), parkingFloor);
        return parkingFloor;
    }
}
