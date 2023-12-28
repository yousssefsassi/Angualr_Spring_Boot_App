package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.DeviceTypeDto;
import com.lmobile.back.model.entity.DeviceType;

public class DeviceTypeMapper {

  public static DeviceTypeDto toDto(DeviceType deviceType) {
    return DeviceTypeDto.builder()
      .build();
  }

  public static List<DeviceTypeDto> toDto(List<DeviceType> deviceTypeList) {
    return deviceTypeList.stream().map((DeviceType deviceType) -> toDto(deviceType)).collect(Collectors.toList());
  }

  public static DeviceType toEntity(DeviceTypeDto deviceTypeDto) {
    return DeviceType.builder()
      .build();
  }

  public static List<DeviceType> toEntity(List<DeviceTypeDto> deviceTypeDtoList) {
    return deviceTypeDtoList.stream().map((DeviceTypeDto deviceTypeDto) -> toEntity(deviceTypeDto)).collect(Collectors.toList());
  }
}
