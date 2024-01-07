package com.tutoring.classhub.controller.graphql;

import com.tutoring.classhub.controller.response.ClassRoomDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class ClassRoomGraphQlController {

    @QueryMapping
    public List<ClassRoomDTO> classRooms() {
        return List.of();
    }

    @QueryMapping
    public ClassRoomDTO classRoomById(UUID id) {
        return null;
    }
}
