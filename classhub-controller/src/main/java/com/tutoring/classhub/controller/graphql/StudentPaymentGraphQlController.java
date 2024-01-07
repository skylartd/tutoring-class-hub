package com.tutoring.classhub.controller.graphql;

import com.tutoring.classhub.controller.response.StudentPaymentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class StudentPaymentGraphQlController {

    @QueryMapping
    public List<StudentPaymentDTO> studentPayments() {
        return List.of();
    }

    @QueryMapping
    public StudentPaymentDTO studentPaymentById(UUID id) {
        return null;
    }
}
