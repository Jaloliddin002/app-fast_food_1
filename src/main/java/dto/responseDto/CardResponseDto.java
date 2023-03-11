package dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
@Builder
public class CardResponseDto {
    UUID id;
    UUID owner;
    String password;
    String cardType;
    double balance;
}
