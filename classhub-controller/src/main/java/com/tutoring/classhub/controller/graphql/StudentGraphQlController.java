package com.tutoring.classhub.controller.graphql;

import com.tutoring.classhub.controller.response.StudentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class StudentGraphQlController {

    @QueryMapping
    public List<StudentDTO> students() {
        return List.of();
    }

    @QueryMapping
    public StudentDTO studentById(UUID id) {
        return null;
    }
}
