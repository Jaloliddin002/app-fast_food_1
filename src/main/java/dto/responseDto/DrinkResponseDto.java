package dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
@Builder
public class DrinkResponseDto {
    UUID id;
    String name;
    double price;
    String drinkType;
}
