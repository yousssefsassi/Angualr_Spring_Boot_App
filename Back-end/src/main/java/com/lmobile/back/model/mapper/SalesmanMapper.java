package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.SalesmanDto;
import com.lmobile.back.model.entity.Salesman;

public class SalesmanMapper {

  public static SalesmanDto toDto(Salesman salesman) {
    return SalesmanDto.builder()
      .build();
  }

  public static List<SalesmanDto> toDto(List<Salesman> salesmanList) {
    return salesmanList.stream().map((Salesman salesman) -> toDto(salesman)).collect(Collectors.toList());
  }

  public static Salesman toEntity(SalesmanDto salesmanDto) {
    return Salesman.builder()
      .build();
  }

  public static List<Salesman> toEntity(List<SalesmanDto> salesmanDtoList) {
    return salesmanDtoList.stream().map((SalesmanDto salesmanDto) -> toEntity(salesmanDto)).collect(Collectors.toList());
  }
}
