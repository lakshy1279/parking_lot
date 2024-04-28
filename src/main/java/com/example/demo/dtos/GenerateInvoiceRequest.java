package com.example.demo.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateInvoiceRequest {
    private Long ticketId;
    private Long gateId;
}
