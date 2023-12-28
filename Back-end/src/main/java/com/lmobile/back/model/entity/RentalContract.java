package com.lmobile.back.model.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "rental_contract")
@PrimaryKeyJoinColumn(name = "contract_id")
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RentalContract extends Contract {
  
  @Column(name = "valid_from")
  private Date validFrom;
  
  @Column(name = "valid_to")
  private Date validTo;
  
  @Column(name = "price")
  private Double price;

  @OneToOne
  @JoinColumn(name = "rental_offer_id")
  private RentalOffer rentalOffer;
  @ManyToMany
  private List<RentalDevice> rentalDevices;
}
