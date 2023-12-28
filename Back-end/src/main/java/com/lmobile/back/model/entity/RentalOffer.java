package com.lmobile.back.model.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
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
@Table(name = "rental_offer")
@PrimaryKeyJoinColumn(name = "offer_id")
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RentalOffer extends Offer {
  
  @OneToMany(mappedBy = "rentalOffer")
  //@JsonManagedReference
  private Set<RentedDevice> rentedDeviceList = new HashSet<RentedDevice>();
}
