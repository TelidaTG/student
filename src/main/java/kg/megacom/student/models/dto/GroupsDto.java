package kg.megacom.student.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class GroupsDto {

    Long id;
    String name;
    Date startDate;
    Date endDate;
    CourseDto courses;
    TeacherDto teachers;

}

