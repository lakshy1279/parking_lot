package com.example.demo.repositories;

import com.example.demo.models.Gate;
import com.example.demo.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepositiory {
    Map<Long, ParkingLot> parkingLots = new TreeMap<>();

    public ParkingLot getParkingLotOfGate(Gate gate) {
        for(ParkingLot parkingLot : parkingLots.values()) {
            if(parkingLot.getEntryGates().contains(gate)) {
                return parkingLot;
            }
        }
        return null;
    }
}
