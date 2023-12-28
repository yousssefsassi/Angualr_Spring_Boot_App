package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.RentalContractDto;
import com.lmobile.back.model.entity.RentalContract;

public class RentalContractMapper {

  public static RentalContractDto toDto(RentalContract rentalContract) {
    return RentalContractDto.builder()
      .build();
  }

  public static List<RentalContractDto> toDto(List<RentalContract> rentalContractList) {
    return rentalContractList.stream().map((RentalContract rentalContract) -> toDto(rentalContract)).collect(Collectors.toList());
  }

  public static RentalContract toEntity(RentalContractDto rentalContractDto) {
    return RentalContract.builder()
      .build();
  }

  public static List<RentalContract> toEntity(List<RentalContractDto> rentalContractDtoList) {
    return rentalContractDtoList.stream().map((RentalContractDto rentalContractDto) -> toEntity(rentalContractDto)).collect(Collectors.toList());
  }
}
