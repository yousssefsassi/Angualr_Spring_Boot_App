package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.RentedDeviceDto;
import com.lmobile.back.model.entity.RentedDevice;

public class RentedDeviceMapper {

  public static RentedDeviceDto toDto(RentedDevice rentedDevice) {
    return RentedDeviceDto.builder()
      .build();
  }

  public static List<RentedDeviceDto> toDto(List<RentedDevice> rentedDeviceList) {
    return rentedDeviceList.stream().map((RentedDevice rentedDevice) -> toDto(rentedDevice)).collect(Collectors.toList());
  }

  public static RentedDevice toEntity(RentedDeviceDto rentedDeviceDto) {
    return RentedDevice.builder()
      .build();
  }

  public static List<RentedDevice> toEntity(List<RentedDeviceDto> rentedDeviceDtoList) {
    return rentedDeviceDtoList.stream().map((RentedDeviceDto rentedDeviceDto) -> toEntity(rentedDeviceDto)).collect(Collectors.toList());
  }
}
