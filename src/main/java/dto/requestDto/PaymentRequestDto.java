package dto.requestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Builder
public class PaymentRequestDto {
    double balance;
    double cashBack;
    UUID cardId;
    List<UUID> foods;
}
