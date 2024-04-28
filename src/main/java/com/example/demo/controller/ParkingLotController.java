package com.example.demo.controller;

import com.example.demo.dtos.ParkingLotRequest;
import com.example.demo.models.ParkingLot;
import com.example.demo.service.ParkingLotService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/parking-lot")
public class ParkingLotController {

  ParkingLotService parkingLotService;
  @PostMapping
  public void createParkingLot(@RequestBody ParkingLotRequest request)
  {

  }

  @GetMapping("/{id}")
  public void getParkingLot(@PathVariable("id") Long id)
  {

  }
}
