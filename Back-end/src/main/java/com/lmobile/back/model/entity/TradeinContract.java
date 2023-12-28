package com.lmobile.back.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "tradein_contract")
@PrimaryKeyJoinColumn(name = "contract_id")
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TradeinContract extends Contract {

  @OneToOne
  @JoinColumn(name = "tradein_offer_id")
  private TradeinOffer tradeinOffer;
}
