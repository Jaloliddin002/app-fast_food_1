package dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
@Builder
public class UserResponseDto {
    UUID id;
    String name;
    String password;
    String phoneNumber;
    String role;
    UUID card;
    double balance;
}
