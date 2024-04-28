package com.example.demo.models;

public class Payment extends BaseModels{
    private Integer amount;
    private PaymentStatus paymentStatus;
    private Invoice invoice;
    private String paymentRefId;
    private PayemtType payemtType;
}
