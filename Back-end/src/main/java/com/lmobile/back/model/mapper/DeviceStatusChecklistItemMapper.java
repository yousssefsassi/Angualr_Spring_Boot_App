package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.DeviceStatusChecklistItemDto;
import com.lmobile.back.model.entity.DeviceStatusChecklistItem;

public class DeviceStatusChecklistItemMapper {

  public static DeviceStatusChecklistItemDto toDto(DeviceStatusChecklistItem deviceStatusChecklistItem) {
    return DeviceStatusChecklistItemDto.builder()
      .id(deviceStatusChecklistItem.getId())
      .name(deviceStatusChecklistItem.getName())
      .descriptionBeforeRent(deviceStatusChecklistItem.getDescriptionBeforeRent())
      .descriptionAfterRent(deviceStatusChecklistItem.getDescriptionAfterRent())
      .pictureBeforeRent(deviceStatusChecklistItem.getPictureBeforeRent())
      .pictureAfterRent(deviceStatusChecklistItem.getPictureAfterRent())
      .hasChanged(deviceStatusChecklistItem.getHasChanged())
      .changeDescription(deviceStatusChecklistItem.getChangeDescription())
      .deviceStatusChecklist(DeviceStatusChecklistMapper.toDto(deviceStatusChecklistItem.getDeviceStatusChecklist()))
      .createdAt(deviceStatusChecklistItem.getCreatedAt())
      .build();
  }

  public static List<DeviceStatusChecklistItemDto> toDto(List<DeviceStatusChecklistItem> deviceStatusChecklistItemList) {
    return deviceStatusChecklistItemList.stream().map((DeviceStatusChecklistItem deviceStatusChecklistItem) -> toDto(deviceStatusChecklistItem)).collect(Collectors.toList());
  }

  public static DeviceStatusChecklistItem toEntity(DeviceStatusChecklistItemDto deviceStatusChecklistItemDto) {
    return DeviceStatusChecklistItem.builder()
      .id(deviceStatusChecklistItemDto.getId())
      .name(deviceStatusChecklistItemDto.getName())
      .descriptionBeforeRent(deviceStatusChecklistItemDto.getDescriptionBeforeRent())
      .descriptionAfterRent(deviceStatusChecklistItemDto.getDescriptionAfterRent())
      .pictureBeforeRent(deviceStatusChecklistItemDto.getPictureBeforeRent())
      .pictureAfterRent(deviceStatusChecklistItemDto.getPictureAfterRent())
      .hasChanged(deviceStatusChecklistItemDto.getHasChanged())
      .changeDescription(deviceStatusChecklistItemDto.getChangeDescription())
      .deviceStatusChecklist(DeviceStatusChecklistMapper.toEntity(deviceStatusChecklistItemDto.getDeviceStatusChecklist()))
      .createdAt(deviceStatusChecklistItemDto.getCreatedAt())
      .build();
  }

  public static List<DeviceStatusChecklistItem> toEntity(List<DeviceStatusChecklistItemDto> deviceStatusChecklistItemDtoList) {
    return deviceStatusChecklistItemDtoList.stream().map((DeviceStatusChecklistItemDto deviceStatusChecklistItemDto) -> toEntity(deviceStatusChecklistItemDto)).collect(Collectors.toList());
  }
}
