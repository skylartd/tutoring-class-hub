package com.tutoring.classhub.controller.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record ClassRoomDTO(
    UUID id,
    String title,
    BigDecimal pricePerStudent,
    boolean active,
    List<StudentDTO> students,
    List<StudentPaymentDTO> studentPayments,
    LocalDateTime createdDate,
    LocalDateTime updatedDate) {
}
