package kg.megacom.student.mappers;

import kg.megacom.student.models.StudentGroups;
import kg.megacom.student.models.dto.StudentGroupDto;

import java.util.List;

public interface StudentGroupsMapper {

    StudentGroups fromDto(StudentGroupDto studentGroupDto);
    StudentGroupDto toDto(StudentGroups studentGroups);
    List<StudentGroups> fromDtos(List<StudentGroupDto> studentGroupDtos);
    List<StudentGroupDto> toDtos(List<StudentGroups> studentGroups);
}
