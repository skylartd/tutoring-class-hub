package com.tutoring.classhub.domain.command;

import java.math.BigDecimal;
import java.util.UUID;

public class CreateStudentPaymentCommand {
    private UUID classId;
    private UUID studentId;
    private BigDecimal amount;
}
