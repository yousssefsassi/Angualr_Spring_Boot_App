package com.lmobile.back.model.dto;

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
public class RentedDeviceIdDto {
  
  private Long rentalOfferId;
  private Long rentalDeviceId;
}
