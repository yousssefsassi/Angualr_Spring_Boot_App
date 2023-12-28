package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.TradeinOfferDto;
import com.lmobile.back.model.entity.TradeinOffer;

public class TradeinOfferMapper {

  public static TradeinOfferDto toDto(TradeinOffer tradeinOffer) {
    return TradeinOfferDto.builder()
      .build();
  }

  public static List<TradeinOfferDto> toDto(List<TradeinOffer> tradeinOfferList) {
    return tradeinOfferList.stream().map((TradeinOffer tradeinOffer) -> toDto(tradeinOffer)).collect(Collectors.toList());
  }

  public static TradeinOffer toEntity(TradeinOfferDto tradeinOfferDto) {
    return TradeinOffer.builder()
      .build();
  }

  public static List<TradeinOffer> toEntity(List<TradeinOfferDto> tradeinOfferDtoList) {
    return tradeinOfferDtoList.stream().map((TradeinOfferDto tradeinOfferDto) -> toEntity(tradeinOfferDto)).collect(Collectors.toList());
  }
}
