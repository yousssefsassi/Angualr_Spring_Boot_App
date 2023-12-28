package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.RentedDeviceIdDto;
import com.lmobile.back.model.entity.RentedDeviceId;

public class RentedDeviceIdMapper {

  public static RentedDeviceIdDto toDto(RentedDeviceId rentedDeviceId) {
    return RentedDeviceIdDto.builder()
      .build();
  }

  public static List<RentedDeviceIdDto> toDto(List<RentedDeviceId> rentedDeviceIdList) {
    return rentedDeviceIdList.stream().map((RentedDeviceId rentedDeviceId) -> toDto(rentedDeviceId)).collect(Collectors.toList());
  }

  public static RentedDeviceId toEntity(RentedDeviceIdDto rentedDeviceIdDto) {
    return RentedDeviceId.builder()
      .build();
  }

  public static List<RentedDeviceId> toEntity(List<RentedDeviceIdDto> rentedDeviceIdDtoList) {
    return rentedDeviceIdDtoList.stream().map((RentedDeviceIdDto rentedDeviceIdDto) -> toEntity(rentedDeviceIdDto)).collect(Collectors.toList());
  }
}
