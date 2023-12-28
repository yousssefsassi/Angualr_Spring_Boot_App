package com.lmobile.back.model.dto;

import java.util.Date;

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
public class RentedDeviceDto {

  private RentedDeviceIdDto id;
  private Date createdAt;
  private RentalOfferDto rentalOffer;
  private RentalDeviceDto rentalDevice;
  private DeviceStatusChecklistDto deviceStatusChecklist;
}
