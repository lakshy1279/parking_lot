package com.example.demo.strategies.spotAssisgnmentStrategies.feeCalculationStrategy;

import com.example.demo.models.ParkingLot;
import com.example.demo.models.Ticket;

import java.util.Date;

public interface FeeCalculationStrategy {

    Integer getParkingFee(Ticket ticket, Date exitTime, ParkingLot parkingLot);
}
