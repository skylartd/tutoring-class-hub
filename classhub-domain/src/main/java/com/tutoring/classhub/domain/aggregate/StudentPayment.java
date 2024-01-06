package com.tutoring.classhub.domain.aggregate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class StudentPayment {
    private UUID id;
    private UUID classRoomId;
    private UUID studentId;
    private BigDecimal amount;
    private boolean paid;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
