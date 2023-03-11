package model.card;

import enums.cardType.eCardType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import model.BaseModel;
import model.user.UserEntity;

@Setter
@Getter
@Builder
public class CardEntity extends BaseModel {
    private String password;
    private double balance;
    private UserEntity owner;
    private eCardType cardType;
}
