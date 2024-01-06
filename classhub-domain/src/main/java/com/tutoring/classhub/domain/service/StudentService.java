package com.tutoring.classhub.domain.service;

import com.tutoring.classhub.domain.aggregate.Student;

import java.util.UUID;

public interface StudentService {
    Student create(Student student);
    Student get(UUID id);
    Student update(Student student);
}
