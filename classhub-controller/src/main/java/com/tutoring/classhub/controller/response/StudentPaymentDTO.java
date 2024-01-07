package com.tutoring.classhub.controller.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record StudentPaymentDTO(
    UUID id,
    UUID classRoomId,
    UUID studentId,
    BigDecimal amount,
    boolean paid,
    LocalDateTime createdDate,
    LocalDateTime updatedDate
) {

}
