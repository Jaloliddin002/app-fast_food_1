package model.drink;
import enums.drinkType.eDrinkType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import model.BaseModel;

@Setter
@Getter
@Builder
public class DrinkEntity extends BaseModel {
    private String name;
    private double price;
    private eDrinkType drinkType;
}
