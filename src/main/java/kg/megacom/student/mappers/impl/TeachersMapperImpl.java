package kg.megacom.student.mappers.impl;

import kg.megacom.student.mappers.TeachersMapper;
import kg.megacom.student.models.Teachers;
import kg.megacom.student.models.dto.TeacherDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeachersMapperImpl implements TeachersMapper {
    @Override
    public Teachers fromDto(TeacherDto teacherDto) {
        Teachers teachers = new Teachers();
        teachers.setId(teacherDto.getId());
        teachers.setName(teacherDto.getName());
        teachers.setSurName(teacherDto.getSurName());
        teachers.setTitle(teacherDto.getTitle());
        return teachers;
    }

    @Override
    public TeacherDto toDto(Teachers teachers) {
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setId(teachers.getId());
        teacherDto.setName(teachers.getName());
        teacherDto.setSurName(teachers.getSurName());
        teacherDto.setTitle(teachers.getTitle());
        return teacherDto;
    }

    @Override
    public List<Teachers> fromDtos(List<TeacherDto> teacherDtos) {
        return teacherDtos.stream().map(this::fromDto).collect(Collectors.toList());
    }

    @Override
    public List<TeacherDto> toDtos(List<Teachers> teachers) {
        return teachers.stream().map(this::toDto).collect(Collectors.toList());
    }
}
