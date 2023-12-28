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
public class RentalOfferDto {

  private Long id;
  private Date createdAt;

  private List<RentedDeviceDto> rentedDeviceList;
}
