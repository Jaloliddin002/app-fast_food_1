package service.drink;

import dto.requestDto.DrinkRequestDto;
import dto.responseDto.DrinkResponseDto;
import model.drink.DrinkEntity;

import java.util.List;
import java.util.UUID;

public class DrinkServiceImp implements DrinkService{
    @Override
    public boolean create(DrinkRequestDto drinkRequestDto) {
        return false;
    }

    @Override
    public DrinkResponseDto get(UUID id) {
        return null;
    }

    @Override
    public List<DrinkResponseDto> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, DrinkRequestDto drinkRequestDto) {
        return false;
    }

    @Override
    public List<DrinkEntity> getData() {
        return null;
    }

    @Override
    public boolean writeData(List<DrinkEntity> data) {
        return false;
    }

    @Override
    public DrinkEntity getEntity(UUID id) {
        return null;
    }
}
