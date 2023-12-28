package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.RentalDeviceDto;
import com.lmobile.back.model.entity.RentalDevice;

public class RentalDeviceMapper {

  public static RentalDeviceDto toDto(RentalDevice rentalDevice) {
    return RentalDeviceDto.builder()
      .build();
  }

  public static List<RentalDeviceDto> toDto(List<RentalDevice> rentalDeviceList) {
    return rentalDeviceList.stream().map((RentalDevice rentalDevice) -> toDto(rentalDevice)).collect(Collectors.toList());
  }

  public static RentalDevice toEntity(RentalDeviceDto rentalDeviceDto) {
    return RentalDevice.builder()
      .build();
  }

  public static List<RentalDevice> toEntity(List<RentalDeviceDto> rentalDeviceDtoList) {
    return rentalDeviceDtoList.stream().map((RentalDeviceDto rentalDeviceDto) -> toEntity(rentalDeviceDto)).collect(Collectors.toList());
  }
}
