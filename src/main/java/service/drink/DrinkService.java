package service.drink;

import dto.requestDto.DrinkRequestDto;
import dto.responseDto.DrinkResponseDto;
import model.drink.DrinkEntity;
import service.BaseService;

import java.util.UUID;

public interface DrinkService
        extends BaseService<DrinkRequestDto, UUID, DrinkResponseDto, DrinkEntity> {
}
