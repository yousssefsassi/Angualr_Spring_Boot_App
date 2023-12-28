package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.TradedDeviceDto;
import com.lmobile.back.model.entity.TradedDevice;

public class TradedDeviceMapper {

  public static TradedDeviceDto toDto(TradedDevice tradedDevice) {
    return TradedDeviceDto.builder()
      .build();
  }

  public static List<TradedDeviceDto> toDto(List<TradedDevice> tradedDeviceList) {
    return tradedDeviceList.stream().map((TradedDevice tradedDevice) -> toDto(tradedDevice)).collect(Collectors.toList());
  }

  public static TradedDevice toEntity(TradedDeviceDto tradedDeviceDto) {
    return TradedDevice.builder()
      .build();
  }

  public static List<TradedDevice> toEntity(List<TradedDeviceDto> tradedDeviceDtoList) {
    return tradedDeviceDtoList.stream().map((TradedDeviceDto tradedDeviceDto) -> toEntity(tradedDeviceDto)).collect(Collectors.toList());
  }
}
