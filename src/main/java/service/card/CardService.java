package service.card;

import dto.requestDto.CardRequestDto;
import dto.responseDto.CardResponseDto;
import dto.responseDto.ComboResponseDto;
import model.card.CardEntity;
import service.BaseService;

import java.util.UUID;

public interface CardService
        extends BaseService<CardRequestDto, UUID, CardResponseDto, CardEntity> {
}
