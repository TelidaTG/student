package kg.megacom.student.models;

import kg.megacom.student.models.enums.StudentStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "student_groups")
public class StudentGroups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "id_students")
    Students students;
    @ManyToOne
    @JoinColumn(name = "id_groups")
    Groups groups;
    Date startDate;
    Date endDate;
    @Enumerated(value = EnumType.STRING)
    StudentStatus studentStatus;
}
