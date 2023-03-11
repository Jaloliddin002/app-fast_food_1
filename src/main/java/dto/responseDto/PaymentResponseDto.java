package dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
@Setter
@Getter
@Builder
public class PaymentResponseDto {
    UUID id;
    double balance;
    double cashBack;
    UUID cardId;
    List<UUID> foods;
    String date;
}
