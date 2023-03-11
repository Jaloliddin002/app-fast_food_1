package service.combo;

import dto.requestDto.ComboRequestDto;
import dto.responseDto.ComboResponseDto;
import model.combo.ComboEntity;

import java.util.List;
import java.util.UUID;

public class ComboServiceImp implements ComboService{
    @Override
    public boolean create(ComboRequestDto comboRequestDto) {
        return false;
    }

    @Override
    public ComboResponseDto get(UUID id) {
        return null;
    }

    @Override
    public List<ComboResponseDto> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, ComboRequestDto comboRequestDto) {
        return false;
    }

    @Override
    public List<ComboEntity> getData() {
        return null;
    }

    @Override
    public boolean writeData(List<ComboEntity> data) {
        return false;
    }

    @Override
    public ComboEntity getEntity(UUID id) {
        return null;
    }
}
