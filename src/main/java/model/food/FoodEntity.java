package model.food;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class FoodEntity {
    private String name;
    private String type;
    private String time;
    private double price;
}
