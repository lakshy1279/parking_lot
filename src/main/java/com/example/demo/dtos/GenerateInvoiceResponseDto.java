package com.example.demo.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class GenerateInvoiceResponseDto {
    private Integer amount;
    private Date exitTime;
    private Integer exitGateNo;
    private Date entryTime;
    private Long InvoiceId;
}
