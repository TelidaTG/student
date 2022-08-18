package kg.megacom.student.mappers;

import kg.megacom.student.models.Groups;
import kg.megacom.student.models.dto.GroupsDto;

import java.util.List;

public interface GroupsMapper {
    Groups fromDto(GroupsDto groupsDto);
    GroupsDto toDto(Groups groups);
    List<Groups> fromDtos(List<GroupsDto> groupsDtos);
    List<GroupsDto> toDtos(List<Groups> groups);
}
