package dto.requestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Builder
public class CardRequestDto {
    String password;
    String cardType;
    double balance;
    UUID owner;
}
