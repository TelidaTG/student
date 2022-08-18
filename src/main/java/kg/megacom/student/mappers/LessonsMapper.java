package kg.megacom.student.mappers;

import kg.megacom.student.models.Lessons;
import kg.megacom.student.models.dto.LessonsDto;

import java.util.List;

public interface LessonsMapper {
    Lessons fromDto(LessonsDto lessonsDto);
    LessonsDto toDto(Lessons lessons);
    List<Lessons> fromDtos(List<LessonsDto> lessonsDtos);
    List<LessonsDto> toDtos(List<Lessons> lessons);
}
