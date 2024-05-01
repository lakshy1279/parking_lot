package com.example.demo.service;

import com.example.demo.models.DisplayBoard;
import com.example.demo.models.ParkingFloor;
import com.example.demo.models.PayemntCounter;
import com.example.demo.repositories.ParkingFloorRepositiory;

public class ParkingFloorService {
    ParkingFloorRepositiory parkingFloorRepositiory;
    public ParkingFloor createParkingFloor(int floorNo) {
        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setFloorNumber(floorNo);
        DisplayBoard displayBoard = new DisplayBoard();
        PayemntCounter payemntCounter = new PayemntCounter();
        parkingFloor.setDisplayBoard(displayBoard);
        parkingFloor.setPayemntCounter(payemntCounter);
        return parkingFloorRepositiory.save(parkingFloor);
    }
}
