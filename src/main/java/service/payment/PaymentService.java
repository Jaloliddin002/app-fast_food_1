package service.payment;

import dto.requestDto.PaymentRequestDto;
import dto.responseDto.PaymentResponseDto;
import model.payment.PaymentEntity;
import service.BaseService;

import java.util.UUID;

public interface PaymentService
        extends BaseService<PaymentRequestDto, UUID, PaymentResponseDto, PaymentEntity> {
}
