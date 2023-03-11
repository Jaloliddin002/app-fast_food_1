package model.combo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import model.BaseModel;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Builder
public class ComboEntity extends BaseModel {
    private String name;
    private double price;
    private List<UUID> drinks;
    private List<UUID> foods;
}
