package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.DeviceDto;
import com.lmobile.back.model.entity.Device;

public class DeviceMapper {

  public static DeviceDto toDto(Device device) {
    return DeviceDto.builder()
      .id(device.getId())
      .description(device.getDescription())
      .brand(device.getBrand())
      .serialNumber(device.getSerialNumber())
      .pictureFilePath(device.getPictureFilePath())
      .purchasePrice(device.getPurchasePrice())
      .yearOfManufacture(device.getYearOfManufacture())
      .salesman(SalesmanMapper.toDto(device.getSalesman()))
      .deviceType(DeviceTypeMapper.toDto(device.getDeviceType()))
      .createdAt(device.getCreatedAt())
      .build();
  }

  public static List<DeviceDto> toDto(List<Device> deviceList) {
    return deviceList.stream().map((Device device) -> toDto(device)).collect(Collectors.toList());
  }

  public static Device toEntity(DeviceDto deviceDto) {
    return Device.builder()
      .id(deviceDto.getId())
      .description(deviceDto.getDescription())
      .brand(deviceDto.getBrand())
      .serialNumber(deviceDto.getSerialNumber())
      .pictureFilePath(deviceDto.getPictureFilePath())
      .purchasePrice(deviceDto.getPurchasePrice())
      .yearOfManufacture(deviceDto.getYearOfManufacture())
      .salesman(SalesmanMapper.toEntity(deviceDto.getSalesman()))
      .deviceType(DeviceTypeMapper.toEntity(deviceDto.getDeviceType()))
      .createdAt(deviceDto.getCreatedAt())
      .build();
  }

  public static List<Device> toEntity(List<DeviceDto> deviceDtoList) {
    return deviceDtoList.stream().map((DeviceDto deviceDto) -> toEntity(deviceDto)).collect(Collectors.toList());
  }
}
