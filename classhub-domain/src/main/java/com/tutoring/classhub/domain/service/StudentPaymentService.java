package com.tutoring.classhub.domain.service;

import com.tutoring.classhub.domain.aggregate.StudentPayment;

import java.util.UUID;

public interface StudentPaymentService {
    StudentPayment create(StudentPayment studentPayment);
    StudentPayment get(UUID id);
    StudentPayment update(StudentPayment studentPayment);
}
