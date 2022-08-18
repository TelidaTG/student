package kg.megacom.student.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class TeacherDto {

    Long id;
    String name;
    String surName;
    String title;

}
