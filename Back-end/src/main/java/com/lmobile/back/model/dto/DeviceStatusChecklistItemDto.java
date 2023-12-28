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
public class DeviceStatusChecklistItemDto {

  private Long id;
  private String name;
  private String descriptionBeforeRent;
  private String descriptionAfterRent;
  private String pictureBeforeRent;
  private String pictureAfterRent;
  private Boolean hasChanged;
  private String changeDescription;
  private Date createdAt;
  private DeviceStatusChecklistDto deviceStatusChecklist;
}
