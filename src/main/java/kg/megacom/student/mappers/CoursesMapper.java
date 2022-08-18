package kg.megacom.student.mappers;

import kg.megacom.student.models.Courses;
import kg.megacom.student.models.dto.CourseDto;

import java.util.List;

public interface CoursesMapper {
    Courses fromDto(CourseDto courseDto);
    CourseDto toDto(Courses courses);
    List<Courses> fromDtos(List<CourseDto> courseDtos);
    List<CourseDto> toDtos(List<Courses> courses);
}
