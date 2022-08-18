package kg.megacom.student.mappers.impl;

import kg.megacom.student.mappers.GroupsMapper;
import kg.megacom.student.mappers.StudentGroupsMapper;
import kg.megacom.student.mappers.StudentsMapper;
import kg.megacom.student.models.StudentGroups;
import kg.megacom.student.models.dto.StudentGroupDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentGroupsMapperImpl implements StudentGroupsMapper {
    GroupsMapper groupsMapper;
    StudentsMapper studentsMapper;
    @Override
    public StudentGroups fromDto(StudentGroupDto studentGroupDto) {
        StudentGroups studentGroups = new StudentGroups();
        studentGroups.setId(studentGroupDto.getId());
        studentGroups.setStudents(studentsMapper.fromDto(studentGroupDto.getStudents()));
        studentGroups.setGroups(groupsMapper.fromDto(studentGroupDto.getGroups()));
        studentGroups.setStartDate(studentGroupDto.getStartDate());
        studentGroups.setEndDate(studentGroupDto.getEndDate());
        studentGroups.setStudentStatus(studentGroupDto.getStudentStatus());
        return studentGroups;
    }

    @Override
    public StudentGroupDto toDto(StudentGroups studentGroups) {
        StudentGroupDto studentGroupDto = new StudentGroupDto();
        studentGroupDto.setId(studentGroups.getId());
        studentGroupDto.setStudents(studentsMapper.toDto(studentGroups.getStudents()));
        studentGroupDto.setGroups(groupsMapper.toDto(studentGroups.getGroups()));
        studentGroupDto.setStartDate(studentGroups.getStartDate());
        studentGroupDto.setEndDate(studentGroups.getEndDate());
        studentGroupDto.setStudentStatus(studentGroups.getStudentStatus());
        return studentGroupDto;
    }

    @Override
    public List<StudentGroups> fromDtos(List<StudentGroupDto> studentGroupDtos) {
        return studentGroupDtos.stream().map(this::fromDto).collect(Collectors.toList());
    }

    @Override
    public List<StudentGroupDto> toDtos(List<StudentGroups> studentGroups) {
        return studentGroups.stream().map(this::toDto).collect(Collectors.toList());
    }
}
