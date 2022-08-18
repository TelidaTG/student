package kg.megacom.student.mappers.impl;

import kg.megacom.student.mappers.StudentsMapper;
import kg.megacom.student.models.Students;
import kg.megacom.student.models.dto.StudentsDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentsMapperImpl implements StudentsMapper {
    @Override
    public Students fromDto(StudentsDto studentsDto) {
        Students students = new Students();
        students.setId(studentsDto.getId());
        students.setName(studentsDto.getName());
        students.setSurName(studentsDto.getSurName());
        students.setTitle(studentsDto.getTitle());
        return students;
    }

    @Override
    public StudentsDto toDto(Students students) {
        StudentsDto studentsDto = new StudentsDto();
        studentsDto.setId(students.getId());
        studentsDto.setName(students.getName());
        studentsDto.setSurName(students.getSurName());
        studentsDto.setTitle(students.getTitle());
        return studentsDto;
    }

    @Override
    public List<Students> fromDtos(List<StudentsDto> studentsDtos) {
        return studentsDtos.stream().map(this::fromDto).collect(Collectors.toList());
    }

    @Override
    public List<StudentsDto> toDtos(List<Students> students) {
        return students.stream().map(this::toDto).collect(Collectors.toList());
    }
}
