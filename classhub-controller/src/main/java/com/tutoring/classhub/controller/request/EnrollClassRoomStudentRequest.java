package com.tutoring.classhub.controller.request;

import java.util.List;
import java.util.UUID;

public record EnrollClassRoomStudentRequest(
    UUID classRoomId,
    List<UUID> studentIds
) {
}
