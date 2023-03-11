package dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Builder
public class FoodResponseDto {
    UUID id;
    String name;
    String type;
    String time;
    double price;
}
