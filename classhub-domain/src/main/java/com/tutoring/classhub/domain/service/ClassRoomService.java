package com.tutoring.classhub.domain.service;

import com.tutoring.classhub.domain.aggregate.ClassRoom;

import java.util.UUID;

public interface ClassRoomService {
    ClassRoom create(ClassRoom classRoom);
    ClassRoom get(UUID id);
    ClassRoom update(ClassRoom classRoom);

}
