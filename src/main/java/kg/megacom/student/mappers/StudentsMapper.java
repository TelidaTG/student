package kg.megacom.student.mappers;

import kg.megacom.student.models.Students;
import kg.megacom.student.models.dto.StudentsDto;

import java.util.List;

public interface StudentsMapper {
    Students fromDto(StudentsDto studentsDto);
    StudentsDto toDto(Students students);
    List<Students> fromDtos(List<StudentsDto> studentsDtos);
    List<StudentsDto> toDtos(List<Students> students);
}
