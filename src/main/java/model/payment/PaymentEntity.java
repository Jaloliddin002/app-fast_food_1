package model.payment;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import model.BaseModel;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@Setter
@Getter
@Builder
public class PaymentEntity extends BaseModel {
    private double balance;
    private double cashBack;
    private UUID cardId;
    private List<UUID> foods;
    private Date date = new Date();
}
