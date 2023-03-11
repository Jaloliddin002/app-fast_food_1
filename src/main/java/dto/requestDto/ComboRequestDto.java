package dto.requestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
@Setter
@Getter
@Builder
public class ComboRequestDto {
    String name;
    double price;
    List<UUID> drinks;
    List<UUID> foods;
}
