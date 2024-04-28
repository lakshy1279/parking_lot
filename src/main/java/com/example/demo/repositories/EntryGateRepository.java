package com.example.demo.repositories;

import com.example.demo.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class EntryGateRepository implements GateRepository {

    private Map<Long, Gate> gates = new TreeMap<>();
    public Optional<Gate> findGateById(Long id) {
        if(gates.containsKey(id)) {
            return Optional.of(gates.get(id));
        }
        return Optional.empty();
    }
}
