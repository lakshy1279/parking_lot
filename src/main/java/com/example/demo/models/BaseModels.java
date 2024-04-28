package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public abstract class BaseModels {
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
