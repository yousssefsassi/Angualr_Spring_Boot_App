package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.RentalOfferDto;
import com.lmobile.back.model.entity.RentalOffer;

public class RentalOfferMapper {

  public static RentalOfferDto toDto(RentalOffer rentalOffer) {
    return RentalOfferDto.builder()
      .build();
  }

  public static List<RentalOfferDto> toDto(List<RentalOffer> rentalOfferList) {
    return rentalOfferList.stream().map((RentalOffer rentalOffer) -> toDto(rentalOffer)).collect(Collectors.toList());
  }

  public static RentalOffer toEntity(RentalOfferDto rentalOfferDto) {
    return RentalOffer.builder()
      .build();
  }

  public static List<RentalOffer> toEntity(List<RentalOfferDto> rentalOfferDtoList) {
    return rentalOfferDtoList.stream().map((RentalOfferDto rentalOfferDto) -> toEntity(rentalOfferDto)).collect(Collectors.toList());
  }
}
