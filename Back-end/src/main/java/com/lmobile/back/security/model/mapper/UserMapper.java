package com.lmobile.back.security.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.security.model.dto.UserDto;
import com.lmobile.back.security.model.entity.User;

public class UserMapper {

  public static UserDto toDto(User user) {
    return UserDto.builder()
      .build();
  }

  public static List<UserDto> toDto(List<User> userList) {
    return userList.stream().map((User user) -> toDto(user)).collect(Collectors.toList());
  }

  public static User toEntity(UserDto userDto) {
    return User.builder()
      .build();
  }

  public static List<User> toEntity(List<UserDto> userDtoList) {
    return userDtoList.stream().map((UserDto userDto) -> toEntity(userDto)).collect(Collectors.toList());
  }
}
