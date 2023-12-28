package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.ContractDto;
import com.lmobile.back.model.entity.Contract;

public class ContractMapper {

  public static ContractDto toDto(Contract contract) {
    return ContractDto.builder()
      .id(contract.getId())
      .reference(contract.getReference())
      .signedByOwnerAt(contract.getSignedByOwnerAt())
      .signedByPartnerAt(contract.getSignedByPartnerAt())
      .createdAt(contract.getCreatedAt())
      .build();
  }

  public static List<ContractDto> toDto(List<Contract> contractList) {
    return contractList.stream().map((Contract contract) -> toDto(contract)).collect(Collectors.toList());
  }

  public static Contract toEntity(ContractDto contractDto) {
    return Contract.builder()
      .id(contractDto.getId())
      .reference(contractDto.getReference())
      .signedByOwnerAt(contractDto.getSignedByOwnerAt())
      .signedByPartnerAt(contractDto.getSignedByPartnerAt())
      .createdAt(contractDto.getCreatedAt())
      .build();
  }

  public static List<Contract> toEntity(List<ContractDto> contractDtoList) {
    return contractDtoList.stream().map((ContractDto contractDto) -> toEntity(contractDto)).collect(Collectors.toList());
  }
}
