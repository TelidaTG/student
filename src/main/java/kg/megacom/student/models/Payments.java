package kg.megacom.student.models;

import kg.megacom.student.models.enums.PaymentStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "payments")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "id_groups")
    Groups groups;
    @ManyToOne
    @JoinColumn(name = "id_students")
    Students students;
    Date paymentDate;
    @Enumerated(value = EnumType.STRING)
    PaymentStatus paymentStatus;
}
