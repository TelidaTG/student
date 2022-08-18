package kg.megacom.student.mappers.impl;

import kg.megacom.student.mappers.CoursesMapper;
import kg.megacom.student.models.Courses;
import kg.megacom.student.models.dto.CourseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CoursesMapperImpl implements CoursesMapper {
    @Override
    public Courses fromDto(CourseDto courseDto) {
        Courses courses = new Courses();
        courses.setId(courseDto.getId());
        courses.setPrice(courseDto.getPrice());
        courses.setTitle(courseDto.getTitle());
        courses.setDuration(courseDto.getDuration());
        return courses;
    }

    @Override
    public CourseDto toDto(Courses courses) {
        CourseDto courseDto = new CourseDto();
        courseDto.setId(courses.getId());
        courseDto.setPrice(courses.getPrice());
        courseDto.setTitle(courses.getTitle());
        courseDto.setDuration(courses.getDuration());
        return courseDto;
    }

    @Override
    public List<Courses> fromDtos(List<CourseDto> courseDtos) {
        return courseDtos.stream().map(this::fromDto).collect(Collectors.toList());
    }

    @Override
    public List<CourseDto> toDtos(List<Courses> courses) {
        return courses.stream().map(this::toDto).collect(Collectors.toList());
    }
}
