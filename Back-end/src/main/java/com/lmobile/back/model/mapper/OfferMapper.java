package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.OfferDto;
import com.lmobile.back.model.entity.Offer;

public class OfferMapper {

  public static OfferDto toDto(Offer offer) {
    return OfferDto.builder()
      .build();
  }

  public static List<OfferDto> toDto(List<Offer> offerList) {
    return offerList.stream().map((Offer offer) -> toDto(offer)).collect(Collectors.toList());
  }

  public static Offer toEntity(OfferDto offerDto) {
    return Offer.builder()
      .build();
  }

  public static List<Offer> toEntity(List<OfferDto> offerDtoList) {
    return offerDtoList.stream().map((OfferDto offerDto) -> toEntity(offerDto)).collect(Collectors.toList());
  }
}
