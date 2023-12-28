package com.lmobile.back.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lmobile.back.model.dto.AdminDto;
import com.lmobile.back.model.entity.Admin;

public class AdminMapper {

  public static AdminDto toDto(Admin admin) {
    return AdminDto.builder()
      .id(admin.getId())
      .firstName(admin.getFirstName())
      .lastName(admin.getLastName())
      .email(admin.getEmail())
      .profilePhotoFilePath(admin.getProfilePhotoFilePath())
      .address(AddressMapper.toDto(admin.getAddress()))
      .createdAt(admin.getCreatedAt())
      .build();
  }

  public static List<AdminDto> toDto(List<Admin> adminList) {
    return adminList.stream().map((Admin admin) -> toDto(admin)).collect(Collectors.toList());
  }

  public static Admin toEntity(AdminDto adminDto) {
    return Admin.builder()
      .id(adminDto.getId())
      .firstName(adminDto.getFirstName())
      .lastName(adminDto.getLastName())
      .email(adminDto.getEmail())
      .profilePhotoFilePath(adminDto.getProfilePhotoFilePath())
      .address(AddressMapper.toEntity(adminDto.getAddress()))
      .createdAt(adminDto.getCreatedAt())
      .build();
  }

  public static List<Admin> toEntity(List<AdminDto> adminDtoList) {
    return adminDtoList.stream().map((AdminDto adminDto) -> toEntity(adminDto)).collect(Collectors.toList());
  }
}
