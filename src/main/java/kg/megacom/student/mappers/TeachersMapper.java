package kg.megacom.student.mappers;

import kg.megacom.student.models.Teachers;
import kg.megacom.student.models.dto.TeacherDto;

import java.util.List;

public interface TeachersMapper {
    Teachers fromDto(TeacherDto teacherDto);
    TeacherDto toDto(Teachers teachers);
    List<Teachers> fromDtos(List<TeacherDto> teacherDtos);
    List<TeacherDto> toDtos(List<Teachers> teachers);
}
