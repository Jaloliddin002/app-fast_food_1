package service.food;

import dto.requestDto.FoodRequestDto;
import dto.responseDto.FoodResponseDto;
import model.food.FoodEntity;
import service.BaseService;

import java.util.UUID;

public interface FoodService
        extends BaseService<FoodRequestDto, UUID, FoodResponseDto, FoodEntity>{
}
