package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.CountryDto;
import com.lmobile.back.model.entity.Country;

public class CountryMapper {

  public static CountryDto toDto(Country country) {
    return CountryDto.builder()
      .id(country.getId())
      .name(country.getName())
      .build();
  }

  public static List<CountryDto> toDto(List<Country> countryList) {
    return countryList.stream().map((Country country) -> toDto(country)).collect(Collectors.toList());
  }

  public static Country toEntity(CountryDto countryDto) {
    return Country.builder()
      .id(countryDto.getId())
      .name(countryDto.getName())
      .build();
  }

  public static List<Country> toEntity(List<CountryDto> countryDtoList) {
    return countryDtoList.stream().map((CountryDto countryDto) -> toEntity(countryDto)).collect(Collectors.toList());
  }
}
