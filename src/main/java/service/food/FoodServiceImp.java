package service.food;

import dto.requestDto.FoodRequestDto;
import dto.responseDto.FoodResponseDto;
import model.food.FoodEntity;

import java.util.List;
import java.util.UUID;

public class FoodServiceImp implements FoodService{
    @Override
    public boolean create(FoodRequestDto foodRequestDto) {
        return false;
    }

    @Override
    public FoodResponseDto get(UUID id) {
        return null;
    }

    @Override
    public List<FoodResponseDto> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, FoodRequestDto foodRequestDto) {
        return false;
    }

    @Override
    public List<FoodEntity> getData() {
        return null;
    }

    @Override
    public boolean writeData(List<FoodEntity> data) {
        return false;
    }

    @Override
    public FoodEntity getEntity(UUID id) {
        return null;
    }
}
