package com.lmobile.back.model.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SalesmanDto {
  
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String profilePhotoFilePath;
  private Date createdAt;
  private AddressDto address;

  private BusinessTypeDto businessType;
  private List<DeviceDto> deviceList;
}
