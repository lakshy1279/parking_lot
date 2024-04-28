package com.example.demo.repositories;

import com.example.demo.models.Gate;

import java.util.Optional;

public interface GateRepository {
    Optional<Gate> findGateById(Long id);
}
