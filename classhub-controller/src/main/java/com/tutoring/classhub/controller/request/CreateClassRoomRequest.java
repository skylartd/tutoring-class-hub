package com.tutoring.classhub.controller.request;

import java.math.BigDecimal;

public record CreateClassRoomRequest(
    String title,
    BigDecimal pricePerStudent
) {
}
