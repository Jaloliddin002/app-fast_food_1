package service.payment;

import dto.requestDto.PaymentRequestDto;
import dto.responseDto.PaymentResponseDto;
import model.payment.PaymentEntity;

import java.util.List;
import java.util.UUID;

public class PaymentServiceImp implements PaymentService{
    @Override
    public boolean create(PaymentRequestDto paymentRequestDto) {
        return false;
    }

    @Override
    public PaymentResponseDto get(UUID id) {
        return null;
    }

    @Override
    public List<PaymentResponseDto> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, PaymentRequestDto paymentRequestDto) {
        return false;
    }

    @Override
    public List<PaymentEntity> getData() {
        return null;
    }

    @Override
    public boolean writeData(List<PaymentEntity> data) {
        return false;
    }

    @Override
    public PaymentEntity getEntity(UUID id) {
        return null;
    }
}
