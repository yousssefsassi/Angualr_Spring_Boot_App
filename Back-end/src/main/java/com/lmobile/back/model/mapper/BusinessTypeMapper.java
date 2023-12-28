package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.BusinessTypeDto;
import com.lmobile.back.model.entity.BusinessType;

public class BusinessTypeMapper {

  public static BusinessTypeDto toDto(BusinessType businessType) {
    return BusinessTypeDto.builder()
      .id(businessType.getId())
      .name(businessType.getName())
      .build();
  }

  public static List<BusinessTypeDto> toDto(List<BusinessType> businessTypeList) {
    return businessTypeList.stream().map((BusinessType businessType) -> toDto(businessType)).collect(Collectors.toList());
  }

  public static BusinessType toEntity(BusinessTypeDto businessTypeDto) {
    return BusinessType.builder()
      .id(businessTypeDto.getId())
      .name(businessTypeDto.getName())
      .build();
  }

  public static List<BusinessType> toEntity(List<BusinessTypeDto> businessTypeDtoList) {
    return businessTypeDtoList.stream().map((BusinessTypeDto businessTypeDto) -> toEntity(businessTypeDto)).collect(Collectors.toList());
  }
}
