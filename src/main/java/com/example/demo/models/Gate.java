package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Gate extends BaseModels {
    int gateNo;
    private ParkingAttendant parkingAttendent;
}
