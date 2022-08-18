package kg.megacom.student.mappers.impl;

import kg.megacom.student.mappers.GroupsMapper;
import kg.megacom.student.mappers.PaymentMapper;
import kg.megacom.student.mappers.StudentsMapper;
import kg.megacom.student.models.Payments;
import kg.megacom.student.models.dto.PaymentsDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentMapperImpl implements PaymentMapper {
    GroupsMapper groupsMapper;
    StudentsMapper studentsMapper;

    @Override
    public Payments fromDto(PaymentsDto paymentsDto) {
        Payments payments = new Payments();
        payments.setId(paymentsDto.getId());
        payments.setPaymentDate(paymentsDto.getPaymentDate());
        payments.setPaymentStatus(paymentsDto.getPaymentStatus());
        payments.setGroups(groupsMapper.fromDto(paymentsDto.getGroups()));
        payments.setStudents(studentsMapper.fromDto(paymentsDto.getStudents()));
        return payments;
    }

    @Override
    public PaymentsDto toDto(Payments payments) {
        PaymentsDto paymentsDto = new PaymentsDto();
        paymentsDto.setId(payments.getId());
        paymentsDto.setPaymentDate(payments.getPaymentDate());
        paymentsDto.setPaymentStatus(payments.getPaymentStatus());
        paymentsDto.setGroups(groupsMapper.toDto(payments.getGroups()));
        paymentsDto.setStudents(studentsMapper.toDto(payments.getStudents()));
        return paymentsDto;
    }

    @Override
    public List<Payments> fromDtos(List<PaymentsDto> paymentsDtos) {
        return paymentsDtos.stream().map(this::fromDto).collect(Collectors.toList());
    }

    @Override
    public List<PaymentsDto> toDtos(List<Payments> payments) {
        return payments.stream().map(this::toDto).collect(Collectors.toList());
    }
}
