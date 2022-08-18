package kg.megacom.student.mappers.impl;

import kg.megacom.student.mappers.GroupsMapper;
import kg.megacom.student.mappers.LessonsMapper;
import kg.megacom.student.models.Lessons;
import kg.megacom.student.models.dto.LessonsDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LessonsMapperImpl implements LessonsMapper {

    GroupsMapper groupsMapper;

    @Override
    public Lessons fromDto(LessonsDto lessonsDto) {
        Lessons lessons = new Lessons();
        lessons.setId(lessonsDto.getId());
        lessons.setGroups(groupsMapper.fromDto(lessonsDto.getGroups()));
        return lessons;
    }

    @Override
    public LessonsDto toDto(Lessons lessons) {
        LessonsDto lessonsDto = new LessonsDto();
        lessonsDto.setId(lessonsDto.getId());
        lessonsDto.setGroups(groupsMapper.toDto(lessons.getGroups()));
        return lessonsDto;
    }

    @Override
    public List<Lessons> fromDtos(List<LessonsDto> lessonsDtos) {
        return lessonsDtos.stream().map(this::fromDto).collect(Collectors.toList());
    }

    @Override
    public List<LessonsDto> toDtos(List<Lessons> lessons) {
        return lessons.stream().map(this::toDto).collect(Collectors.toList());
    }
}
