package dto.requestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class FoodRequestDto {
    String name;
    String type;
    String time;
    double price;
}
