package service.combo;

import dto.requestDto.ComboRequestDto;
import dto.responseDto.ComboResponseDto;
import model.combo.ComboEntity;
import service.BaseService;

import java.util.UUID;

public interface ComboService
        extends BaseService<ComboRequestDto, UUID, ComboResponseDto, ComboEntity> {
}
