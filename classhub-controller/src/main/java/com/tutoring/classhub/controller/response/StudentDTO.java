package com.tutoring.classhub.controller.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record StudentDTO(
    UUID id,
    String fullName,
    String email,
    boolean enrolled,
    UUID enrolledClassId,
    LocalDateTime createDate) {
}
