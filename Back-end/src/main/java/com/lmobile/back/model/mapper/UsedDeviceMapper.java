package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.UsedDeviceDto;
import com.lmobile.back.model.entity.UsedDevice;

public class UsedDeviceMapper {

  public static UsedDeviceDto toDto(UsedDevice usedDevice) {
    return UsedDeviceDto.builder()
      .build();
  }

  public static List<UsedDeviceDto> toDto(List<UsedDevice> usedDeviceList) {
    return usedDeviceList.stream().map((UsedDevice usedDevice) -> toDto(usedDevice)).collect(Collectors.toList());
  }

  public static UsedDevice toEntity(UsedDeviceDto usedDeviceDto) {
    return UsedDevice.builder()
      .build();
  }

  public static List<UsedDevice> toEntity(List<UsedDeviceDto> usedDeviceDtoList) {
    return usedDeviceDtoList.stream().map((UsedDeviceDto usedDeviceDto) -> toEntity(usedDeviceDto)).collect(Collectors.toList());
  }
}
