package com.tutoring.classhub.domain.command;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class CreateClassRoomCommand {
    private String title;
    private BigDecimal pricePerStudent;
}
