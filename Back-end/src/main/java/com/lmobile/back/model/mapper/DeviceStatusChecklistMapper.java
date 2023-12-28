package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.DeviceStatusChecklistDto;
import com.lmobile.back.model.entity.DeviceStatusChecklist;

public class DeviceStatusChecklistMapper {

  public static DeviceStatusChecklistDto toDto(DeviceStatusChecklist deviceStatusChecklist) {
    return DeviceStatusChecklistDto.builder()
      .build();
  }

  public static List<DeviceStatusChecklistDto> toDto(List<DeviceStatusChecklist> deviceStatusChecklistList) {
    return deviceStatusChecklistList.stream().map((DeviceStatusChecklist deviceStatusChecklist) -> toDto(deviceStatusChecklist)).collect(Collectors.toList());
  }

  public static DeviceStatusChecklist toEntity(DeviceStatusChecklistDto deviceStatusChecklistDto) {
    return DeviceStatusChecklist.builder()
      .build();
  }

  public static List<DeviceStatusChecklist> toEntity(List<DeviceStatusChecklistDto> deviceStatusChecklistDtoList) {
    return deviceStatusChecklistDtoList.stream().map((DeviceStatusChecklistDto deviceStatusChecklistDto) -> toEntity(deviceStatusChecklistDto)).collect(Collectors.toList());
  }
}
