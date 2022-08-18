package kg.megacom.student.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class CourseDto {
    Long id;
    String title;
    double price;
    Integer duration;
}
