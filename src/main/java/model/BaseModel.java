package model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
public abstract class BaseModel {
    private UUID id;
}
