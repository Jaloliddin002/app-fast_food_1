package service.card;

import dto.requestDto.CardRequestDto;
import dto.responseDto.CardResponseDto;
import model.card.CardEntity;
import service.combo.ComboService;

import java.util.List;
import java.util.UUID;

public class CardServiceImp implements CardService {
    @Override
    public boolean create(CardRequestDto cardRequestDto) {
        return false;
    }

    @Override
    public CardResponseDto get(UUID id) {
        return null;
    }

    @Override
    public List<CardResponseDto> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, CardRequestDto cardRequestDto) {
        return false;
    }

    @Override
    public List<CardEntity> getData() {
        return null;
    }

    @Override
    public boolean writeData(List<CardEntity> data) {
        return false;
    }

    @Override
    public CardEntity getEntity(UUID id) {
        return null;
    }
}
