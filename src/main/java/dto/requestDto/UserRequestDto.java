package dto.requestDto;

import enums.role.eRole;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import model.card.CardEntity;

import java.util.UUID;

@Setter
@Getter
@Builder
public class UserRequestDto {
    String name;
    String password;
    String phoneNumber;
    String role;
    UUID card;
    double balance;
}
