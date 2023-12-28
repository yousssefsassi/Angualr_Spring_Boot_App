package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.TradedDeviceIdDto;
import com.lmobile.back.model.entity.TradedDeviceId;

public class TradedDeviceIdMapper {

  public static TradedDeviceIdDto toDto(TradedDeviceId tradedDeviceId) {
    return TradedDeviceIdDto.builder()
      .build();
  }

  public static List<TradedDeviceIdDto> toDto(List<TradedDeviceId> tradedDeviceIdList) {
    return tradedDeviceIdList.stream().map((TradedDeviceId tradedDeviceId) -> toDto(tradedDeviceId)).collect(Collectors.toList());
  }

  public static TradedDeviceId toEntity(TradedDeviceIdDto tradedDeviceIdDto) {
    return TradedDeviceId.builder()
      .build();
  }

  public static List<TradedDeviceId> toEntity(List<TradedDeviceIdDto> tradedDeviceIdDtoList) {
    return tradedDeviceIdDtoList.stream().map((TradedDeviceIdDto tradedDeviceIdDto) -> toEntity(tradedDeviceIdDto)).collect(Collectors.toList());
  }
}
