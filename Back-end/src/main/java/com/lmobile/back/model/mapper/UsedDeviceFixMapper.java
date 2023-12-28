package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.UsedDeviceFixDto;
import com.lmobile.back.model.entity.UsedDeviceFix;

public class UsedDeviceFixMapper {

  public static UsedDeviceFixDto toDto(UsedDeviceFix usedDeviceFix) {
    return UsedDeviceFixDto.builder()
      .build();
  }

  public static List<UsedDeviceFixDto> toDto(List<UsedDeviceFix> usedDeviceFixList) {
    return usedDeviceFixList.stream().map((UsedDeviceFix usedDeviceFix) -> toDto(usedDeviceFix)).collect(Collectors.toList());
  }

  public static UsedDeviceFix toEntity(UsedDeviceFixDto usedDeviceFixDto) {
    return UsedDeviceFix.builder()
      .build();
  }

  public static List<UsedDeviceFix> toEntity(List<UsedDeviceFixDto> usedDeviceFixDtoList) {
    return usedDeviceFixDtoList.stream().map((UsedDeviceFixDto usedDeviceFixDto) -> toEntity(usedDeviceFixDto)).collect(Collectors.toList());
  }
}
