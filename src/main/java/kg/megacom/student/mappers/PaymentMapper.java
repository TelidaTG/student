package kg.megacom.student.mappers;

import kg.megacom.student.models.Payments;
import kg.megacom.student.models.dto.PaymentsDto;

import java.util.List;

public interface PaymentMapper {
    Payments fromDto(PaymentsDto paymentsDto);
    PaymentsDto toDto(Payments payments);
    List<Payments> fromDtos(List<PaymentsDto> paymentsDtos);
    List<PaymentsDto> toDtos(List<Payments> payments);
}
