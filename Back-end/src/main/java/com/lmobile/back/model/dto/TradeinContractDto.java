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
public class TradeinContractDto {

  private Long id;
  private String reference;
  private Date signedByOwnerAt;
  private Date signedByPartnerAt;
  private Date createdAt;
  
  private TradeinOfferDto tradeinOffer;
}
