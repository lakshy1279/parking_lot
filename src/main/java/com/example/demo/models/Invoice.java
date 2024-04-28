package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Invoice extends BaseModels{
    private Integer amount;
    private Date exitTime;
    private Ticket ticket;
    private Gate exitGate;
}
