package dto.requestDto;

import enums.drinkType.eDrinkType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class DrinkRequestDto {
    String name;
    double price;
    String drinkType;
}
