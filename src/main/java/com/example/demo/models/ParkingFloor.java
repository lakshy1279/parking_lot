package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ParkingFloor extends BaseModels {
    List<Spot> spots;
    Integer floorNumber;
    DisplayBoard displayBoard;
    PayemntCounter payemntCounter;
}
