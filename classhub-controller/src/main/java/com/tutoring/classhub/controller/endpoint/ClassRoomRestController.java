package com.tutoring.classhub.controller.endpoint;

import com.tutoring.classhub.controller.request.CreateClassRoomRequest;
import com.tutoring.classhub.controller.request.EnrollClassRoomStudentRequest;
import com.tutoring.classhub.controller.response.ClassRoomDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/class-room")
public class ClassRoomRestController {

    @PostMapping("/")
    public ResponseEntity<ClassRoomDTO> create(@RequestBody CreateClassRoomRequest request) {
        return null;
    }

    @PatchMapping("/enroll-student")
    public ResponseEntity<ClassRoomDTO> update(@RequestBody EnrollClassRoomStudentRequest request) {
        return null;
    }
}
