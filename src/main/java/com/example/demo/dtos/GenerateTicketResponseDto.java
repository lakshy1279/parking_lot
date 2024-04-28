package com.example.demo.dtos;

import lombok.Setter;

@Setter
public class GenerateTicketResponseDto {
    private Long ticketId;
    private String operatorName;
    private Integer SpotNumber;
    private ResponseStatus status;
}
