package com.example.demo.strategies.spotAssisgnmentStrategies.feeCalculationStrategy;

import com.example.demo.models.ParkingLot;
import com.example.demo.models.Ticket;
import com.example.demo.models.VehicleType;

import java.util.Date;
import java.util.Map;

public class PerHourFeeCalculation implements FeeCalculationStrategy {

    @Override
    public Integer getParkingFee(Ticket ticket, Date exitTime, ParkingLot parkingLot) {
        Date entryTime = ticket.getEntryTime();
        VehicleType type = ticket.getVehicle().getVehicleType();
        int noOfhours = (int) (entryTime.getTime() - exitTime.getTime()) / (24 * 60 * 60);
        return noOfhours * parkingLot.getPerHourFees().get(type);
    }
}
