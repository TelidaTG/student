package kg.megacom.student.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class LessonsDto {

    Long id;
    GroupsDto groups;

}
