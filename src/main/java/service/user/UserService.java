package service.user;

import dto.requestDto.UserRequestDto;
import dto.responseDto.UserResponseDto;
import model.user.UserEntity;
import service.BaseService;

import java.util.UUID;

public interface UserService
        extends BaseService<UserRequestDto, UUID, UserResponseDto, UserEntity> {
}
