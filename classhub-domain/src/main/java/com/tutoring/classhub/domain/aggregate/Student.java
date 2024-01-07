package com.tutoring.classhub.domain.aggregate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Student {
    private UUID id;
    private String fullName;
    private String email;
    private boolean enrolled;
    private List<UUID> enrolledClassIds;
    private List<UUID> studentPaymentIds;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
