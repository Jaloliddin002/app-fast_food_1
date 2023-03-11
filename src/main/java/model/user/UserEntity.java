package model.user;

import enums.role.eRole;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import model.BaseModel;
import model.card.CardEntity;

@Setter
@Getter
@Builder
public class UserEntity extends BaseModel {
    private String name;
    private String password;
    private String phoneNumber;
    private eRole role;
    private CardEntity card;
    private double balance;
}
