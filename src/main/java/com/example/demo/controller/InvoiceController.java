package com.example.demo.controller;

import com.example.demo.dtos.GenerateInvoiceRequest;
import com.example.demo.dtos.GenerateInvoiceResponseDto;
import com.example.demo.exceptions.GateNullException;
import com.example.demo.exceptions.TicketNullException;
import com.example.demo.models.Invoice;
import com.example.demo.service.InvoiceService;

public class InvoiceController {
    InvoiceService invoiceService;
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
    public GenerateInvoiceResponseDto generateInvoice(GenerateInvoiceRequest request) throws TicketNullException, GateNullException {
        Invoice invoice = invoiceService.generateInvoice(request.getTicketId(), request.getGateId());
         GenerateInvoiceResponseDto responseDto = new GenerateInvoiceResponseDto();
         responseDto.setInvoiceId(invoice.getId());
         responseDto.setAmount(invoice.getAmount());
         responseDto.setExitTime(invoice.getExitTime());
         responseDto.setEntryTime(invoice.getTicket().getEntryTime());
         responseDto.setExitGateNo(invoice.getExitGate().getGateNo());
         return responseDto;
    }
}
