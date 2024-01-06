package com.tutoring.classhub.domain.aggregate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class ClassRoom {
    private UUID id;
    private String title;
    private BigDecimal pricePerStudent;
    private boolean active;
    private List<UUID> studentIds;
    private List<UUID> studentPaymentIds;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
