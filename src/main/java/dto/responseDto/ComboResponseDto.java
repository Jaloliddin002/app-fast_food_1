package dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
@Setter
@Getter
@Builder
public class ComboResponseDto {
    UUID id;
    String name;
    double price;
    List<UUID> drinks;
    List<UUID> foods;
}
