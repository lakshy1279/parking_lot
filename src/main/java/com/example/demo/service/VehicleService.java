package com.example.demo.service;

import com.example.demo.models.Vehicle;
import com.example.demo.models.VehicleType;
import com.example.demo.repositories.VehicleRepository;

public class VehicleService {
    VehicleRepository repository;
    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
    }
    public Vehicle createVehicle(String vehicleNo, VehicleType  vehicleType) {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleNo(vehicleNo);
        vehicle.setVehicleType(vehicleType);
        repository.save(vehicle);
        return vehicle;
    }
}
