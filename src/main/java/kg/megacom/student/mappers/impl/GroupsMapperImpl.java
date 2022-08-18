package kg.megacom.student.mappers.impl;

import kg.megacom.student.mappers.CoursesMapper;
import kg.megacom.student.mappers.GroupsMapper;
import kg.megacom.student.mappers.TeachersMapper;
import kg.megacom.student.models.Groups;
import kg.megacom.student.models.dto.GroupsDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupsMapperImpl implements GroupsMapper {
    CoursesMapper coursesMapper;
    TeachersMapper teachersMapper;
    @Override
    public Groups fromDto(GroupsDto groupsDto) {
        Groups groups = new Groups();
        groups.setId(groupsDto.getId());
        groups.setName(groupsDto.getName());
        groups.setCourses(coursesMapper.fromDto(groupsDto.getCourses()));
        groups.setTeachers(teachersMapper.fromDto(groupsDto.getTeachers()));
        groups.setStartDate(groupsDto.getStartDate());
        groups.setEndDate(groupsDto.getEndDate());
        return groups;
    }

    @Override
    public GroupsDto toDto(Groups groups) {
        GroupsDto groupsDto = new GroupsDto();
        groupsDto.setId(groups.getId());
        groupsDto.setName(groups.getName());
        groupsDto.setCourses(coursesMapper.toDto(groups.getCourses()));
        groupsDto.setTeachers(teachersMapper.toDto(groups.getTeachers()));
        groupsDto.setStartDate(groups.getStartDate());
        groupsDto.setEndDate(groups.getEndDate());
        return groupsDto;

    }

    @Override
    public List<Groups> fromDtos(List<GroupsDto> groupsDtos) {
        return groupsDtos.stream().map(this::fromDto).collect(Collectors.toList());
    }

    @Override
    public List<GroupsDto> toDtos(List<Groups> groups) {
        return groups.stream().map(this::toDto).collect(Collectors.toList());
    }
}
