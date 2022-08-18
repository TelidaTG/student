package kg.megacom.student.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "groups")
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToOne
    @JoinColumn(name = "course_id")
    Courses courses;
    Date startDate;
    Date endDate;
    @ManyToOne
    @JoinColumn(name = "id_teachers")
    Teachers teachers;

}
