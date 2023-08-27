package com.goldi.exception;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MyErrorDetails {
    private LocalDate time;
    private String message;
    private String details;
}
