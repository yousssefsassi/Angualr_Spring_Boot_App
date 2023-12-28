package com.lmobile.back.model.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "tradein_offer")
@PrimaryKeyJoinColumn(name = "offer_id")
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TradeinOffer extends Offer {
  
  @OneToMany(mappedBy = "tradeinOffer")
  @JsonManagedReference
  private Set<TradedDevice> tradedDeviceList = new HashSet<TradedDevice>();
  
  @ManyToOne
  @JoinColumn(name = "original_tradein_offer_id", nullable = true) // nullable: an original TradeinOffer doesn't have an original TradeinOffer
  private TradeinOffer originalTradeinOffer;

  @OneToMany(mappedBy="originalTradeinOffer", cascade = CascadeType.REMOVE, fetch=FetchType.LAZY) // removing original TradeinOffer should cause removing its proposed TradeinOffers
  private Set<TradeinOffer> proposedTradinOfferList = new HashSet<TradeinOffer>();
}
