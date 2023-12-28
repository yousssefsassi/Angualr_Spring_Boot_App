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
public class UsedDeviceDto {

  private Long id;
  private String description;
  private String brand;
  private String serialNumber;
  private String pictureFilePath;
  private Double purchasePrice;
  private Date yearOfManufacture;
  private Date createdAt;
  private SalesmanDto salesman;
  private DeviceTypeDto deviceType;
  
  private Date usedSince;
  private String currentState;
  private List<UsedDeviceFixDto> usedDeviceFixList;
  private List<TradedDeviceDto> tradedDeviceList;
}
