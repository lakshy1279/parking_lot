package com.example.demo.repositories;

import com.example.demo.models.Spot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepositiory {
    Map<Integer, Spot> spots = new HashMap<>();
    private Long lastSavedId = 0L;
    public Spot save(Spot spot) {
        spot.setId(lastSavedId++);
        spots.put(spot.getFloorNumber(), spot);
        return spot;
    }
}
