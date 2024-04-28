package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class Ticket extends BaseModels {
    private Date entryTime;
    private Gate entryGate;
    private Spot spot;
    private Vehicle vehicle;
    private ParkingAttendant attendent;
}
