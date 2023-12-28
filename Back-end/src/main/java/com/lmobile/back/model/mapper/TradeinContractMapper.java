package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.TradeinContractDto;
import com.lmobile.back.model.entity.TradeinContract;

public class TradeinContractMapper {

  public static TradeinContractDto toDto(TradeinContract tradeinContract) {
    return TradeinContractDto.builder()
      .build();
  }

  public static List<TradeinContractDto> toDto(List<TradeinContract> tradeinContractList) {
    return tradeinContractList.stream().map((TradeinContract tradeinContract) -> toDto(tradeinContract)).collect(Collectors.toList());
  }

  public static TradeinContract toEntity(TradeinContractDto tradeinContractDto) {
    return TradeinContract.builder()
      .build();
  }

  public static List<TradeinContract> toEntity(List<TradeinContractDto> tradeinContractDtoList) {
    return tradeinContractDtoList.stream().map((TradeinContractDto tradeinContractDto) -> toEntity(tradeinContractDto)).collect(Collectors.toList());
  }
}
