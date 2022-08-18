package kg.megacom.student.models.dto;

import kg.megacom.student.models.enums.PaymentStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class PaymentsDto {
    Long id;
    GroupsDto groups;
    StudentsDto students;
    Date paymentDate;
    PaymentStatus paymentStatus;
}
