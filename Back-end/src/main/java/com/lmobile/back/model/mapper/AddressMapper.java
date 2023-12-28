package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.AddressDto;
import com.lmobile.back.model.entity.Address;

public class AddressMapper {

  public static AddressDto toDto(Address address) {
    return AddressDto.builder()
      .id(address.getId())
      .street(address.getStreet())
      .city(address.getCity())
      .country(CountryMapper.toDto(address.getCountry()))
      .zipCode(address.getZipCode())
      .build();
  }

  public static List<AddressDto> toDto(List<Address> addressList) {
    return addressList.stream().map((Address address) -> toDto(address)).collect(Collectors.toList());
  }

  public static Address toEntity(AddressDto addressDto) {
    return Address.builder()
      .id(addressDto.getId())
      .street(addressDto.getStreet())
      .city(addressDto.getCity())
      .country(CountryMapper.toEntity(addressDto.getCountry()))
      .zipCode(addressDto.getZipCode())
      .build();
  }

  public static List<Address> toEntity(List<AddressDto> addressDtoList) {
    return addressDtoList.stream().map((AddressDto addressDto) -> toEntity(addressDto)).collect(Collectors.toList());
  }
}
